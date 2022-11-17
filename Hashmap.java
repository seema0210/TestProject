package test;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,Integer>d=new HashMap <>();// HashMap
d.put(5,5);
d.put(4,6);
d.put(5,15);
d.put(2,4);
d.put(6,36);
d.put(12,144);
d.put(1,1);
d.put(9,65);
d.put(11,121);
d.put(10,10);
d.put(1,11);
d.put(12,144);
d.put(13, 169);
d.put(25, 625);
d.put(8, 64);
for(Integer a:d.values())// for loop
{
		System.out.println(a);//display values
}
  }
}
