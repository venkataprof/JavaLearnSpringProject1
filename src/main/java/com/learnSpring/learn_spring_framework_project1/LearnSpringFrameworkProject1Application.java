package com.learnSpring.learn_spring_framework_project1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkProject1Application {

	public static void main(String[] args) {
		// Launch a spring context

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		//2. Configure the things that we want Spring to manage @Configuration
		// so in JVM we have created a spring bean which takes care of running spring
		// HelloWorldConfiguration - @Configuration
		// name - @Bean

		// 3. Retrieving beans managed by spring
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2"));
		System.out.println(context.getBean("person3"));
		// to retrieve the custom bean where we used different name you can specify <beanName>.class eg: Address.class
		System.out.println(context.getBean("address1"));

		SpringApplication.run(LearnSpringFrameworkProject1Application.class, args);
	}

}
