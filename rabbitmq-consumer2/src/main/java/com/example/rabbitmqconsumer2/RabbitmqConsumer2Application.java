package com.example.rabbitmqconsumer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class RabbitmqConsumer2Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(RabbitmqConsumer2Application.class, args);
        String[] beans = run.getBeanDefinitionNames();
        Arrays.sort(beans);
        for (String bean : beans) {
            System.out.println(bean);
        }
    }

}
