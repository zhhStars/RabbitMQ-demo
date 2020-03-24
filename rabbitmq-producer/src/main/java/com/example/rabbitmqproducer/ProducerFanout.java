package com.example.rabbitmqproducer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Date;

@Controller
public class ProducerFanout {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void sendMessage(int i) {
        this.rabbitTemplate.convertAndSend("myFanoutExchange","", "Fanout发送消息" + new Date() + "-----" + i);
    }

}
