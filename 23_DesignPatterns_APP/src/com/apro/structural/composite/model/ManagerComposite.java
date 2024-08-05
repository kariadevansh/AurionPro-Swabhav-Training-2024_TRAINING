package com.apro.structural.composite.model;

import java.util.ArrayList;
import java.util.List;

public class ManagerComposite implements IEmployee {
    private String name;
    private double salary;
    private List<IEmployee> subordinates = new ArrayList<>();

    public ManagerComposite(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void add(IEmployee employee) {
        subordinates.add(employee);
    }

    public void remove(IEmployee employee) {
        subordinates.remove(employee);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void printDetails(String indent) {
        System.out.println(indent+"Manager: " + name + ", Salary: $" + salary);
        for (IEmployee subordinate : subordinates) {
            subordinate.printDetails(indent+"\t");
        }
    }
}

