package com.ml.revision.enums;

public class UserClass {
    
    String name;
    Calendar dob;
    
    
    public static void main(String[] args) {
	Calendar c= new Calendar();
	UserClass uc=new UserClass();
	c.date = Date.D7.Date();
	c.month = Month.AUGUST.Month(); 
	c.week = Week.W10.Week();
	c.year = Year.Y1992.Year();
	
	System.out.println(c);
	System.out.println();
	
	uc.dob=c;
	System.out.println(uc.dob);
    }

}
