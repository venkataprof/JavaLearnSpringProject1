package com.learnSpring.learn_spring_framework_project1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {}

record Address(String firstLine, String city) {}
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Sravan";
    }

    @Bean
    public int age() {
        return 35;
    }

    @Bean
    public Person person() {
        var person = new Person("Srinadha", 34, new Address("456 Abc St", "Gilbert"));
        return person;
    }

    // if you want to call the bean with diff name we can pass in the name
    @Bean(name = "address1")
    public Address address() {
        var address = new Address("123 Abc St", "Mesa");
        return address;
    }

    // we can use existing beans to create a new bean
    // using calling the methods like name(), age(), address()
    @Bean
    public Person person2() {
        return new Person(name(), age(), address());
    }

    // another way to call existing bean to create a new bean taking person2 as example to create person3
    // in different way - using parameters
    @Bean
    public Person person3(String name, int age, Address address) {
        return new Person(name, age, address);
    }
}
