package com.ml.revision.multithreading;

public class LinkedListThread {
	
	public static void main(String[] args) throws InterruptedException {
		LinkedListExample l1 = new LinkedListExample();
		Thread t1 =new Thread(l1);
		l1.getNode().setData(100);
		LinkedListExample l2 = new LinkedListExample();
		Thread t2 =new Thread(l2);
		l1.getNode().setNext(l2.getNode());
		l2.getNode().setData(200);
		LinkedListExample l3 = new LinkedListExample();
		Thread t3 =new Thread(l3);
		l2.getNode().setNext(l3.getNode());
		l3.getNode().setNext(l1.getNode());
		l3.getNode().setData(300);
		t1.start();
		t1.join();
		System.out.println("\ndoes thread t1 holds the lock ? "+Thread.holdsLock(t1));
		t2.start();
		t2.join();
		System.out.println("\ndoes thread t2 holds the lock ? "+Thread.holdsLock(t2));
		Thread.yield();
		t3.start();
		t3.join();
		System.out.println("\ndoes thread t2 holds the lock ? "+Thread.holdsLock(t3));
		//System.out.println(l1+""+l2+""+l3);
		System.err.println("================================================\n\n");
		System.out.print(l1.getNode());
		System.out.print(l2.getNode());
		System.out.print(l3.getNode());
		System.out.println("\n\n\n");
	}

}
