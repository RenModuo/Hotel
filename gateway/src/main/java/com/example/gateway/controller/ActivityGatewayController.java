package com.example.gateway.controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ActivityGatewayController {

    @RabbitListener(queues = "gateway.activity")
    public void receiveActivity(String message) {
        System.out.println("[ACTIVITY] " + message);
    }
}
