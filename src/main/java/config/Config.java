package hao.dao.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import hao.dao.pojo.User;

@Component
public class Config {

    @Bean
    public User getUser(){
        return new User();
    }
}
