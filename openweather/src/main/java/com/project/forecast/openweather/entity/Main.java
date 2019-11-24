package com.project.forecast.openweather.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "temp",
        "pressure",
        "humidity",
        "temp_min",
        "temp_max",
})
public class Main {

    @JsonProperty("temp")
    private String temp;

    @JsonProperty("pressure")
    private double pressure;

    @JsonProperty("humidity")
    private double humidity;

    @JsonProperty("temp_min")
    private double temp_min;

    @JsonProperty("temp")
    private double temp_max;

    @JsonProperty("temp")
    public String getTemp() {
        return temp;
    }

    @JsonProperty("temp")
    public void setTemp(String temp) {
        this.temp = temp;
    }

    @JsonProperty("pressure")
    public double getPressure() {
        return pressure;
    }

    @JsonProperty("pressure")
    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    @JsonProperty("humidity")
    public double getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    @JsonProperty("temp_min")
    public double getTemp_min() {
        return temp_min;
    }

    @JsonProperty("temp_min")
    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min;
    }

    @JsonProperty("temp_max")
    public double getTemp_max() {
        return temp_max;
    }

    @JsonProperty("temp_max")
    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }
}
