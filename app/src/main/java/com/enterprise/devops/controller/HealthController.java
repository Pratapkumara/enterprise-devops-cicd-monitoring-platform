package com.enterprise.devops.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/api/v1/health")
    public ResponseEntity<Map<String, Object>> health() {

        Map<String, Object> response = new LinkedHashMap<>();

        response.put("status", "SUCCESS");
        response.put("application", "enterprise-devops-cicd-monitoring-platform");
        response.put("version", "1.0.0");
        response.put("timestamp", Instant.now());

        return ResponseEntity.ok(response);
    }
}
