package com.mypj.app;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication(exclude={RedisAutoConfiguration.class})
@Configuration
@PropertySource(value={"classpath:com/mypj/config/application.properties"},
ignoreResourceNotFound=true)//读取外部资源文件,找不到文件将其忽略
//@ImportResource({"classpath:*.xml"})//导入外部xml配置文件
public class SpringBootApp {

	@RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello world！";
    }
    
    public static void main(String[] args) {
    	
    	//关闭控制太打印信息
    	SpringApplication sapp = new SpringApplication(SpringBootApp.class);
//    	sapp.setBannerMode(Banner.Mode.OFF);
//        SpringApplication.run(SpringBootApp.class, args);
    	sapp.run(args);
    }

}
