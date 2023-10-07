package com.relay.apirelay;

import com.relay.apirelay.service.WeatherService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ApiRelayApplicationTests {


    @Test
    void testGetWeather() {
        WeatherService weatherService = new WeatherService();
        String weather = weatherService.getWeather("Tehran");
        assertEquals("Weather information for Tehran", weather);
    }

    @Test
    void testPostWeather() {
        WeatherService weatherService = new WeatherService();
        String weather = weatherService.postWeather("Paris", 48.8566, 2.3522);
        assertEquals("Weather information for Paris at lat: 48.8566, lon: 2.3522", weather);
    }

}
