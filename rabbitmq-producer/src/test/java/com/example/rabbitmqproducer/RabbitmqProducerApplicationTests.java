package com.example.rabbitmqproducer;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RabbitmqProducerApplicationTests {


    @Autowired
    private Producer producer;
    @Autowired
    private ProducerDirect producerDirect;
    @Autowired
    private ProducerFanout producerFanout;
    @Autowired
    private ProducerTopic producerTopic;

    @Test
    public void test1(){
        for (int i = 0; i < 20; i++) {
            producer.sendMessage(i);
        }
    }

}
