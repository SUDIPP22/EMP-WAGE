package com.bridgelabz;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        //constant
        int WAGE_PER_HOUR = 20;
        int NUM_OF_WORKING_DAYS = 20;
        int MAX_HRS_IN_MONTH = 100;
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;

        //variables
        int totalEmpHrs = 0;
        int empHrs = 0;
        int totalEmpWage = 0;
        int totalWorkingDays = 0;

        //calculation
        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;

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

            totalEmpHrs += empHrs;
            System.out.println("Day " + totalWorkingDays + " : Employee worked : " + empHrs + " Hours ");
        }
        totalEmpWage = totalEmpHrs * WAGE_PER_HOUR;
        System.out.println("Total Wages is : " + totalEmpWage);
    }
}
