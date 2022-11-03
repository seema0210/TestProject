package ass4;

class Circle extends Shape //child class
{
	public void getArea()//
	{
		int r=8;//value 
		double pi=3.14;
		double a=pi*r*r;//area of circle
		System.out.println("Area of circle : "+a);//diplay area
	}
}
class Square extends Shape// child class
{
	public void getArea()// use method for square class
	{
		int side=5;//value 
		int b=side*side;// use formula for area of square
		System.out.println("Area of Square : "+b);//display area
	}
}

public class Shape //parent class
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Circle c=new Circle();//create object 
     c.getArea();//call method for area of  circle
     Square s=new Square();//create object
     s.getArea();//call method for area of  circle
	}

}