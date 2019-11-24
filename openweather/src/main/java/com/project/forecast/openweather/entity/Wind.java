package com.project.forecast.openweather.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "speed",
        "deg"
})
public class Wind {

    @JsonProperty("speed")
    private double speed;

    @JsonProperty("deg")
    private double deg;

    @JsonProperty("speed")
    public double getSpeed() {
        return speed;
    }

    @JsonProperty("speed")
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @JsonProperty("deg")
    public double getDeg() {
        return deg;
    }

    @JsonProperty("deg")
    public void setDeg(double deg) {
        this.deg = deg;
    }
}
