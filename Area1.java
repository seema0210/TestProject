package test;


	public class Area1 {

		int r;
		double a=3.14;
		double a1;
		
		public Area1(int r)  // create Constructor
		{
			super();
			this.r = r;
		}
		
		public double Carea()
			{
				return a1=a*r*r;
		}
		public static void main(String[] args) {
	// TODO Auto-generated method stub
			Area1 o1=new Area1(7);   //  o1 object create
			//calling Carea method
			System.out.println("Circle 1 : "+o1.Carea());
			
			Area1 o2=new Area1(22);   //o2 object create
			//calling Carea method
			System.out.println("Circle 2 : "+o2.Carea());
		}
	
}
