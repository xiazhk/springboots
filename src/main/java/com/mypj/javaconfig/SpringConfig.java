package com.mypj.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mypj.dao.UserDao;

@Configuration
@ComponentScan(basePackages={"com.mypj"})
public class SpringConfig {

	@Bean // 通过该注解来表明是一个Bean对象，相当于xml中的<bean>
    public UserDao getUserDao(){
        return new UserDao(); // 直接new对象做演示
    }
}
