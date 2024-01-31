package com.ml.revision.multithreading;

public class ClassLevelSynchronization {
	private static int syncedInt;
	static class ModifySyncedInt implements Runnable {
		private final String threadName;

		ModifySyncedInt(int x, String s) {
			syncedInt = x;
			this.threadName = s;
		}

		@Override
		public void run() {
			for (int i = 0; i < 5; i++) {
				synchronized (ClassLevelSynchronization.class) {
					syncedInt++;
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}System.out.println("syncedInt value in run method : " + syncedInt + " for thread " + this.threadName);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new ModifySyncedInt(25, "T-1"));
		Thread t2 = new Thread(new ModifySyncedInt(15, "T-2"));
		t1.start();
		t2.start();
		System.out.println("syncedInt value in main method : " + syncedInt);
		t1.join();
		t2.join();
		System.out.println("syncedInt value in main method : " + syncedInt);
	}

}
