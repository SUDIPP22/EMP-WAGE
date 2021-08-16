package com.bridgelabz;

/**
 * Purpose : Computation of Employee Wage for
 * Multiple Companies in a procedural way
 * @author SUDIP PANJA
 * @version 11.0.11
 * @since 2021-08-12
 */
public class EmployeeWageBuilder {

    private final String company;
    private final int empWagePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursInMonth;
    private int totalEmpWage;

    /**
     * @param company This is the first parameter of EmployeeWage constructor
     * which represents company name
     * @param empWagePerHour This is the second parameter of EmployeeWage constructor
     * which consists employee rate per hour
     * @param numOfWorkingDays This is the third parameter of EmployeeWage constructor
     * which consists the number of working days of an employee
     * @param maxHoursInMonth This is the fourth parameter of EmployeeWage constructor
     * which hold the maximum hours the employee will be working
     */
    public EmployeeWageBuilder(String company, int empWagePerHour, int numOfWorkingDays, int maxHoursInMonth) {
        this.company = company;
        this.empWagePerHour = empWagePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursInMonth = maxHoursInMonth;
    }

    /**
     * This method is used to calculate Employee wage for
     * different companies in a procedural way.
     *
     */
    public void computeEmployeeWage() {
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
        totalEmpWage = totalEmpHrs * empWagePerHour;
        System.out.println("\nTotal Wage for Company " + company + " is : " + totalEmpWage);
    }

    @Override
    public String toString() {
        return "EmployeeWageBuilder{" +
                "company='" + company + '\'' +
                ", empWagePerHour=" + empWagePerHour +
                ", numOfWorkingDays=" + numOfWorkingDays +
                ", maxHoursInMonth=" + maxHoursInMonth +
                ", totalEmpWage=" + totalEmpWage +
                '}';
    }

    /**
     * This is the main method which makes use of EmployeeWage constructor and
     * create one object to initiate the values.
     * @param args Unused.
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        EmployeeWageBuilder dMart = new EmployeeWageBuilder("D-MART", 40, 30, 100);
        EmployeeWageBuilder bigBazaar = new EmployeeWageBuilder("BIG BAZAAR", 20, 20, 80);
        dMart.computeEmployeeWage();
        System.out.println(dMart);
        bigBazaar.computeEmployeeWage();
        System.out.println(bigBazaar);
    }
}
