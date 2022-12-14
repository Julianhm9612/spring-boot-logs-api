package com.example.springbootlogsapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootlogsapi.entity.Temperature;
import com.example.springbootlogsapi.service.TemperatureService;

@RestController
@RequestMapping("/temperature")
public class TemperatureController {

    @Autowired
    TemperatureService temperatureService;

    @GetMapping(path = "")
    public List<Temperature> getTemperatures() {
        return temperatureService.getTemperatures();
    }

    @PostMapping(path = "")
    public Temperature saveTemperature(@RequestBody Temperature temperature) {
        return temperatureService.saveTemperature(temperature);
    }
    
}
