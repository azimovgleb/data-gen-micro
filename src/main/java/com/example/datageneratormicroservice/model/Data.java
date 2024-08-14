package com.example.datageneratormicroservice.model;

import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@lombok.Data
public class Data {

    private Long sensorId;
    private LocalDateTime timestamp;
    private double measurement;
    private MeasurementType measurementType;

    public enum MeasurementType {

        TEMPERATURE,
        VOLTAGE,
        POWER
    }
}
