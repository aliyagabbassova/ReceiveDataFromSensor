package com.example.ReceiveDataFromSensor.controller;

import com.example.ReceiveDataFromSensor.services.impl.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sensors")
public class SensorController {
    @Autowired
    private SensorService sensorService;



    @PostMapping("/sensors/registration")

}
