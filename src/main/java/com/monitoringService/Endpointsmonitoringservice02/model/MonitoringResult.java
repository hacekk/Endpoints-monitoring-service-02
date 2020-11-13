package com.monitoringService.Endpointsmonitoringservice02.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MonitoringResult {

    private int id;
    private LocalDateTime dateOfCheck;
    private int httpStatusCode;
    private String payload;
    private MonitoredEndpoint monitoredEndpoint;

    public MonitoringResult(int id, LocalDateTime dateOfCheck, int httpStatusCode, String payload, MonitoredEndpoint monitoredEndpoint) {
        this.id = id;
        this.dateOfCheck = dateOfCheck;
        this.httpStatusCode = httpStatusCode;
        this.payload = payload;
        this.monitoredEndpoint = monitoredEndpoint;
    }
}
