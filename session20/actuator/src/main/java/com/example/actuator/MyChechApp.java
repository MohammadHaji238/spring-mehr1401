package com.example.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class MyChechApp implements HealthIndicator {
    @Override
    public Health health() {
        boolean error=true;
        if (error)
            return Health.down().withDetail("error code",800).build();
        return Health.up().build();
    }
}
