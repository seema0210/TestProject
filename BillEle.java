package test;

import java.util.Scanner;

public class BillEle {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Units");
		
    // data member
    int u1=0;
    double Total;
    u1=sc.nextInt();
    
    // check units from 0 to 100
    if(u1>0 && u1<=100)
    {
    	Total=u1*1.20;
    	//  display electricity bill
    	System.out.println("Bill  : "+Total);
    }
    //  check units from 100 to 300
    else if(u1>100 && u1<=300)
    {
    	Total=u1*2.0;
    //  display electricity bill
    	System.out.println("Bill  : "+Total);
    }
    else if(u1>300)
    {
    	Total=u1*3.0;
    //  display electricity bill
    	System.out.println("Your Electricity Bill is:- "+Total);
    }
    else
    {
    	
    	System.out.println("Invalid Message");
    }
    sc.close();
	}
}
