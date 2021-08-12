package com.bridgelabz;

/**
 * Purpose : Computation of Employee Wage for
 * Multiple Companies in a procedural way
 * @author SUDIP PANJA
 * @version 11.0.11
 * @since 2021-08-12
 */
public class EmployeeWageBuilder {

    /**
     * This method is used to calculate Employee wage for
     * different companies in a procedural way.
     * @param company This is the first parameter of computeEmployeeWage method
     * which represents company name
     * @param empWagePerHour This is the second parameter of computeEmployeeWage method
     * which consists employee rate per hour
     * @param numOfWorkingDays This is the third parameter of computeEmployeeWage method
     * which consists the number of working days of an employee
     * @param maxHoursInMonth This is the fourth parameter of computeEmployeeWage method
     * which hold the maximum hours the employee will be working
     * @return Employee's total wage
     */
    public static int computeEmployeeWage(String company, int empWagePerHour,
                                          int numOfWorkingDays, int maxHoursInMonth) {
        //variables
        int totalEmpHrs = 0;
        int empHrs;
        int totalWorkingDays = 0;

        //calculation
        while (totalEmpHrs <= maxHoursInMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;

            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case 1:                                  /* Employee Works as a Full-time Employee */
                    empHrs = 8;
                    break;
                case 2:                                 /* Employee Works as a Part-time Employee */
                    empHrs = 4;
                    break;
                default:                               /* Employee is absent */
                    empHrs = 0;
            }

            totalEmpHrs += empHrs;
            System.out.println("\nDay " + totalWorkingDays + " : Employee worked : " + empHrs + " Hours ");
        }
        int totalEmpWage = totalEmpHrs * empWagePerHour;
        System.out.println("\nTotal Wage for Company " + company + " is : " + totalEmpWage);
        return totalEmpWage;
    }

    /**
     * This is the main method which makes use of computeEmployeeWage method
     * @param args Unused.
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        computeEmployeeWage("BIG BAZAAR", 20, 20, 80);
        computeEmployeeWage("D-MART", 40, 30, 100);
    }
}
