package com.jspiders.multithreading.main;

import com.jspiders.multithreading.resource.Resource;
import com.jspiders.multithreading.thread.MyThread5;
import com.jspiders.multithreading.thread.MyThread6;

public class ThreadMain5 {
	public static void main(String[] args) {

		Resource resource = new Resource();

		MyThread5 thread1 = new MyThread5(resource);

		MyThread6 thread2 = new MyThread6(resource);

		thread1.start();
		thread2.start();
	}


}
