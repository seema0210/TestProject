package com.anudip;

public class Agent 
{
 private int comission;	
 private int id;
 private String name;
 
public Agent() {  // default constructor
	
	// TODO Auto-generated constructor stub
}

public Agent(int id, String name, int comission) {  // parameteriesed contructor
	this.comission = comission;
	this.id = id;
	this.name = name;
}

public Agent(int id, int comission) {  // constructor with id and comission parameter

	this.comission = comission;
	this.id = id;
}

public Agent(int id) {
	this.id = id;
}

public int getId() {  // get method for id
	return id;
}
public void setId(int id) {  // set method  for id
	this.id = id;
}
public String getName() {   // get method  for name
	return name;
}
public void setName(String name) {   // set method for name
	this.name = name;
}
public int getComission() {  // get method for comission
	return comission;
}
public void setComission(int comission) {   // set method for comission
	this.comission = comission;
}
}