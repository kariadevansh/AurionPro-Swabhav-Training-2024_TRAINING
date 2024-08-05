package com.apro.multithreading.test;

import com.apro.multithreading.model.Task;

public class TaskTest {
	public static void main(String[] args) {
		
		for(int i = 0; i<10;i++) {
			Thread thread = new  Thread(new Task());
			thread.start();
		}
		
	}
}
