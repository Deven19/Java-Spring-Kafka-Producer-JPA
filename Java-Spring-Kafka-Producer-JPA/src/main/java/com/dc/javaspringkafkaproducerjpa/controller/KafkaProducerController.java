package com.dc.javaspringkafkaproducerjpa.controller;

import com.dc.javaspringkafkaproducerjpa.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class KafkaProducerController {

    @Autowired
    private KafkaProducerService producerService;

    @PostMapping("/publish")
    public String sendMessageToKafkaTopic(@RequestBody String message) {
        producerService.sendMessage(message);
        return "Message sent to Kafka topic";
    }
}
