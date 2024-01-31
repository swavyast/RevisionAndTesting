package com.ml.revision.multithreading;

import java.util.ArrayList;
import java.util.List;

public class FailSafeIterator {

	static class AddElement implements Runnable {
		private final List<String> synchronizedList;
		private final String threadName;

		AddElement(List<String> li, String name) {
			this.synchronizedList = li;
			this.threadName = name;
		}

		@Override
		public void run() {
			for (int i = 0; i < 5; i++) {
				synchronized (synchronizedList) {
					synchronizedList.add(threadName + " : Element : " + i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		List<String> synchronizedList = new ArrayList<String>();
		Thread t1 = new Thread(new AddElement(synchronizedList, "Thread - 1"));
		Thread t2 = new Thread(new AddElement(synchronizedList, "Thread - 2"));
		t1.start();
		// t1.join(); //for sequential access
		t2.start();
		t1.join();
		t2.join();
		for(String s: synchronizedList)
		System.out.println(s);
	}

}
