package com.company;

import java.util.Scanner;

class SiCi{
    public double simpleInterest(double principalAmount,int time, double interestRate){
        double si;
        si=(principalAmount*time*interestRate)/100;
        return si;
    }
    public double compoundInterest(double principalAmount,int time, double interestRate){
        double ci;
        ci = (principalAmount * Math.pow((1+interestRate/100),time));
        return ci;
    }

}

public class Assignment1Q3 {
    public static void main(String  [] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter principalAmount: ");
        double principalAmount = userInput.nextDouble();
        System.out.print("Enter time: ");
        int time = userInput.nextInt();
        System.out.print("Enter interestRate:");
        double interestRate = userInput.nextDouble();

        SiCi obj = new SiCi();
        double simpleInterest= obj.simpleInterest(principalAmount,time,interestRate);
        System.out.println("Simple Interest = "+ simpleInterest);
        double compoundInterest = obj.compoundInterest(principalAmount,time,interestRate);
        System.out.println("Compound Interest = "+ compoundInterest);
    }
}


