package pbs.com.RabbitmqSpringboot.consumer;

import pbs.com.RabbitmqSpringboot.dto.Measure;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQJsonConsumer
{
    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQJsonConsumer.class);

    @RabbitListener(queues = {"${rabbitmq.queue.json.name}"})
    public void consumeJsonMessage(Measure measure)
    {
        LOGGER.info(String.format("Received JSON message -> %s", measure.toString()));
    }
}
