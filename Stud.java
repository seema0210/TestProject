package test;
import java.util.List;
import java.util.ArrayList;


public class Stud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  list of Student data
List<Stud7>d=new ArrayList<>();
d.add(new Stud7(101,"Maxmilion",30,75));
d.add(new Stud7(102,"Tanmay",29,60));
d.add(new Stud7(103,"Saurabh",31,85));
d.add(new Stud7(104,"John",30,80));
d.add(new Stud7(105,"HArry",29,80));


System.out.println("Marks");
d.stream().forEach(s->System.out.println(s.getName()+" "+s.getMarks()));

	//use stream()
System.out.println("prints marks between 60 to 80");
d.stream().filter(s->s.getMarks()<80 && s.getMarks()>60).forEach(s->System.out.println(s.getName()+" "+s.getMarks()));
	}

}
class Student
{
	// private data 
private int id;
private String name;
private int age;
private int marks;

//  get set methods use
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}


public Student(int id, String name, int age, int marks) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.marks = marks;
}
}
