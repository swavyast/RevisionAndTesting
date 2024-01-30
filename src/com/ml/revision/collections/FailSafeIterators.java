package com.ml.revision.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIterators {

	public static void main(String[] args) {
//		List<String> li = new ArrayList<String>();
//		li.add("Hello");
//		li.add("I am");
//		li.add("Himanshu");
//		Iterator<String> it = li.iterator();
//		li.add("FailFast");
//		Collections.synchronizedList(li);
//		synchronized (it) {
//			while (it.hasNext()) {
//				String item = it.next();
//				System.out.print(item);
//			}	
//		}
		
		//Manually Creating A Snapshot
		List<String> li = Collections.synchronizedList(new ArrayList<String>());
		li.add("Hello");
		li.add("I am");
		li.add("Himanshu");
		List<String> snap = new ArrayList<String>(li);
		synchronized (li) {
			Iterator<String> it = snap.iterator();
			li.add("and I'm FailSafe");
			while (it.hasNext()) {
				String item = it.next();
				System.out.print(item+"  ");
				if(!it.hasNext())
					System.out.println(li.get(li.size()-1));
			}	
		}
		System.out.println("\n------------------------------------------------------");
		CopyOnWriteArrayList<String> cowal = new CopyOnWriteArrayList<String>();
		cowal.add("Hello");
		cowal.add("I am");
		cowal.add("Safe");
		Iterator<String> iter = cowal.iterator();
		cowal.add("Now");
		while(iter.hasNext()) {
			String item = iter.next();
			System.out.print(item+"  ");
			if(!iter.hasNext())
			System.out.println(cowal.get(cowal.size()-1));
		}
	}

}
