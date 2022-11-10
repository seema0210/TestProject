package Ass5;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Acc a=new Acc();//creating object
    a.setAceed(10);// values
    a.setName1("Seema");
    a.setBal(1000);
    
    System.out.println("Customer ID:"+a.getAceed());
    System.out.println("Customer name:"+a.getName1());
    System.out.println("Account Balance:"+a.getBalance());
    System.out.println(" Amount for Withdraw");
    Scanner sc=new Scanner(System.in);//take input by user
    int b=sc.nextInt();
    a.withdrawing(b);
    System.out.println(" Amount for Deposite");
    int d=sc.nextInt();
    a.deposit(d);
    sc.close();
	}

}
