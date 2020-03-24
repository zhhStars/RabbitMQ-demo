package com.example.rabbitmqproducer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class ProducerDirect {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    /**
     * 发送消息到指定队列
     *
     * 消费者监听队列来接受消息
     */
    public void sendMessage(int i) {
        rabbitTemplate.convertAndSend("myDirectExchange", "zhh.direct.routingKey.a", "routingKey=zhh.direct.routingKey.a" + "----" + i);
    }

    public void sendMessage2(int i) {
        rabbitTemplate.convertAndSend("myDirectExchange", "zhh.direct.routingKey.b", "routingKey=zhh.direct.routingKey.b"  + "----" + i);
    }

}
