package ass4;

import java.util.ArrayList;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Integer> a=new ArrayList<Integer>();
    a.add(2);//ad numbers in arraylist
    a.add(3);
    a.add(9);
    a.add(4);
    a.add(5);
   a.forEach((x)->// lambda expression
   {
	   if(x%2==0)// use for even num
	   {
		   System.out.print("Even ");
		  System.out.print(x+" ");//disply even num
	   }
	  
	    if(x%2==1)//use for even num
	   {
	    	System.out.print("Odd  ");
		  System.out.print(x+" ");//display odd num
	   }
	    System.out.println("");
   });   
	}
}
