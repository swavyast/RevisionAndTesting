package com.ml.revision.reflection;

import java.lang.reflect.Constructor;

public class Test1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		try {
			Class cl = Class.forName("com.ml.revision.reflection.Animal");
		//	Animal a1 = (Animal) cl.newInstance();
			/**
			 * java.lang.IllegalAccessException: class com.ml.revision.reflection.Test1
			 * cannot access a member of class com.ml.revision.reflection.Animal with
			 * modifiers "private".
			 */
		//	System.out.println(a1);
			
			Constructor c = cl.getDeclaredConstructor();
			c.setAccessible(true);
			Animal a2 = (Animal) c.newInstance();
			System.out.println(a2.getAll());
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
