package com.hibenettest.controller;

import com.hibenettest.business.Person;
import com.hibenettest.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("api/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("{id}")
    public List<Person> getCustomers(@PathVariable("id") Customer customer){
        return customerService.getAll();
    }
}
