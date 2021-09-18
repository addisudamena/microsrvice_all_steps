package com.hibenettest;

import com.hibenettest.business.Person;
import com.hibenettest.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Applicatoin {
    public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");

    CustomerService customerService = context.getBean("customerService", CustomerService.class);
    customerService.sayHello();


        List<Person> person=customerService.getAll();
        for(Person p:person){
            System.out.println("--------");
            System.out.println(">"+p);
        }
    }
}
