package com.oops;


import java.util.ArrayList;

class Manager extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        return salary + incentive;
    }
}

class Labour extends Assignment2Q2 {
   @Override
    public int getSalary(int salary) {
        int overtime = 500;
        return salary + overtime;
   }
}

public class Assignment2Q2 {
    int salary = 10000;
    int sum=0;
    public int getSalary(int salary){
        return salary;

    }


   public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
        for (int x : employeeSalaries){
            sum = sum +x;
        }
        return sum;

   }
    public static void main(String[] args) {
        Assignment2Q2 a = new Assignment2Q2();
        Assignment2Q2 l1=new Labour();
        Assignment2Q2 m1 = new Manager();
        ArrayList<Integer> employeeSalaries = new ArrayList<>();
        employeeSalaries.add(l1.getSalary(l1.salary));
        employeeSalaries.add(m1.getSalary(m1.salary) );
        System.out.println(employeeSalaries);
        System.out.println(a.totalEmployeesSalary(employeeSalaries));


    }
}


