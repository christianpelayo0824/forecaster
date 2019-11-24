package com.project.forecast.openweather.entity;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "main",
        "description",
        "icon",
})
public class Weather {

    @JsonProperty("id")
    private int id;

    @JsonProperty("main")
    private int main;

    @JsonProperty("description")
    private int description;

    @JsonProperty("icon")
    private int icon;

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("main")
    public int getMain() {
        return main;
    }

    @JsonProperty("main")
    public void setMain(int main) {
        this.main = main;
    }

    @JsonProperty("description")
    public int getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(int description) {
        this.description = description;
    }

    @JsonProperty("icon")
    public int getIcon() {
        return icon;
    }

    @JsonProperty("icon")
    public void setIcon(int icon) {
        this.icon = icon;
    }
}
