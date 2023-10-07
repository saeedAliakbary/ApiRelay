package com.relay.apirelay.controller;


import com.relay.apirelay.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private final WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/{city}")
    public String getWeather(@PathVariable String city) {
        return weatherService.getWeather(city);
    }

    @PostMapping
    public String postWeather(@RequestBody WeatherRequest request) {
        return weatherService.postWeather(request.getName(), request.getLat(), request.getLon());
    }
}