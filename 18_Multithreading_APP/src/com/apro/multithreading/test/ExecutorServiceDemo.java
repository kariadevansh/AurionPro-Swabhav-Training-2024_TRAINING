package com.apro.multithreading.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.apro.multithreading.model.Task;

public class ExecutorServiceDemo {

	public static void main(String[] args) {
		
		int coreCount = Runtime.getRuntime().availableProcessors();
		
		System.out.println("available processors :"+coreCount);

//		ExecutorService service = Executors.newFixedThreadPool(coreCount);
		ExecutorService service = Executors.newCachedThreadPool();
		
		for(int i =0;i<100;i++) {
			service.execute(new Task());
			
			
		}
	}

}
