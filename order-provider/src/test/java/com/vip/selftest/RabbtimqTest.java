package com.vip.selftest;



import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.amqp.rabbit.connection.ConnectionFactoryUtils;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

@ContextConfiguration(locations = { "classpath:META-INF/spring/spring-rabbitmq.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class RabbtimqTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    RabbitTemplate rabbitTemplate;
    @Test
    public void sendQueue() throws InterruptedException, IOException {
        // convertAndSend 将Java对象转换为消息发送至匹配key的交换机中Exchange
        rabbitTemplate.convertAndSend("j");
        Thread.sleep(1000);
        // 获取到连接
       /* Connection connection = ConnectionFactoryUtils.;
        // 获取通道
        Channel channel = connection.createChannel();
        // 声明exchange，指定类型为topic
        channel.exchangeDeclare("EXCHANGE_NAME", "topic");
        // 消息内容
        String message = "新增商品 : id = 13421";
        // 发送消息，并且指定routing key 为：insert ,代表新增商品
        channel.basicPublish("EXCHANGE_NAME", "item.insert", null, message.getBytes());
        System.out.println(" [后台系统：] Sent '" + message + "'");

        channel.close();
        connection.close();*/
    }
}
