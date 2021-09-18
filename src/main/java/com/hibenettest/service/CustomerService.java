package com.hibenettest.service;

import com.hibenettest.business.Person;
import com.hibenettest.persistance.PersonDAO;

import java.util.List;

public interface CustomerService {
    public void sayHello();
    public List<Person> getAll();

}
