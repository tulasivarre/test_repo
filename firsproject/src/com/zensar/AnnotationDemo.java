package com.zensar;

import java.util.ArrayList;

@FunctionalInterface
interface Employee
{
	void show();
	
}
class A
{
	public void showMyDataFromLastYearDatabase()
	{
		System.out.println("in A");
	}
}
class B extends A
{
	@Deprecated
	public void show()
	{
		
	}
	@Override
	@SuppressWarnings("uncheck")
	public void showMyDataFromLastYearDatabase()
	{
		ArrayList obj = new ArrayList();
		System.out.println("in B");
	}
}
public class AnnotationDemo {

	public static void main(String[] args) {
		B obj = new B();
		obj.showMyDataFromLastYearDatabase();
		obj.show();

	}

}
