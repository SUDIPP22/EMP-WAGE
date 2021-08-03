package com.bridgelabz;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        //constant
        int IS_PRESENT = 1;
        int WAGE_PER_HOUR = 20;
        int FULL_TIME = 8;
        int dailyWage = 0;
        //calculation
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (IS_PRESENT == empcheck) {
            System.out.println("Employee is present"); //Employee is present
            dailyWage = WAGE_PER_HOUR * FULL_TIME;
        } else {
            System.out.println("Employee is absent");  //Employee is absent
        }
        System.out.println("Employee Wage = " + dailyWage);
    }
}
