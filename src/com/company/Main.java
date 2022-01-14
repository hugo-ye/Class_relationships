package com.company;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Mr. Minimum Wage");
        HiredContractor hiredContractor = new HiredContractor("Ms. Bourgeoisie");
        Worker[] workers = new Worker[2];
        workers[0] = employee;
        workers[1] = hiredContractor;
        Task[] tasks = new Task[1];
        Task task = new Task("Burning coal", workers);
        tasks[0] = task;
        Project project = new Project(234115912, tasks);
        System.out.println(project);

    }
}

class Project {
    int uniqueInteger;
    Task[] tasks;

    Project(int uniqueInteger, Task[] tasks) {
        this.uniqueInteger = uniqueInteger;
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "Project " + uniqueInteger +
                "\n Tasks " + Arrays.toString(tasks);
    }
}

class Task {
    String name;
    Worker[] workers;

    Task(String name, Worker[] workers) {
        this.name = name;
        this.workers = workers;
    }

    @Override
    public String toString() {
        return name + Arrays.toString(workers);
    }
}

class Worker {
    String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Employee extends Worker {
    public Employee(String name) {
        super(name);
    }
}

class HiredContractor extends Worker {

    public HiredContractor(String name) {
        super(name);
    }
}