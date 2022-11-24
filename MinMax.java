package test;

import java.util.List;
import java.util.ArrayList;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Stud7>d=new ArrayList<>();   //  student list
		
		
		d.add(new Stud7(101,"Maxmilion",30,75));
		d.add(new Stud7(102,"Tanmay",29,60));
		d.add(new Stud7(103,"Saurabh",31,85));
		d.add(new Stud7(104,"John",30,80));
		d.add(new Stud7(105,"Harry",29,80));
		
			// using stream()
	
		Stud7 stud1=d.stream().max((a,b)->a.getMarks()>b.getMarks()?1:-1).get();
		System.out.println("Max :"+stud1.getName()+" "+stud1.getMarks());   //  maximun
		Stud7 stud2=d.stream().min((a,b)->a.getMarks()>b.getMarks()?1:-1).get();
		System.out.println("Mini : "+stud2.getName()+" "+stud2.getMarks());  //  minimum
		
			}

		}
		
	class Stud7
	{
		// private data
	private int id;
	private String name;
	private int age;
	private int marks;
				
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
	public Stud7(int id, String name, int age, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
}
