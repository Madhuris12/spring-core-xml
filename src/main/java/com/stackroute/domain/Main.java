package com.stackroute.domain;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("propertybeans.xml");
        Movie movie=(Movie)applicationContext1.getBean("movie");
        System.out.println(movie.toString());



    }
}
