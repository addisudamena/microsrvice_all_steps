package com.hibenettest.service;

import com.hibenettest.business.Lonly;
import com.hibenettest.business.Person;
import com.hibenettest.business.Relative;
import com.hibenettest.persistance.LPersonDAO;
import com.hibenettest.persistance.PersonDAO;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("customerService")
public class CustomerServiceImp implements CustomerService {
    private PersonDAO personDAO;
    private LPersonDAO lPersonDAO;

    @Autowired
   SessionFactory sessionFactory;

    @Autowired
    public CustomerServiceImp(LPersonDAO lPersonDAO,PersonDAO personDAO){
        this.lPersonDAO=lPersonDAO;
        this.personDAO=personDAO;
    }


    /*Transaction democratization */

    @Transactional(propagation = Propagation.REQUIRED)
    public void sayHelloOld(){
        /*
        Transaction democratization
        */


        Transaction tx=sessionFactory.getCurrentSession().beginTransaction();

        Lonly p = new Lonly();
        p.setName("Mamo megersa");
        lPersonDAO.sayHello(p);
        //sessionFactory.getCurrentSession().persist(p);
        /*
        Query query1 = sessionFactory.getCurrentSession().createQuery("from Person");
        List<Person> people = (List<Person>)query1.list();

        for(Person p1:people){
            System.out.println("--------");
            System.out.println(">"+p1);
        }  */
        sessionFactory.getCurrentSession().persist(p);
        tx.commit();


    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void sayHello(){


        Person p = new Person();
        p.setName("Tessema megersa");
        p.addRelative(new Relative("Brother"));
        p.addRelative(new Relative("Sister"));
        p.addRelative(new Relative("Mother"));
        personDAO.sayHello(p);


    }

    @Transactional(propagation = Propagation.REQUIRED)
    public List<Person> getAll(){
      return personDAO.getAll();


    }

}
