package com.enterprise.devops.service;

import com.enterprise.devops.dto.HealthResponse;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class HealthService {

    public HealthResponse getHealthStatus() {

        return new HealthResponse(
                "UP",
                "Enterprise DevOps Monitoring Platform",
                "1.0.0",
                Instant.now()
        );
    }
}
