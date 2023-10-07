package com.relay.apirelay;



import com.relay.apirelay.controller.WeatherController;
import com.relay.apirelay.controller.WeatherRequest;
import com.relay.apirelay.service.WeatherService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
class WeatherControllerTest {

    @Mock
    private WeatherService weatherService;

    @InjectMocks
    private WeatherController weatherController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetWeather() {
        when(weatherService.getWeather("Tehran")).thenReturn("Weather information for Tehran");
        String response = weatherController.getWeather("Tehran");
        assertEquals("Weather information for Tehran", response);
    }

    @Test
    void testPostWeather() {
        WeatherRequest request = new WeatherRequest("Paris", 48.8566, 2.3522);
        when(weatherService.postWeather("Paris", 48.8566, 2.3522))
                .thenReturn("Weather information for Paris at lat: 48.8566, lon: 2.3522");
        String response = weatherController.postWeather(request);
        assertEquals("Weather information for Paris at lat: 48.8566, lon: 2.3522", response);
    }
}