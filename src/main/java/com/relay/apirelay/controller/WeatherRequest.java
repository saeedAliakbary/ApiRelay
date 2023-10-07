package com.relay.apirelay.controller;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherRequest {
    private String name;
    private double lat;
    private double lon;
}