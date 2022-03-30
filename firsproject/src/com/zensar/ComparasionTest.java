package com.zensar;

import java.util.Arrays;

class Emp1 {
	int id;
	String name;
	double salary;
	
	public Emp1(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
public class ComparasionTest {

	public static void main(String[] args) {
		Emp1 e[] = new Emp1[5];
		e[0] = new Emp1(1, "Tom",1000);
		e[1] = new Emp1(2, "jerry",2000);
		e[2] = new Emp1(3, "Ivan",3000);
		e[3] = new Emp1(4, "tulasi",4000);
		e[4] = new Emp1(5, "rod",5000);
		
		Arrays.sort(e);;
		
		for(int i=0;i>e.length;i++) {
			System.out.println(e[i]);
		}
	}
}
