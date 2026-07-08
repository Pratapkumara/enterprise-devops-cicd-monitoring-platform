package com.enterprise.devops.dto;

import java.time.Instant;

public class HealthResponse {

    private String status;
    private String application;
    private String version;
    private Instant timestamp;

    public HealthResponse(String status, String application, String version, Instant timestamp) {
        this.status = status;
        this.application = application;
        this.version = version;
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public String getApplication() {
        return application;
    }

    public String getVersion() {
        return version;
    }

    public Instant getTimestamp() {
        return timestamp;
    }
}
