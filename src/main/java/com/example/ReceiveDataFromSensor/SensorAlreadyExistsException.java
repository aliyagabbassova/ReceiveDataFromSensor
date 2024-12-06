package com.example.ReceiveDataFromSensor;

public class SensorAlreadyExistsException extends RuntimeException  {

    public SensorAlreadyExistsException(String message) {
        super(message);
    }
}
