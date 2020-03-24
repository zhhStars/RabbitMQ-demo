package com.example.rabbitmqconsumer2;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "test_queue2")
public class consumer {

    @RabbitHandler
    public void process(String message) {
        System.out.println("2接受消息：" + message);
    }
}
