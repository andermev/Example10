package io.github.jhipster.application.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Example10KafkaProducer {

    private static final Logger log = LoggerFactory.getLogger(Example10KafkaProducer.class);
    private static final String TOPIC = "topic_example10";

    private KafkaTemplate<String, String> kafkaTemplate;

    public Example10KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        log.info("Producing message to {} : {}", TOPIC, message);
        this.kafkaTemplate.send(TOPIC, message);
    }
}
