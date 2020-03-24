/*
package com.example.rabbitmqproducer.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitmqConfigTopic {

*/
/**
     * 创建队列*//*



    @Bean
    public Queue testQueue() {
        return new Queue("test_queue");
    }

    @Bean
    public Queue testQueue2() {
        return new Queue("test_queue2");
    }

*/
/**
     * 声明一个Topic类型的交换机*//*



    @Bean
    TopicExchange exchange() {
        return new TopicExchange("myTopicExchange");
    }

*/
/**
     * 绑定队列到交换机,并且指定routingKey*//*



    @Bean
    Binding bindingExchangeMessage(Queue testQueue, TopicExchange exchange) {
        return BindingBuilder.bind(testQueue).to(exchange).with("topic.message");
    }

    @Bean
    Binding bindingExchangeMessages(Queue testQueue2, TopicExchange exchange) {
        return BindingBuilder.bind(testQueue2).to(exchange).with("topic.#");
    }

}
*/
