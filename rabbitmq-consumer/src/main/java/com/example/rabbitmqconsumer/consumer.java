package com.example.rabbitmqconsumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "test_queue")
public class consumer {

    @RabbitHandler
    public void process(String message) throws InterruptedException {
        System.out.println("1接受消息：" + message);
        //Thread.sleep(300);
        //return true;
    }
}
