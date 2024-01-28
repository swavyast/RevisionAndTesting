package com.ml.revision.oops;

import org.openjdk.jol.info.ClassData;
import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.layouters.Layouter;

public class ClassLoading {
	public static int num = 100;
	public static void main(String[] args) {
		ClassLoading cl = null;
		System.out.println(ClassLayout.parseClass(ClassLoading.class, new Layouter() {
			
			@Override
			public ClassLayout layout(ClassData arg0) {
				arg0 = ClassData.parseClass(ClassLoading.class);
				return ClassLayout.parseClass(ClassLoading.class);
			}
		}).toPrintable());
		//System.out.println(VM.current().sizeOf(cl));
	}

}
