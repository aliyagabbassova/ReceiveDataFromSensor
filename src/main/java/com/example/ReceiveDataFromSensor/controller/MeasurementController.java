package com.example.ReceiveDataFromSensor.controller;

import com.example.ReceiveDataFromSensor.dto.MeasurementDto;
import com.example.ReceiveDataFromSensor.services.MeasurementService;
import io.micrometer.core.instrument.Measurement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class MeasurementController {
    @Autowired
    private MeasurementService measurementService;

    @PostMapping("/add")
    public ResponseEntity<?> addMeasurement(@RequestBody MeasurementDto measurementDto) {
        measurementService.addMeasurement(measurementDto);
        return ResponseEntity.ok(new MessageResponse("Measurement added successfully"));
    }

    @GetMapping
    public List<Measurement> getAllMeasurements() {
        return measurementService.getAllMeasurements();
    }


}
