package com.apro.creational.singleton.test;

import com.apro.creational.singleton.model.Database;

public class Databasetest {

	public static void main(String[] args) {
		Database database1 = Database.initiateDatabase("https:\\\\MongoDb\\table\\1", "admin", 101);
//		database1.initiateDatabase("https:\\\\MongoDb\\table\\1", "admin", 101);
//		database1.connect();
	}

}

