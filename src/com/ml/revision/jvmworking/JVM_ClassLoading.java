package com.ml.revision.jvmworking;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.security.SecureClassLoader;

public class JVM_ClassLoading {

    public void printClassLoaders(Test t){

	//Fully Qualified ClassName
	System.out.println("Class Name : " + t.getClass().getName());

	//Constructors Declared inside the class
	for (Constructor c1 : t.getClass().getDeclaredConstructors())
	    System.out.println("Declared Constructors : " + c1.getClass().getDeclaredConstructors());

	//Methods Declared Inside Class
	for (Method m : t.getClass().getDeclaredMethods())
	    System.out.println("Declared Methods : " + m.getName());

	//Fields Declared Inside Class
	for (Field f : t.getClass().getDeclaredFields())
	    System.out.println("Declared Fields : " + f.getName());

	//ArrayList ClassLoader
	System.out.println("ArrayList ClassLoader : " + ArrayList.class.getClassLoader());
	
		/*
		 * Prints null, because bootstrap loader is written in native code, hence it can't be loaded like other 
		 * java classes. It's behavior may differ JVM to JVM.
		 * */

	//Arrays ClassLoader
	System.out.println("Arrays ClassLoader : " + Arrays.class.getClassLoader());

	//DriverManager ClassLoader
	System.out.println("DriverManager Class Name : " + DriverManager.class.getClassLoader());
    }
	static {
    //LoadingArrayList Using User-Defined ClassLoader
	try{
	    ClassLoader cl=new ClassLoader() {};
	}catch(Exception e) {
	    e.printStackTrace();
	}
	}
	
    public static void main(String[] args) throws MalformedURLException{;
	//ClassLoader clsl = new MyClassLoader(new URL[]{new URL("google.com"), new URL("google.com")});
	//System.out.println(" clsl parent "+clsl.getParent());
	JVM_ClassLoading main = new JVM_ClassLoading();
	Test t1 = new Test();
	main.printClassLoaders(t1);
	System.out.print("ClassLoader AnonymousClass : " );
    }
}

class Test {
    byte b = 10;
    short s = 365;
    int i = 30;
    long j = 6598367L;
    float f = 20.36f;
    double d = 10.23d;
    char c = 'H';
    boolean bool = true;

    public void testMethod() {

	System.out.println("Test method with no argument and no return type");
    }

    public int testIntMethod() {

	System.out.println("Test method with no argument and return type of int");
	return b;

    }

    public int testMethod(int a, int b) {

	System.out.println("Test method with 2 arguments of int type and return type of int");
	return a + b;

    }

    public void noDefinition() {
    }

}