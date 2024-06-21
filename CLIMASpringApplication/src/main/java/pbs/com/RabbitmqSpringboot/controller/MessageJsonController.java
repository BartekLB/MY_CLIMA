package pbs.com.RabbitmqSpringboot.controller;

import pbs.com.RabbitmqSpringboot.dto.Measure;
import pbs.com.RabbitmqSpringboot.publisher.RabbitMQJsonProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class MessageJsonController
{
    private RabbitMQJsonProducer jsonProducer;

    public MessageJsonController(RabbitMQJsonProducer jsonProducer)
    {
        this.jsonProducer = jsonProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> sendJsonMessage(@RequestBody Measure measure)
    {
        jsonProducer.sendJsonMessage(measure);
        return ResponseEntity.ok("Json message sent to RabbitMQ ...");
    }
}
