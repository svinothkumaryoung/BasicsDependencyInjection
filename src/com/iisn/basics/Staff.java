package com.iisn.basics;

public class Staff implements InterAB {
    String name;
    String Department;
    int salary;
    int experience;
    @Override
    public void printInfo() {
        System.out.println("Name "+name);
        System.out.println("Department "+Department);
        System.out.println("Salary "+salary);
        System.out.println("Experience "+experience);

    }

    @Override
    public void getInfo() {
        System.out.println("Enter the Name ");
        name=s.next();
        System.out.println("Enter the Department ");
        Department=s.next();
        System.out.println("Enter the Salary ");
        salary=s.nextInt();
        System.out.println("Enter the Experience ");
        experience=s.nextInt();


    }
}
