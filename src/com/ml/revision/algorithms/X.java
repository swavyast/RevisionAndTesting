package com.ml.revision.algorithms;

class X {

    X() {
	System.out.println("default constructor in class X");
    }
    public void m1() {
	System.out.println("method m1 inside class X");
    }
    {
	System.out.println("instance block inside class X");
    }
    public void m2() {
	System.out.println("method m2 inside class X");
    }
    static {
	System.out.println("static block inside class X");
    }

    public static void main(String arg[]) {
	X x=new X();
	x.m1();
	x.m2();
	X x1=new Y();
	((Y) x1).m3();
    }
}
class Y extends X {
    {
	System.out.println("instance block inside class Y");
    }
    static {
	System.out.println("static block inside class Y");
    }
    public void m1() {
	System.out.println("method m1 inside class Y");
    }
    public void m3() {
	System.out.println("method m3 inside class Y");
    }
}
