package com.anudip;

import javax.persistence.Embeddable;

 
@Embeddable

public class Address
{
 private String hname;
 private String area;
 private String city;
 private int pincode;


public Address() {    //default constructor

	// TODO Auto-generated constructor stub
}

public Address(String hname, String area, String city, int pincode)  // parameterized contructor
 {
	super();
	this.hname = hname;
	this.area = area;
	this.city = city;
	this.pincode = pincode;
}
// use get and set method
public String getHname() 
{
	return hname;
}
public void setHname(String hname)
 {
	this.hname = hname;
}
public String getArea()
 {
	return area;
}
public void setArea(String area)
 {
	this.area = area;
}
public String getCity()
 {
	return city;
}
public void setCity(String city)
 {
	this.city = city;
}
public int getPincode()
 {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
}