package com.springboot.amqp.service;

import com.springboot.amqp.bean.Book;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @RabbitListener(queues = {"atguigu.news"})  //开启监听队列
    public void receive(Book book){
        System.out.println("收到消息："+book);
    }

    @RabbitListener(queues = "atguigu")
    public void receive1(Message message){
        System.out.println(message.getBody());
        System.out.println(message.getMessageProperties());
    }
}
