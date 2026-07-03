package com.example.gateway.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    public static final String ACTIVITY_QUEUE = "gateway.activity";

    @Bean
    public Queue activityQueue() {
        return new Queue(ACTIVITY_QUEUE, true);
    }
}
