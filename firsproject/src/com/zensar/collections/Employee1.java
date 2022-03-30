package com.zensar.collections;

import java.util.HashMap;
import java.util.Map;

class DOB {
	public int day;
	public int month;
	public int year;
	public DOB(int day, int month, int year) {
		
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	@Override
	public String toString() {
		return "DOB [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	public class Employee1 {
		private void testAssignment3() {
			Map<DOB, String> hashMap = new HashMap<DOB,String>();
			hashMap.put(new DOB(12, 1, 2022),"Tom");
		}
	}
}
			    
			 