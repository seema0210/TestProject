package ass4;

interface Add// add interface
{
  public int add(int x,int y);	// add method declaration
}
interface Upper
{
	public void str();// str method declaration
}

public class Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Add x=(a,b)->//used lambda expression
     {
    	 return a+b;
     };
     String ss="seema nale";// using string
     Upper sss=()->//using lambda expression
     {
    	 
     System.out.println(ss.toUpperCase());//print
    
     };
    
    System.out.println( x.add(15,75));//calling add method
    sss.str();//calling string method
}
}