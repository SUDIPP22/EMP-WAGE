package com.bridgelabz;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        //constant
        int WAGE_PER_HOUR = 20;
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;

        //variables
        int dailyWage = 0;
        int empHrs = 0;

        //calculation
        double empcheck = Math.floor(Math.random() * 10) % 3;

        if (IS_FULL_TIME == empcheck) {
            empHrs = 8;
            System.out.println("Employee is present and working as a Full-Time employee");  //Full time
        } else if (IS_PART_TIME == empcheck) {
            empHrs = 4;
            System.out.println("Employee is present and working as a Part-Time employee ");  //Part time
        } else {
            empHrs = 0;
            System.out.println("Employee is abscent ");  //Abscent
        }

        dailyWage = empHrs * WAGE_PER_HOUR;
        System.out.println("Employee Wage is = " + dailyWage);
    }
}
