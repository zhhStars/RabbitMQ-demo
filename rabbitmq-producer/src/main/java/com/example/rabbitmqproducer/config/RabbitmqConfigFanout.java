/*
package com.example.rabbitmqproducer.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitmqConfigFanout {

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
     * 声明一个Fanout类型的交换机*//*




    @Bean
    FanoutExchange fanoutExchange() {
        return new FanoutExchange("myFanoutExchange");
    }

*/
/**
     * 绑定队列到交换机*//*




    @Bean
    Binding bindingExchangeA(Queue testQueue, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(testQueue).to(fanoutExchange);
    }

    @Bean
    Binding bindingExchangeB(Queue testQueue2, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(testQueue2).to(fanoutExchange);
    }

}
*/
