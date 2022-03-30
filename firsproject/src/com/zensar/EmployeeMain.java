package com.zensar;

import java.util.Scanner;

class Employee {
	private static final double Salary = 0;
	int id;
	private String name;
	private double salary;
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
public class EmployeeMain {
	private String eId;
	private String EName;
	private String eSalary;
	
	//1)Write a class Employee having fields id, name & salary. Add constructor, getter/setter & toString()//
	//Create a custom annotation & apply it on any method of the class Employee.//
	public EmployeeMain(String eId, String eName, String eSalary) {
		super();
		this.eId = eId;
		EName = eName;
		this.eSalary = eSalary;
	}
	public EmployeeMain() {
		super();
	}
	
	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
	public String getEName() {
		return EName;
	}
	public void setEName(String eName) {
		EName = eName;
	}
	public String geteSalary() {
		return eSalary;
	}
	public void seteSalary(String eSalary) {
		this.eSalary = eSalary;
	}
	@Override
	public String toString() {
		return "EmployeeMain [eId=" + eId + ", EName=" + EName + ", eSalary=" + eSalary + "]";
	}}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        System.out.print("How many employees? ");
        int n = sc.nextInt();
        Employee emp[] = new Employee[n];
        for (int i = 0; i < n; i++) {
        EmployeeMain[] e;
		e[i] = new EmployeeMain();
        System.out.println("Enter " + (i + 1) + " Employee data :");
        System.out.print("Enter employee id :");
        emp[i].id = sc.nextInt();
        System.out.print("Enter employee name :");
        emp[i].name = sc.next();
        System.out.print("Enter employee salary :");
        Scanner sc1 = new Scanner(System.in);
        System.out.print("How many employees? ");
        int n1 = sc1.nextInt();
        Employee emp1[] = new Employee[n1];
        for (int i1 = 0; i1 < n1; i1++) {
        try {
			emp1[i1] = new Employee(Id, Name, Salary);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        System.out.println("Enter " + (i1 + 1) + " Employee data :");
        System.out.print("Enter employee id :");
        emp1[i1].id = sc1.nextInt();
        System.out.print("Enter employee name :");
        emp1[i1].name = sc1.next();
        
        System.out.print("Enter employee salary :");
        emp1[i1].salary = sc1.nextFloat();
        emp1[i1].salary = sc1.nextFloat();
        }
        }
	}
}