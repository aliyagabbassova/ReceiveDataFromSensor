package com.example.ReceiveDataFromSensor.services;

import com.example.ReceiveDataFromSensor.dto.MeasurementDto;
import com.example.ReceiveDataFromSensor.entity.Sensor;
import com.example.ReceiveDataFromSensor.repository.MeasurementRepository;
import com.example.ReceiveDataFromSensor.repository.SensorRepository;
import io.micrometer.core.instrument.Measurement;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class MeasurementService {
    @Autowired
    private MeasurementRepository measurementRepository;
    @Autowired
    private SensorRepository sensorRepository;

    public void addMeasurement(MeasurementDto measurementDto) {
        Sensor sensor = sensorRepository.findByName(measurementDto.getSensor().getName())
                .orElseThrow(() -> new SensorNotFoundException("Sensor not found"));
        Measurement measurement = new Measurement();
        measurement.setPressure(measurementDto.getPressure());
        measurement.setHumidity(measurementDto.getHumidity());
        measurement.setTemperature(sensor);
        measurement.setTimestamp(LocalDateTime.now());
        measurementRepository.save(measurement);
    }
}

