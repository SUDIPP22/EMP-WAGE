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
        int empcheck = (int) Math.floor(Math.random() * 10) % 3;

        switch (empcheck) {
            case 1:
                empHrs = 8;
                System.out.println("Employee is present and working as a Full-Time employee");  //Full time
                break;
            case 2:
                empHrs = 4;
                System.out.println("Employee is present and working as a Part-Time employee ");  //Part time
                break;
            default:
                empHrs = 0;
                System.out.println("Employee is Absent ");  //Absent
        }

        dailyWage = empHrs * WAGE_PER_HOUR;
        System.out.println("Employee Wage is = " + dailyWage);
    }
}
