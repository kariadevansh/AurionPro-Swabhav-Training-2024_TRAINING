package com.apro.structural.composite.model;

public class Employee implements IEmployee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
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
        System.out.println(indent+"Employee name: " + name + ", Salary: $" + salary);
    }
}
