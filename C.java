package com.anudip;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//entity declaration
@Entity
@Table(name="course_info")
public class Course 
{
	@Id  // primary key
	@GeneratedValue(strategy=GenerationType.AUTO)
 private int cid;  // private data 
 private String cname;
 private String cduration;
 @ManyToOne
 private Teacher teacher;

 public Course() {   //default constructor
	
	// TODO Auto-generated constructor stub
}
 //constructor with parameters
public Course(int cid, String cname, String cduration, Teacher teacher) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.cduration = cduration;
	this.teacher = teacher;
}

public String getCname() {  //  get method
	return cname;
}
public void setCname(String cname) {    // set method
	this.cname = cname;
}
public String getCduration() {    //  get method
	return cduration;
}
public void setCduration(String cduration) {   //  set method
	this.cduration = cduration;
}
public Teacher getTeacher() {    // get method
	return teacher;
}
public void setTeacher(Teacher teacher) {    //  set method
	this.teacher = teacher;
}
 
}