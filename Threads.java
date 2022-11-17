package test;

	public class Threads extends Thread
	{  
		public void run()
		{
			//declaration of array
			int array[]= {5,15,25,35,45,55};
			int s=1;
			for(int i=0;i<array.length;i++)
			{
				s=array[i]*array[i];// square
				System.out.println("Square : "+array[i]+" "+s);// display square
			}	
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	   Threads o1=new Threads();//creation of object
	   float average=0;
	   int sum=0;
	   o1.start();// method  call
	   for(int i=1;i<=50;i++)
	   {
		   System.out.println(i);//print elements
		   sum+=i;//find sum
	   }
	   System.out.println("Addition :"+sum);
	   average=sum/50;
	   System.out.println("Average of numbers :"+average);// display average
		}
	}

