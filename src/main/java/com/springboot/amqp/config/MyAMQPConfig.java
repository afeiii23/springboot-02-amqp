package com.springboot.amqp.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAMQPConfig {

    @Bean //自定义消息转换器  把消息转换成json格式
    public MessageConverter messageConverter(){
        return new Jackson2JsonMessageConverter();
    }
}
