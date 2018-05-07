package com.mypj.app;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mypj.javaconfig.SpringConfig;
import com.mypj.model.User;
import com.mypj.service.UserService;

public class AppTest {

	public static void main(String[] args) {
		// 通过Java配置来实例化Spring容器
        @SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        
        // 在Spring容器中获取Bean对象
        UserService userService = context.getBean(UserService.class);
        
        // 调用对象中的方法
        List<User> list = userService.queryUserList();
        for (User user : list) {
            System.out.println(user.getUsername() + ", " + user.getPassword() + ", " + user.getPassword());
        }
        
        // 销毁该容器
        context.destroy();
	}
}
