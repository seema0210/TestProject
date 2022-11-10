package Ass5;

import java.util.Scanner;

public class Array
{
	// check array elements
   public static void checkarray(int arr[])throws Exception
   {
	   
	   if(arr[0]==0 || arr[1]==0 || arr[2]==0 || arr[3]==0 || arr[4]==0)
	   {
		   throw new Zeromembererror("Do not enter 0");
	   }
	   else
	   {
		   
		   System.out.println("Valid entry");  
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(" Array Elements");
      Scanner sc=new Scanner(System.in);
      int[] arr=new int[3];
      int a;
      int i;
      a=sc.nextInt();
      for(i=0;i<a;i++)
      {
    	  arr[i]=sc.nextInt();// take array by user
      }
     
      try
      {	  
         checkarray(arr);
      }
      catch(Exception e)
      {
    	  e.printStackTrace();
      }
	}
}