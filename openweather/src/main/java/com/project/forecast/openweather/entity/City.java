package com.project.forecast.openweather.entity;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "id",
  "cityId",
  "name",
  "coordinate",
})
public class City {

    @JsonProperty("id")
    private int id;

    @JsonProperty("cityId")
    private int cityId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("coordinate")
    private Coordinate coordinate;

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("cityId")
    public int getCityId() {
        return cityId;
    }

    @JsonProperty("cityId")
    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("coordinate")
    public Coordinate getCoordinate() {
        return coordinate;
    }

    @JsonProperty("coordinate")
    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }
}
