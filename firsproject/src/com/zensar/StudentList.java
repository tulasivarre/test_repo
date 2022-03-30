package com.zensar;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentList {

	private static final char[] Studentlist = null;
	private static Collection<String> studentList;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> StudentList = Arrays.asList("Tula", "Sai", "Vinee", "San");
		Predicate<String> predicate = (String name)-> name.length()%2!=0;
		
		List<String> OddNameStudentList = studentList.stream().filter(predicate).distinct().skip(1).limit(1).collect(Collectors.toList());
		char[] list;
		System.out.println(Studentlist);
	}

}
