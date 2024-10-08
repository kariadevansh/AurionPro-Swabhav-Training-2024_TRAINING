package com.apro.multithreading.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.apro.multithreading.model.NewTask;

public class ExecutorServiceTest {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(10);
		
		Future<Integer> future = service.submit(new NewTask());
		
		List<NewTask> 	tasks = new ArrayList<NewTask>();
		
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		
		try {
//			int number = service.invokeAny(tasks);
//			System.out.println(number);
			
			List<Future<Integer>> futures = service.invokeAll(tasks);
			for(Future newFuture : futures) {
				System.out.println(newFuture.get());
			}
			
			
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
