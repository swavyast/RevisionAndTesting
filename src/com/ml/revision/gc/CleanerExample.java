package com.ml.revision.gc;

import java.lang.ref.Cleaner;

public class CleanerExample implements AutoCloseable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() throws Exception {
		
	}
	
	private static final Cleaner cleaner = Cleaner.create();
	
	static class State implements Runnable{
		
		State(Object...objects){
			for(Object o : objects) {

			}
		}

		@Override
		public void run() {
			
		}
	}

}
