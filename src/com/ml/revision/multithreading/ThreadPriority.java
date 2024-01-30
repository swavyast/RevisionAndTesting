package com.ml.revision.multithreading;

public class ThreadPriority implements Runnable{

	public static void main(String[] args) {
		System.out.println("Main Method");
		ThreadPriority tp = new ThreadPriority();
		ThreadPriority tp1 = new ThreadPriority();
		ThreadPriority tp2 = new ThreadPriority();
		ThreadPriority tp3 = new ThreadPriority();
		Thread t1 = new Thread(tp);
		Thread t2 = new Thread(tp1);
		Thread t3 = new Thread(tp2);
		Thread t4 = new Thread(tp3);
		System.out.println("\nPriority of "+ t1.getName()+" before start is by default : "+t1.getPriority());
		t1.setPriority(1);
		t1.start();
		
		System.out.println("\nPriority of "+ t2.getName()+" before start is by default : "+t2.getPriority());
		t2.setPriority(2);
		t2.start();
		
		System.out.println("\nPriority of "+ t3.getName()+" before start is by default : "+t3.getPriority());
		t3.setPriority(3);
		t3.start();
		System.out.println("\nPriority of "+ t4.getName()+" before start is by default : "+t4.getPriority());
		t4.setPriority(4);
		t4.start();
		System.err.println("\n=====================================================================================");
	}

	@Override
	public void run() {
		final class Abc{
			public Abc() {
				System.out.println("Current Thread Priority of  "+Thread.currentThread().getName()+"  is : "+Thread.currentThread().getPriority());
			}
		}
		new Abc();
	}

}
