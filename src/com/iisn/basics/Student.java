package com.iisn.basics;

import java.util.Scanner;

public class Student implements InterAB {

    String name;
    String dept;

    @Override
    public void printInfo() {
        System.out.println("Name "+name);
        System.out.println("Department "+dept);
    }

    @Override
    public void getInfo() {
        System.out.println("Enter the Name");
        name=s.next();
        System.out.println("Enter the Department ");
        dept=s.next();

    }
}
