package com.atguigu.gulimall.order;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class GulimallOrderApplicationTests {

    @Autowired
    AmqpAdmin amqpAdmin;

    @Test
    public void CreateRabbitMQExchange() {
        // create direct exchange
        DirectExchange directExchange = new DirectExchange("hello-java-exchange", true, false);
        amqpAdmin.declareExchange(directExchange);
        log.info("Exchange create successful", "hello-java-exchange");
    }

    @Test
    public void CreateRabbitMQQueue() {
        // create queue
        Queue queue = new Queue("hello-java-queue", true, false,false);
        amqpAdmin.declareQueue(queue);
        log.info("Queue create successful", "hello-java-queue");
    }

    @Test
    public void CreateBinding() {
        // create binding
        Binding bing = new Binding("hello-java-queue", Binding.DestinationType.QUEUE, "hello-java-exchange", "hello.java", null);
        amqpAdmin.declareBinding(bing);
        log.info("Binding create successful", "hello-java-binding");
    }

}
