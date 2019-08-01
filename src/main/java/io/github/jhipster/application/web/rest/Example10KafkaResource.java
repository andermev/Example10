package io.github.jhipster.application.web.rest;

import io.github.jhipster.application.service.Example10KafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/example-10-kafka")
public class Example10KafkaResource {

    private final Logger log = LoggerFactory.getLogger(Example10KafkaResource.class);

    private Example10KafkaProducer kafkaProducer;

    public Example10KafkaResource(Example10KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        log.debug("REST request to send to Kafka topic the message : {}", message);
        this.kafkaProducer.sendMessage(message);
    }
}
