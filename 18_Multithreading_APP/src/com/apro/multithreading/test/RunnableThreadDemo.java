package com.apro.multithreading.test;

import com.apro.multitasking.threads.RunnableThread;

public class RunnableThreadDemo {
	public static void main(String[] args) {
		RunnableThread thread1 = new RunnableThread("Thread1");
		
		try {         /// this is to finish the working of all the threads before the main thread
			thread1.getThread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		Thread thread1 = new Thread(new RunnableThread());
//		thread1.start();
	}
}
