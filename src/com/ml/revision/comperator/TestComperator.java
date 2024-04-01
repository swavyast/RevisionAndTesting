package com.ml.revision.comperator;

import java.util.Comparator;

public class TestComperator implements Comparator<TestComperator> {
	
	private long id;
	private String name;
	private String email;
	private String phone;
	private int i;

	public static void main(String[] args) {
		
		TestComperator ob1 = new TestComperator();
		ob1.id = 1;
		ob1.email = "swavyast@gmail.com";
		ob1.name = "Himanshu";
		ob1.phone = "7275855535";

		TestComperator ob2 = new TestComperator();
		ob2.id = 2;
		ob2.email = "wavyast@gmail.com";
		ob2.name = "Himanshu";
		ob2.phone = "7275855535";
		
		System.out.println("Using comparator interface");
		System.out.println(new TestComperator().compare(ob1, ob2));

	}

	@Override
	public int compare(TestComperator o1, TestComperator o2) {
			int i = 0;
			String s = null;
			if(o1.id == o2.id) {
				i++;
				s = "id";
			}
			if(o1.name == o2.name) {
				i++;
				if(s!=null)
					s += " & name";
				else
					s = "name";
			}
			if(o1.email == o2.email) {
				i++;
				if(s!=null)
				s += " & email";
				else
					s = "email";
			}
			if(o1.phone == o2.phone) {
				i++;
				if(s!=null)
				s += " & phone";
				else
					s = "phone";
			}
			System.out.println(s+" matched");
			return i;
	}

}
