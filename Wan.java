package test;

import java.util.Scanner;

public class Wan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//  enter user input
    System.out.println("Rows");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int s1=0;
    boolean flag=true;
    //  checking rows
    	if(a<0)
    	{
    		System.out.println("Invalid Message");
    	}
    	else
    	{
    		for(int i=0;i<a;i++)//for loop
    		{
    			int man=sc.nextInt();
    			if(man<0)
    			{
    				System.out.println("Invalid Input");
    				flag=false;
    				break;
    			}
    			else
    			{
    				s1+=man;
    				System.out.println(man);
    			}
    		}
    	
    		
    		if(flag==true)
    		{
    		//print the total number of percons
    		System.out.println("pacenger : "+s1);
    	}
    }
    sc.close();
	}
}
