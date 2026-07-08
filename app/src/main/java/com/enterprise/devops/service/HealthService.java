package com.enterprise.devops.service;

import com.enterprise.devops.config.ApplicationConfig;
import com.enterprise.devops.dto.HealthResponse;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class HealthService {

    private final ApplicationConfig applicationConfig;

    public HealthService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
    }

    public HealthResponse getHealthStatus() {

        return new HealthResponse(
                "UP",
                applicationConfig.getApplicationName(),
                applicationConfig.getApplicationVersion(),
                Instant.now()
        );
    }
}
