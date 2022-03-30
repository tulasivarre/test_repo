package com.zensar.collections;
import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListBackwardExample {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("san");
		list.add("man");
		list.add("tan");
		list.add("ran");

		ListIterator<String> li = list.listIterator();
		while (li.hasNext()) {
		li.next();
		}
		System.out.println("array list in backward direction: ");
		while (li.hasPrevious()) {
		System.out.println(li.previous());
		}
}
}
