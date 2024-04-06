package com.ml.revision.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;

public class Test2 {

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	private static final String[] COLOR_ARRAY = { ANSI_RESET, ANSI_RED, ANSI_GREEN, ANSI_YELLOW, ANSI_BLUE, ANSI_PURPLE,
			ANSI_CYAN };

	public static void main(String[] args) {
		System.out.println(COLOR_ARRAY[1] + "Test2.main()");
		try {
			Class clazz = Class.forName("com.ml.revision.reflection.Sample1");

			// fetching constructors details
			Constructor<?>[] constructors = clazz.getDeclaredConstructors();
			for (Constructor<?> c : constructors) {
				// c.setAccessible(true);
				// c.setAccessible(constructors, true);
				System.out.println(COLOR_ARRAY[2] + "\n\n++++++++++++++++++++++++++++++++++++++++++++\n\n");
				System.out.println(COLOR_ARRAY[3] + "getModifiers : " + c.getModifiers());
				System.out.println(COLOR_ARRAY[4] + "getName : " + c.getName());
				System.out.println(COLOR_ARRAY[5] + "getParameterCount : " + c.getParameterCount());
				Type paraTypes[] = c.getGenericParameterTypes();
				int i = 6;
				for (Type t : paraTypes) {
					i++;
					if (i > 6 || i < 0)
						i = 0;
					System.out.println(COLOR_ARRAY[i] + "getGenericParameterTypes -> getTypeName : " + t.getTypeName());

				}
				for (Parameter p : c.getParameters()) {
					System.out.println(COLOR_ARRAY[1] + "getParameters -> getParameterizedType : " + p.getParameterizedType());
					System.out.println(COLOR_ARRAY[2] + "getParameters -> getModifiers : " + p.getModifiers());
					System.out.println(COLOR_ARRAY[3] + "getParameters -> getName : " + p.getName());
					System.out.println(COLOR_ARRAY[4] + "getParameters -> getClass : " + p.getClass());
					System.out.println(COLOR_ARRAY[5] + "getParameters -> getType : " + p.getType());
				}

				System.out.println(COLOR_ARRAY[0] + "getTypeParameters : " + c.getTypeParameters());
				System.out.println(COLOR_ARRAY[1] + "isAccessible : " + c.isAccessible());
				System.out.println(COLOR_ARRAY[2] + "isSynthetic : " + c.isSynthetic());
				System.out.println(COLOR_ARRAY[3] + "trySetAccessible : " + c.trySetAccessible());
				System.out.println(COLOR_ARRAY[4] + "getClass : " + c.getClass());
				System.out.println(COLOR_ARRAY[5] + "getDeclaringClass : " + c.getDeclaringClass());
				System.out.println(COLOR_ARRAY[6] + "getExceptionTypes : " + c.getExceptionTypes());
				System.out.println(COLOR_ARRAY[0] + "getParameterTypes : " + c.getParameterTypes());
				System.out.println(COLOR_ARRAY[1] + "getDeclaredAnnotations : " + c.getDeclaredAnnotations());
				System.out.println(COLOR_ARRAY[2] + "getDeclaredAnnotations: " + c.getGenericExceptionTypes());
				System.out.println(COLOR_ARRAY[3] + "DECLARED : " + c.DECLARED);
				System.out.println(COLOR_ARRAY[4] + "PUBLIC : " + c.PUBLIC);
				System.out.println(COLOR_ARRAY[5] + "\n\n*************************************************");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
