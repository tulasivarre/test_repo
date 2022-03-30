package com.zensar.collections;
import java.util.Iterator;
import java.util.List;

//Write a function that prints the list which has numbers(int, short, long,
//byte, double, float).

class NumericGenericWrapper<N extends Number> {
N data;
public void setDate(N data) {
this.data = data;
}
public N getData() {
return this.data;
}

}

public class GenericNumbersTest {

public static void printList() {

NumericGenericWrapper<Integer> ngw = new NumericGenericWrapper<Integer>();
ngw.setDate(1231313213);
Integer No = ngw.getData();
System.out.println("Integer Number : " +No);

NumericGenericWrapper<Float> ngw1 = new NumericGenericWrapper<Float>();
ngw1.setDate(934979f);
Float fltNo = ngw1.getData();
System.out.println("Float Number : " +fltNo);

NumericGenericWrapper<Long> ngw2 = new NumericGenericWrapper<Long>();
ngw2.setDate(93445454535979l);
Long lno = ngw2.getData();
System.out.println("Long Number : " +lno);

// NumericGenericWrapper<Byte> ngw3 = new NumericGenericWrapper<Byte>();
// ngw3.setDate(10);
// Byte bno = ngw2.getData();
// System.out.println("Number : " +bno);


NumericGenericWrapper<Double> ngw4 = new NumericGenericWrapper<Double>();
ngw4.setDate(12.387737234);
Double dno = ngw4.getData();
System.out.println("Double Number : " +dno);


NumericGenericWrapper<Short> ngw5 = new NumericGenericWrapper<Short>();
// ngw5.setDate(10000);
// Short Snoo = ngw5.getData();
// System.out.println("Number : " +Snoo);

}



public static void main(String[] args) {
printList();
}






}
