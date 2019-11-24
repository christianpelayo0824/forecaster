package com.project.forecast.openweather.service;


public interface IWeatherService<T> {

    public T getDailyForecast(String city) throws Exception;
}
