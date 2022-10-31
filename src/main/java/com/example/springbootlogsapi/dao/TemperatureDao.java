package com.example.springbootlogsapi.dao;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootlogsapi.entity.Temperature;

@Repository
public interface TemperatureDao extends JpaRepository<Temperature, BigInteger> {
    
}
