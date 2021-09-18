//package com.hibenettest;
//
//import org.hibernate.*;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;
//
//import java.util.List;
//
//public class App {
//    private static SessionFactory sessionFactory;
//
//
//    static {
//        // This step will read hibernate.cfg.xml and prepare hibernate for use
//        Configuration configuration = new Configuration();
//        configuration.configure("hibernate.cfg.xml");
//        ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
//        sessionFactory = configuration.buildSessionFactory(sr);
//    }
//    public static void main(String[] args) {
//        Session session = null;
//        Transaction tx = null;
//
//
//        try {
//            session = sessionFactory.openSession();
//            tx = session.beginTransaction();
//            Person p=new Person();
//            p.setName("Mamo megersa");
//            p.addRelative(new Relative("Brother"));
//            p.addRelative(new Relative("Sister"));
//            p.addRelative(new Relative("Mother"));
//            //Person p3 = (Person) session.get(Person.class, 1L);
//            //p3.setName("Explicitly Updated");
//            session.persist(p);
//            tx.commit();
//
//            session = sessionFactory.openSession();
//            tx = session.beginTransaction();
//
//            // 1. retrieve the list of first 50 countries using a Hibernate query
//            Query query1 = session.createQuery("from Person");
//            List list1 = query1.list();
//            System.out.println("\nList of first 50 countries:\n");
//            for (Object o : list1) {
//                System.out.println("--->"+o);
//            }
//
//            tx.commit();
///*
//
//            session = sessionFactory.openSession();
//            tx = session.beginTransaction();
//
//            session.update(p);
//
//            // retrieve all persons
//            List<Person> personList = session.createQuery("from Person").list();
//            for (Person p1 : personList) {
//                System.out.println(p1);
//            }
//            tx.commit();*/
//        } catch (HibernateException e) {
//            tx.rollback();
//            e.printStackTrace();
//        } finally {
//            if (session != null) {
//                session.close();
//            }
//        }
//    }}
