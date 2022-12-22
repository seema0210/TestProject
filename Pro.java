package com.anudip;
import java.util.List;
import java.util.ArrayList;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class App 
{
    public static void main( String[] args )
    {
    
        System.out.println("Project Started");
        Configuration cfg=new Configuration().configure().addAnnotatedClass(Teacher.class);
        Configuration cfg1=new Configuration().configure().addAnnotatedClass(Course.class);
        cfg.configure("hibernate.cfg.xml");
        SessionFactory fac=cfg.buildSessionFactory();
        Session ss=fac.openSession();
        Transaction t=ss.beginTransaction();
        
        Teacher tc=new Teacher();
        tc.setName("Tanmay");
        tc.setDept("ITI");


        Course c1=new Course();
        c1.setCname("JavaScript Programming");
        c1.setCduration("8 months");
        Course c2=new Course();
        c2.setCname("React Js Programming");
        c2.setCduration("5 months");

        Course c3=new Course();
        c3.setCname("HTML5 Programming");
        c3.setCduration("1 months");

        List<Course> cl=new ArrayList<>();// list creation
        cl.add(c1);
        cl.add(c2);
        cl.add(c3);

        
        tc.setCourse(cl);
        c1.setTeacher(tc);
        c2.setTeacher(tc);
        c3.setTeacher(tc);
        
        ss.save(tc);
        ss.save(c1);
        ss.save(c2);
        ss.save(c3);
       
        t.commit();
        ss.close();
        
    }
}