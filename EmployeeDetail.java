package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Agent>d=new ArrayList<>();// arraylist creation 
		d.add(new Agent("Saurabh",101,"Pune"));
		d.add(new Agent("Harry",102,"Mumbai"));
		d.add(new Agent("Vinod",103,"Delhi"));
		d.add(new Agent("John",104,"UK"));
		d.add(new Agent("Tanmay",105,"Banglore"));
		Collections.sort(d);// sorting
		for(Agent emp:d)// for loop
		{
		 System.out.println(" Name:-"+emp.getName()+" ID:-"+emp.getId()+" Area:-"+emp.getArea());// display data
		}
		}
		}
		class Agent implements Comparable<Agent>
		{
			// private data member
		  private String name1;
		  private int id1;
		  private String area1;
		  // using getter and setter method
		public String getName() {
			return name1;
		}
		public void setName(String name) {
			this.name1 = name;
		}
		public int getId() {
			return id1;
		}
		public void setId(int id) {
			this.id1 = id;
		}
		public String getArea() {
			return area1;
		}
		public void setArea(String area) {
			this.area1 = area;
		}
		//constructor with fields
		public Agent(String name, int id, String area) {
			super();
			this.name1 = name;
			this.id1 = id;
			this.area1 = area;
		}
		//compareTo method
		@Override
		public int compareTo(Agent e1) {
			// TODO Auto-generated method stub
			return area1.compareToIgnoreCase(e1.area1);
		} 
		
		
	}


