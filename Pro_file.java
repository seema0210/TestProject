package test;

import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Pro_file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     File o1=new File("G:\\ass7.txt");
     System.out.println(" display which word length is greater then 5");
     Scanner sc=new Scanner(o1);
     String s="";
     String s1=sc.nextLine();
     
     for(int i=0;i<s1.length();i++)  //  use for loop for iteration
     {
    	
    	 if(s1.charAt(i)!=' ') //  use for check space
    	 {
    		 s+=s1.charAt(i);  //  add
    	 }
    	 else
    	 {
    		if(s.length()>5)  // check length is greater or not
    			
    			System.out.println(s+" ");  //  display
    		
    		 			s=" "; 
    	 }
     }
   sc.close();
}
}
