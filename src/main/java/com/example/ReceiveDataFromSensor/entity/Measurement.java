package com.example.ReceiveDataFromSensor.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.springframework.data.annotation.Id;
import java.time.LocalDateTime;
@Data

public class Measurement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double temperature;
    private double humidity;
    private double pressure;


    @ManyToOne
    private Sensor sensor;

    private LocalDateTime timestamp;
}
