package com.enterprise.devops.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import jakarta.annotation.PostConstruct;

@Configuration
public class LoggingConfig {

    private static final Logger logger =
            LoggerFactory.getLogger(LoggingConfig.class);

    @PostConstruct
    public void init() {

        logger.info("Enterprise DevOps Monitoring Platform logging initialized");
    }
}
