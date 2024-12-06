package com.example.ReceiveDataFromSensor.repository;

import com.example.ReceiveDataFromSensor.entity.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorRepository extends JpaRepository <Sensor, Long> {
    Sensor findByName(String name);
}
