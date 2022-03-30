package com.zensar.collections;
import java.util.HashSet;
import java.util.Set;



class Employee
{
public static final String Employee1 = null;
String name;
private int salary;
public Object dateOfBirth;



public Employee(String name, int salary)
{
this.name = name;
this.salary = salary;
}



@Override
public String toString() {
return "{" + name + ", " + salary + "}";
}



@Override
public boolean equals(Object o)
{
if (this == o) {
return true;
}
if (o == null || getClass() != o.getClass()) {
return false;
}



Employee employee = (Employee) o;



if (salary != employee.salary) {
return false;
}



if (name != null ? !name.equals(employee.name) : employee.name != null) {
return false;
}



return true;
}



@Override
public int hashCode()
{
int result = name != null ? name.hashCode() : 0;
result = 31 * result + salary;
return result;
}



public static Object Employee1() {
	// TODO Auto-generated method stub
	return null;
}
}

class EmployeeExample
{
// Program to demonstrate the need for overriding `equals` and `hashCode`
// method in Java
public static void main(String[] args)
{
Employee e1 = new Employee("san", 8000);
Employee e2 = new Employee("vinee", 8000);


Set<Employee> employees = new HashSet<>();


employees.add(e1);
employees.add(e2);



System.out.println(employees);
}
}