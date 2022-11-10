package Ass5;

public class Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="WoRd";//string
		StringBuffer nstr=new StringBuffer(str);// StringBuffer  object
		 for(int i=0;i<str.length();i++)
		 {
			 if(Character.isLowerCase(str.charAt(i)))//check  lower case
			 {
				 nstr.setCharAt(i, Character.toUpperCase(str.charAt(i)));//conversion of lower to upper case
			 }
			 else if(Character.isUpperCase(str.charAt(i)))//check  upper case
			 {
				 nstr.setCharAt(i,Character.toLowerCase(str.charAt(i)));//conversion of upper to lower case
			 }
		 }
       System.out.println(nstr);//display new string
	}
}
