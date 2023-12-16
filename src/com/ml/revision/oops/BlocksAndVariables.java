package com.ml.revision.oops;

public class BlocksAndVariables {
    
    int a = 10;
    static int b = 20;
    
    {
	System.out.println("instance block");
    }
    
    
    static void m1(){
	
	int x =40;
	
	
	//System.out.println(x);
	{
	System.out.println("m1 method");
	}
	System.out.println(x);
    }
    
    
    static {
	System.out.println("static block");
    }

    public static void main(String[] args) {
	System.out.println("main method");
	
	    {
		System.out.println("sb");
	    }
	System.out.println(b);
	
	//============================
	System.out.println("============================");
	BlocksAndVariables.m1();
    }

}
