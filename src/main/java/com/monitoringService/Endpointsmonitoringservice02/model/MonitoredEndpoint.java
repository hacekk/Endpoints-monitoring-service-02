package com.monitoringService.Endpointsmonitoringservice02.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MonitoredEndpoint {

    private int id;
    private String name;
    private String url;
    private LocalDateTime dateOfCreation;
    private LocalDateTime dateOfCheck;
    private int monitoredInterval;
    private User owner;

    public MonitoredEndpoint( String name, String url, LocalDateTime dateOfCreation, LocalDateTime dateOfCheck, int monitoredInterval, User owner) {

        this.name = name;
        this.url = url;
        this.dateOfCreation = dateOfCreation;
        this.dateOfCheck = dateOfCheck;
        this.monitoredInterval = monitoredInterval;
        this.owner = owner;
    }
}
