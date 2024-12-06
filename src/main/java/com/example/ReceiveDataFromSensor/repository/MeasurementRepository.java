package com.example.ReceiveDataFromSensor.repository;

import com.example.ReceiveDataFromSensor.entity.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MeasurementRepository extends JpaRepository<Measurement, Long> {
    List<Measurement> findAll();
    long countByRainingTrue();
}
