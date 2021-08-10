package com.bridgelabz;

public class EmployeeWageBuilder {
    //constant
    public static final int WAGE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 100;
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    public static int computeEmployeeWage() {
        //variables
        int totalEmpHrs = 0;
        int empHrs;
        int totalWorkingDays = 0;

        //calculation
        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;

            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case 1:
                    empHrs = 8;
                    System.out.println("\nEmployee is present and working as a Full-Time employee");  //Full time
                    break;
                case 2:
                    empHrs = 4;
                    System.out.println("\nEmployee is present and working as a Part-Time employee ");  // Part-time
                    break;
                default:
                    empHrs = 0;
                    System.out.println("\nEmployee is Absent ");  //Absent
            }

            totalEmpHrs += empHrs;
            System.out.println("Day " + totalWorkingDays + " : Employee worked : " + empHrs + " Hours ");
        }
        int totalEmpWage = totalEmpHrs * WAGE_PER_HOUR;
        System.out.println("\nTotal Wage is : " + totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        computeEmployeeWage();
    }
}
