package com.example.springbootlogsapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootlogsapi.dao.TemperatureDao;
import com.example.springbootlogsapi.entity.Temperature;

@Service
public class TemperatureService {

    @Autowired
    TemperatureDao temperatureDao;

    public List<Temperature> getTemperatures() {
        return temperatureDao.findAll();
    }

    public Temperature saveTemperature(Temperature temperature) {
        return temperatureDao.save(temperature);
    }

}
