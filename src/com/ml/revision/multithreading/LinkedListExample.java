package com.ml.revision.multithreading;

public class LinkedListExample implements Runnable {
	private Node node;
	private static int i = 1;

	public LinkedListExample() {
		this.node = new Node();
	}

	class Node {
		private int data;
		private Node next;

		Node() {
		}

		public Node(int data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		@Override
		public String toString() {

			return "-> Node {data [" + this.data + "],  next -> " + this.next.data + "}\t";
		}
	}

	public Node getNode() {
		return node;
	}

	public static boolean isNull(Node n) {

		return (n == null || n.next == null);
	}

	@SuppressWarnings("preview")
	@Override
	public void run() {
		synchronized (LinkedListExample.class) {
			System.out.println("\nTHREAD : " + i + " -> [ thread id is : " + Thread.currentThread().threadId()
					+ ", thread group is : " + Thread.currentThread().getThreadGroup().getName()
					+ ", thread priority is : " + Thread.currentThread().getPriority() + ", thread count is : "
					+ Thread.activeCount() + ", thread is in : " + Thread.currentThread().getState()
					+ " state\nisAlive ? " + Thread.currentThread().isAlive() + ", isDaemon ? "
					+ Thread.currentThread().isDaemon() + ", isInterrupted ? " + Thread.currentThread().isInterrupted()
					+ ", isVirtual ? " + Thread.currentThread().isVirtual()+", Holds Lock ? " 
					+ Thread.holdsLock(LinkedListExample.class)
					+ "]");
			i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
