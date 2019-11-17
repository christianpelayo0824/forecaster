package com.project.forecast.web.controller.realtime;


import com.project.commons.helper.RestTemplateHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/openWeather")
public class OpenWeatherController {

    private RestTemplate restTemplate = new RestTemplate();

    @RequestMapping(value = "/getRealtimeWeatherByCityId/{cityId}", method = RequestMethod.GET)
    public ResponseEntity<String> getWeatherId(@PathVariable String cityId) {
        String url = "https://api.openweathermap.org/data/2.5/weather?id=" + cityId + "&appid=efb8f2498a61438a536c9cdb86367be5";
        return restTemplate.getForEntity(url, String.class);
    }
}

