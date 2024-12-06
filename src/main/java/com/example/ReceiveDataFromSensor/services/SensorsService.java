package com.example.ReceiveDataFromSensor.services;
import com.example.ReceiveDataFromSensor.SensorAlreadyExistsException;
import com.example.ReceiveDataFromSensor.entity.Sensor;
import com.example.ReceiveDataFromSensor.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SensorsService {
    @Autowired
    private SensorRepository sensorRepository;

    public void registerSensor(String name) {
        if (sensorRepository.existsByName(name)) {
            throw new SensorAlreadyExistsException("Sensor with this name already exists");
        }
        Sensor sensor = new Sensor();
        sensor.setName(name);
        sensorRepository.save(sensor);
    }
}
