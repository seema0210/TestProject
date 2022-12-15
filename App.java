package com.anudip;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
	public static String addemp(Session ss,Transaction t)
	{
		//object creation
		Employee emp=new Employee();
		//scanner class for user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee Id :");  // set id
		int eid=sc.nextInt();
		emp.setEid(eid);
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Employee Name :");  // set name
		String ename=sc1.nextLine();
		emp.setEname(ename);
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the Employee Deparment :");  // emp deparment
		String edept=sc2.nextLine();
		emp.setEdept(edept);
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter the Employee Salary :");  // set salary
		int esalary=sc3.nextInt();
		emp.setEsalary(esalary);
		
		Address ad=new Address();
		Scanner sc4=new Scanner(System.in);
		System.out.println("Enter the Employee Home Name :");  // set home name
		String hname=sc2.nextLine();
		ad.setHname(hname);
		
		Scanner sc5=new Scanner(System.in);
		System.out.println("Enter the Employee Area :");  // set area
		String area=sc2.nextLine();
		ad.setArea(area);
		
		Scanner sc6=new Scanner(System.in);
		System.out.println("Enter the Employee City :");  // set city
		String city=sc6.nextLine();
		ad.setCity(city);
		
		Scanner sc7=new Scanner(System.in);
		System.out.println("Enter the Employee Pincode :");  //  set pincode
		int pincode=sc7.nextInt();
		ad.setPincode(pincode);

		emp.setAddress(ad);
		ss.save(emp);//save session
		t.commit();  // commit transaction
        
		return "Employee is Added";
		
	}
    public static void main( String[] args )
    {
        System.out.println( "Project Start" );
        Configuration cfg=new Configuration().configure().addAnnotatedClass(Employee.class);
        SessionFactory sf=cfg.buildSessionFactory();
        Session ss=sf.openSession();

     //   Session s1=sf.getCurrentSession();
        Transaction t=ss.beginTransaction();

        System.out.println(addemp(ss,t));//call method
        
        
        
    }
}