package com.hibenettest.persistance;

import com.hibenettest.business.Person;
import com.hibenettest.business.Relative;
import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(propagation = Propagation.MANDATORY)
public class PersonDAOImpl implements PersonDAO {

   //  //after integration
    private final SessionFactory sessionFactory;

    @Autowired
    public PersonDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


/* Integration
    static {
        // This step will read hibernate.cfg.xml and prepare hibernate for use
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(sr);
    }
Integration */


    public List<Person> getAll(){
        Query query1 = sessionFactory.getCurrentSession().createQuery("from Person");
        List<Person> people = (List<Person>)query1.list();
        return people;

    }
    public void sayHello(Person p) {
        sessionFactory.getCurrentSession().persist(p);
    }
/* Democratizaton
        try {
            //I session = sessionFactory.openSession();
            session = sessionFactory.getCurrentSession();
            tx = session.beginTransaction();
            Person p=new Person();
            p.setName("Mamo megersa");
            p.addRelative(new Relative("Brother"));
            p.addRelative(new Relative("Sister"));
            p.addRelative(new Relative("Mother"));
            session.persist(p);
            tx.commit();

            session = sessionFactory.openSession();
            tx = session.beginTransaction();

            // 1. retrieve the list of first 50 countries using a Hibernate query
            Query query1 = session.createQuery("from Person");
            List list1 = query1.list();
            System.out.println("\nList of All persons:\n");
            for (Object o : list1) {
                System.out.println("--->"+o);
            }

            tx.commit();





        } catch (HibernateException e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
            */



}
