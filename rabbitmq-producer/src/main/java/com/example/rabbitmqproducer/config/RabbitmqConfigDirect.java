/*
package com.example.rabbitmqproducer.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitmqConfigDirect {


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
     * 声明一个Direct类型的交换机*//*




    @Bean
    DirectExchange  directExchange() {
        return new DirectExchange("myDirectExchange");
    }

    @Bean
    public Binding bindingExchangeA() {
        return BindingBuilder.bind(testQueue()).to(directExchange()).with("zhh.direct.routingKey.a");
    }

    @Bean
    public Binding bindingExchangeB() {
        return BindingBuilder.bind(testQueue2()).to(directExchange()).with("zhh.direct.routingKey.b");
    }

}
*/
