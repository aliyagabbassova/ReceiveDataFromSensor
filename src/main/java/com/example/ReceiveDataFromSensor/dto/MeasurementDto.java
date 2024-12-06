package com.example.ReceiveDataFromSensor.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.Setter;

@Data
@Setter
public class MeasurementDto {
    @NotNull(message = "Value cannot be null")
    @Positive(message = "Value must be positive")
    @NotEmpty
    private double temperature;
    @NotEmpty
    private double humidity;
    @NotEmpty
    private double pressure;
    private SensorDto sensor;
}
