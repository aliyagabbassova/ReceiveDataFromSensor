package com.example.ReceiveDataFromSensor.services.impl;

import com.example.ReceiveDataFromSensor.dto.SensorDto;
import com.example.ReceiveDataFromSensor.entity.Sensor;

import java.util.List;

public interface SensorService {
    void saveSensorDto(SensorDto sensorDto);

    Sensor findByName(String name);

    List<SensorDto> findAllSensors();

    void saveSensor(Sensor sensor);
}
