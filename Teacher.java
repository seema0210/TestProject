package com.anudip;

import java.util.List;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity    //Entity declaration
@Table(name="tearcher_info")
public class Teacher
{
	@Id // primary key
	@GeneratedValue(strategy=GenerationType.AUTO)
// private data member
 private int tid;
 private String name;
 private String dept;

//convert one to many 
 @OneToMany 
 private List<Course> course;
 
public Teacher() {  //default constructor
	
	// TODO Auto-generated constructor stub
}
// parametrised constuctor 
public Teacher(int tid, String name, String dept, List<Course> course) {
	super();
	this.tid = tid;
	this.name = name;
	this.dept = dept;
	this.course = course;
}

public String getName() {  // get method
	return name;
}
public void setName(String name) {  // set method
	this.name = name;
}
public String getDept() {    //  get method
	return dept;
}
public void setDept(String dept) {    //  set method
	this.dept = dept;
}
public List<Course> getCourse() {     // get course
	return course;
}
public void setCourse(List<Course> course) {     // set course
	this.course = course;
}
 
}