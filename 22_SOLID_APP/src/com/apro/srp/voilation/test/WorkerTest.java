package com.apro.srp.voilation.test;

import com.apro.srp.voilation.model.IWorker;
import com.apro.srp.voilation.model.Labour;
import com.apro.srp.voilation.model.Robot;

public class WorkerTest {

	public static void main(String[] args) {
		IWorker labour = new Labour();
		labour.startWork();
		labour.eat();
		labour.drink();
		labour.stopWork();
		
		
		IWorker robot= new Robot();
		robot.startWork();
		robot.stopWork();
	}

}
