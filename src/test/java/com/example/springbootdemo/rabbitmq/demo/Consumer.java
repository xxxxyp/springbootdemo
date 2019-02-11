package com.example.springbootdemo.rabbitmq.demo;

import com.rabbitmq.client.*;

public class Consumer {

    public static void main(String[] args) throws Exception{
        //1、初始化工厂
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("127.0.0.1");
        connectionFactory.setPort(5672);
        connectionFactory.setUsername("guest");
        connectionFactory.setPassword("guest");
        connectionFactory.setVirtualHost("/");
        //2、获取连接对象
        Connection connection = connectionFactory.newConnection();
        //3、创建一个通道
        Channel channel = connection.createChannel();
        //4、声明一个队列
        channel.queueDeclare("demo1",true,false,false,null);
        //5、创建消费者
        // 5.创建消费者
//        QueueingConsumer queueingConsumer = new QueueingConsumer(channel);
        // 6 设置channel
//        channel.basicConsume(queueName, true, queueingConsumer);
//        while (true) {
//            //nextDelivery() 一个有参数，一个无参数 ， 无参数会一直阻塞
//            // 7 获取消息
//            QueueingConsumer.Delivery delivery = queueingConsumer.nextDelivery();
//            String msg = new String(delivery.getBody());
//            System.out.println("消费端: " + msg);
//            Envelope envelope = delivery.getEnvelope();
//        }
    }
}
