package classes;

import java.util.Scanner;

public class Employee {
	static Scanner sc= new Scanner(System.in);
	public String Name;
	public static double GrossSalary;
	public static double Tax;
	
	public void setName(String n) {
		Name = n;
	}
	public void setGrossSalary(double u) {
		GrossSalary = u;
	}
	public void setTax(double t) {
		Tax = t;
	}
	
	
	
	
	public double NetSalary() {
		return  GrossSalary - Tax;
		
	}
	public static double IncreaseSalary() {
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		
		return GrossSalary += GrossSalary * percentage /100.00;
	}
	
}
