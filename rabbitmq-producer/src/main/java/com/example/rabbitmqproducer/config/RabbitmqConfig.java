package com.example.rabbitmqproducer.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitmqConfig {


/**
     * 创建队列*/


    @Bean
    public Queue testQueue() {
        return new Queue("test_queue");
    }

    @Bean
    public Queue testQueue2() {
        return new Queue("test_queue2");
    }

}
