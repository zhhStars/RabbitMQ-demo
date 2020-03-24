package com.example.rabbitmqproducer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class Producer {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    /**
     * 发送消息到指定队列
     *
     * 消费者监听队列来接受消息
     */
    public void sendMessage(int i) {
        //①rabbitTemplate.send();                    void    发送的消息必须为Message对象
        //②rabbitTemplate.sendAndReceive();          Object  发送的消息必须为Message对象
        //③rabbitTemplate.convertAndSend();          void    发送的消息任意类型,自动转换Message对象
        //④rabbitTemplate.convertSendAndReceive()    Object  发送的消息任意类型,自动转换Message对象

        //1、3无返回值直接将所有消息发送出去(无时间间隔)，不会因为消费者处理慢而阻塞线程
        //2、4有返回值等待消费者处理完这条消息后才发送下一条(有时间间隔，等待消费者处理完毕) ≠ 消息确认机制


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        //Object test_queue = rabbitTemplate.convertSendAndReceive("test_queue", "hello " + new Date() + "--------" + i);
        rabbitTemplate.convertAndSend("test_queue", "hello " + new Date() + "--------" + i);
        //System.out.println(simpleDateFormat.format(new Date()) + test_queue.toString());
        System.out.println(simpleDateFormat.format(new Date()));
    }

    public void sendMessage2(int i) {
        rabbitTemplate.convertAndSend("test_queue2", "hello " + new Date()  + "--------" + i);
    }

}
