package com.mudit.spring.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringProjectApplication.class, args);
//		System.out.println(context);
		System.out.println("===> Bean count: " + context.getBeanDefinitionCount());
//		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
	}

}
