package com.example.rabbitmqproducer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ProducerTopic {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    /**
     * 发送消息到指定交换机；
     *
     * 交换机通过routingKey的值来模糊匹配将这条消息发送给匹配到的队列，#表示0个或若干个关键字，*表示一个关键字
     *
     * 消费者监听队列来接受消息
     */
    public void sendMessage(int i) {
        /**
         *         队列test_queue绑定交换机myexchange时指定的routingKey是 topic.message
         *         队列test_queue2绑定交换机myexchange时指定的routingKey是 topic.#
         *
         *         所以该消息会被这2个队列一起接受到
         */
        rabbitTemplate.convertAndSend("myTopicExchange","topic.message","一条消息routingKey=topic.message"  + "--------" + i);
        // （交换机名称，routingKey，消息内容）
    }

    /**
     *         队列test_queue绑定交换机myexchange时指定的routingKey是 topic.message
     *         队列test_queue2绑定交换机myexchange时指定的routingKey是 topic.#
     *
     *         所以该消息会被test_queue2这个队列接受到
     */
    public void sendMessage2(int i) {
        rabbitTemplate.convertAndSend("myTopicExchange","topic.hanghang","一条消息routingKey=topic.hanghang"  + "--------" + i);
    }

}
