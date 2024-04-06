package com.ml.revision.reflection;

import java.lang.reflect.Constructor;

public class Test2 {
	
	public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

	public static void main(String[] args) {
		System.out.println(ANSI_RED+"Test2.main()");
		try {
			Class clazz = Class.forName("com.ml.revision.reflection.Sample1");
			Constructor<?> [] constructors  = clazz.getDeclaredConstructors();
			for(Constructor c: constructors) {
				c.setAccessible(true);
				//c.setAccessible(constructors, true);
				System.out.println(ANSI_GREEN+"\n\n++++++++++++++++++++++++++++++++++++++++++++\n\n");
				System.out.println(ANSI_YELLOW+"getModifiers : "+c.getModifiers());
				System.out.println(ANSI_BLUE+"getName : "+c.getName());
				System.out.println(ANSI_PURPLE+"getParameterCount : "+c.getParameterCount());
				System.out.println(ANSI_CYAN+"getGenericParameterTypes : "+c.getGenericParameterTypes());
				System.out.println(ANSI_RED+"getParameters : "+c.getParameters());
				System.out.println(ANSI_GREEN+"getTypeParameters : "+c.getTypeParameters());
				System.out.println(ANSI_YELLOW+"isAccessible : "+c.isAccessible());
				System.out.println(ANSI_BLUE+"isSynthetic : "+c.isSynthetic());
				//System.out.println("newInstance : "+c.newInstance(args));
				System.out.println(ANSI_PURPLE+"trySetAccessible : "+c.trySetAccessible());
				System.out.println(ANSI_CYAN+"getClass : "+c.getClass());
				System.out.println(ANSI_RED+"getDeclaringClass : "+c.getDeclaringClass());
				System.out.println(ANSI_GREEN+"getExceptionTypes : "+c.getExceptionTypes());
				System.out.println(ANSI_YELLOW+"getParameterTypes : "+c.getParameterTypes());
				System.out.println(ANSI_BLUE+"getDeclaredAnnotations : "+c.getDeclaredAnnotations());
				System.out.println(ANSI_PURPLE+"getDeclaredAnnotations: "+c.getGenericExceptionTypes());
				System.out.println(ANSI_CYAN+"DECLARED : "+c.DECLARED);
				System.out.println(ANSI_RED+"PUBLIC : "+c.PUBLIC);
				System.out.println(ANSI_RESET+"\n\n*************************************************");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
