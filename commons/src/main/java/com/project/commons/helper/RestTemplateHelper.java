package com.project.commons.helper;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Component
public class RestTemplateHelper {

    private static final Logger LOGGER = LoggerFactory.getLogger(RestTemplateHelper.class);

    private RestTemplate restTemplate;
    private ObjectMapper objectMapper;

    /**
     * @param restTemplate
     * @param objectMapper
     */
    public RestTemplateHelper(RestTemplateBuilder restTemplate, ObjectMapper objectMapper) {
        this.restTemplate = restTemplate.build();
        this.objectMapper = objectMapper;
    }

    /**
     * @param clazz
     * @param stringUrl
     * @param urlVariables
     * @param <T>
     * @return
     */
    public <T> T getForEntity(Class<T> clazz, String stringUrl, Object... urlVariables) {
        try {
            ResponseEntity<String> responseEntity = restTemplate.getForEntity(stringUrl, String.class, urlVariables);
            JavaType javaType = objectMapper.getTypeFactory().constructType(clazz);
            return readValue(responseEntity, javaType);
        } catch (HttpClientErrorException e) {
            if (e.getStatusCode() == HttpStatus.NOT_FOUND) {
                LOGGER.info("No data found {}", stringUrl);
            } else {
                LOGGER.info("Rest Client Exception {}", e.getMessage());
            }
        }
        return null;
    }


    // TODO Function to get the RestTemplate in a form of Array.


    /**
     * @param responseEntity
     * @param javaType
     * @param <T>
     * @return
     */
    private <T> T readValue(ResponseEntity<String> responseEntity, JavaType javaType) {
        T responseResult = null;
        if (responseEntity.getStatusCode() == HttpStatus.OK || responseEntity.getStatusCode() == HttpStatus.CREATED) {
            try {
                responseResult = objectMapper.readValue(responseEntity.getBody(), javaType);
            } catch (IOException e) {
                LOGGER.info("Rest Client Exception {}", e.getMessage());
            }
        } else {
            LOGGER.info("No Data found {}", responseEntity.getStatusCode());
        }
        return responseResult;
    }

}
