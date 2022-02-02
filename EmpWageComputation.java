package com.bridgelabz.emoplyeewageoops;

class EmpWage {
	   static final int isparttime = 1;
	   static final int isfulltime = 2;
	   static final int wageperhour = 20;
	   static final int Num_Of_Workingdays = 20;
	   static final int MaxHrsinMonth = 100;

	   public void calculation() {
		   int totalEmpWage = 0, totalWorkingDays = 0, totalEmpHrs =0;

		   while (totalEmpHrs <= MaxHrsinMonth &&
		          totalWorkingDays < Num_Of_Workingdays)
		    {
		      int empHrs = 0;
		      totalWorkingDays++;
		      int empcheck = (int) Math.floor(Math.random() * 10) % 3;
		      switch (empcheck)
		      {
		        case isparttime:
		          empHrs = 4;
		        break;
		        case isfulltime:
		          empHrs = 8;
		        break;
		        default:
		          empHrs = 0;
		        break;
		      }
		      totalEmpHrs += empHrs;
		      int empWage =empHrs * wageperhour;
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
