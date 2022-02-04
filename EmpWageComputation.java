package com.bridgelabz.emoplyeewageoops;

class EmpWage {
	static final int ISPARTTIME = 1;
	static final int ISFULLTIME = 2;
	static final int WAGEPERHRS = 20;
	static final int NOOFWORKINGDAYS = 20;
	static final int MAXWORKINGHRS = 100;

	public void calculation() {
		int totalEmpWage = 0, totalWorkingDays = 0, totalEmpHrs =0;

		while (totalEmpHrs <= MAXWORKINGHRS &&
				totalWorkingDays < NOOFWORKINGDAYS)
		{
			int empHrs = 0;
			totalWorkingDays++;
			int empcheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empcheck)
			{
			case ISPARTTIME:
				empHrs = 4;
				break;
			case ISFULLTIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
				break;
			}
			totalEmpHrs += empHrs;
			int empWage =empHrs * WAGEPERHRS;
			totalEmpWage += empWage;
		}
		System.out.println("Total Employee Wage :"+ totalEmpWage);
	}
}

public class EmpWageComputation {
	public static void main(String[] args) {
		EmpWage a = new EmpWage();
		a.calculation();	
	}
}
