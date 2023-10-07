package com.relay.apirelay.service;

import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    public String getWeather(String city) {
        // Business logic to handle the GET request
        return "Weather information for " + city;
    }

    public String postWeather(String name, double lat, double lon) {
        // Business logic to handle the POST request
        return "Weather information for " + name + " at lat: " + lat + ", lon: " + lon;
    }
}