package com.apro.multithreading.model;

public class Task implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread: "+ Thread.currentThread().getName() );
		
	}

}
