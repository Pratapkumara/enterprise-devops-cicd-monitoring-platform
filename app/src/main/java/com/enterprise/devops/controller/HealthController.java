package com.enterprise.devops.controller;

import com.enterprise.devops.dto.HealthResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class HealthController {

    @GetMapping("/api/v1/health")
    public ResponseEntity<HealthResponse> health() {

        HealthResponse response = new HealthResponse(
                "SUCCESS",
                "enterprise-devops-cicd-monitoring-platform",
                "1.0.0",
                Instant.now()
        );

        return ResponseEntity.ok(response);
    }
}
