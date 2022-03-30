package com.zensar;

interface Printable{
void print();
}
class Circle implements Printable{



@Override
public void print() {
System.out.println("Circle printed");// TODO Auto-generated method stub

}
}
class Emp implements Printable{
@Override
public void print() {
System.out.println("Circle printed");// TODO Auto-generated method stub

}

}
public class PrintableTest {

public static void main(String[] args) {
// TODO Auto-generated method stub

Printable p[] = new Printable[2];
p[0] = new Circle();
p[1] = new Emp();
printAll(p);
}
public static void printAll(Printable p[]) {
for(int i=0;i<p.length;i++) {
p[i].print();
}
}
}