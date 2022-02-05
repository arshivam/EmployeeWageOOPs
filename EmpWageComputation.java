package com.bridgelabz.emoplyeewageoops;

class EmpWage {
	static final int IS_PART_TIME = 1;
	static final int IS_FULL_TIME = 2;
	static final int WAGE_PER_HRS = 20;
	static final int NO_OF_WORKINGDAYS = 20;
	static final int MAX_WORKING_HRS = 100;

	public void empWageCalculation() {
		int totalEmpWage = 0, totalWorkingDays = 0, totalEmpHrs =0;

		while (totalEmpHrs <= MAX_WORKING_HRS &&
				totalWorkingDays < NO_OF_WORKINGDAYS)
		{
			int empHrs = 0;
			totalWorkingDays++;
			int empcheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empcheck)
			{
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
				break;
			}
			totalEmpHrs += empHrs;
			int empWage =empHrs * WAGE_PER_HRS;
			totalEmpWage += empWage;
		}
		System.out.println("Total Employee Wage :"+ totalEmpWage);
	}
}

public class EmpWageComputation {
	public static void main(String[] args) {
		EmpWage a = new EmpWage();
		a.empWageCalculation();	
	}
}
