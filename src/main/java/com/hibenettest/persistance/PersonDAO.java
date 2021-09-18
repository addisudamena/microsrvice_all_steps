package com.hibenettest.persistance;

import com.hibenettest.business.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PersonDAO {
    public void sayHello(Person p);

    List<Person> getAll();
}
