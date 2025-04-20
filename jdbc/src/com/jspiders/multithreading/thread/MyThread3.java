package com.jspiders.multithreading.thread;

public class MyThread3  extends Thread{
	public void run() {
		for(int i=0;i<=10;i++)
		{
			System.out.println(this.getName() + " is running with id = " + this.threadId());
		}
	}
	

}
