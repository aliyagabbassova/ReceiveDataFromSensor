package com.example.ReceiveDataFromSensor.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "sensors")
public class Sensor {
    @Column(unique = true)
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
