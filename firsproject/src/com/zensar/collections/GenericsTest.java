package com.zensar.collections;

import java.util.ArrayList;
import java.util.List;

/*
class GenericWrapper {
	Object data;
	public void setData(Object data) {
		this.data = data;
	}
	public Object getData() {
		return this.data;
	}
}
*/
class NumericGenericWrapper<N extends Number> {
	N data;
	public void setData(N data) {
		this.data = data;
	}
	public N getData() {
		return this.data;
	}
}
class GenericWrapper<T> {
	T data;
	public void setData(T data) {
		this.data = data;
	}
	public T getData() {
		return this.data;
	}
}
public class GenericsTest {
	public static void printList(List<? extends Numbernumbers) {
		for(int i=0;i<numbers.size();i++)
			System.out.println(numbers.get(i));
}
	public static void foo(Number number) {}
	public static void main(String[] args) {
		int x = 10;
		foo(x);
		double d = 21.88;
		foo(d);
	}
	List<Number> intList = new ArrayList<Integer>();
	printList(intList);
		
		GenericWrapper genericWrapper = new GenericWrapper();
		genericWrapper.setData(12);
		System.out.println("getData() : " + genericWrapper.getData());
		genericWrapper.setData("Zensar");;
		System.out.println("getData() : " + genericWrapper.getData());
		
	
	

}
