package com.ml.revision.multithreading;

import java.util.Timer;
import java.util.TimerTask;

public class TimerExample {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Timer timer = new Timer(true);
		TimerTask tt = new TimerTask() {
			
			@Override
			public void run() {
				new Thread(new LinkedListExample()).start();
			}
		};
		tt.run();
	}

}
