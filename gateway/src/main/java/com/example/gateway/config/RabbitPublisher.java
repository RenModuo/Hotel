package com.example.gateway.config;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class RabbitPublisher {

    private final RabbitTemplate rabbitTemplate;

    public RabbitPublisher(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void publishActivity(String message) {
        rabbitTemplate.convertAndSend(RabbitConfig.ACTIVITY_QUEUE, message);
    }
}
