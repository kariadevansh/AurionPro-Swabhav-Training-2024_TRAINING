package com.apro.structural.composite.test;

import com.apro.structural.composite.model.Employee;
import com.apro.structural.composite.model.IEmployee;
import com.apro.structural.composite.model.ManagerComposite;

public class CompositeTest {
	public static void main(String[] args) {
		 // Create employees
        IEmployee e1 = new Employee("forntend developer:ABC", 50000);
        IEmployee e2 = new Employee("backend developer:EFG", 60000);
        IEmployee e3 = new Employee("fullStack developer:TNT", 85000);	

        // Create managers
        ManagerComposite m1 = new ManagerComposite("Project Manager:DND", 80000);
        ManagerComposite m2 = new ManagerComposite("Project Manager:MnM", 95000);

        // Add employees to managers
        m1.add(e1);
        m1.add(e2);
        m2.add(e3);

        // Create top-level manager and add other managers to it
        ManagerComposite topManager = new ManagerComposite("CEO: BossMan", 1000000);
        topManager.add(m1);
        topManager.add(m2);

        // Print details of the organization
        topManager.printDetails("");
	}
}
