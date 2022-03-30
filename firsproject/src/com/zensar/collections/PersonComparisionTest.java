package com.zensar.collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



//Write a class Person having weight, height & name.
//Create multiple person objects & print them in the sorted order.
//In the sorting order first sort based upon their weight &
//if two persons have same weight them sort them based upon their height. Use TreeSet.




class PersonNameComparator implements Comparator<Person>{
@Override
public int compare(Person p1, Person p2) {
return p1.name.compareTo(p2.name);
}
}
class PersonHeightComparator implements Comparator<Person>{



@Override
public int compare(Person p1, Person p2) {
if(p1.height_in_inches > p2.height_in_inches) {
return 1;
}
else if (p1.height_in_inches < p2.height_in_inches) {
return -1;
}
return 0;
}
}
class PersonWeightComparator implements Comparator<Person> {



@Override
public int compare(Person p1, Person p2) {
if(p1.weight > p2.weight) {
return 1;
}
else if (p1.weight < p2.weight) {
return -1;
}
return 0;
}
}
class Person implements Comparable<Person>{
String name;
double height_in_inches;
double weight;

public Person(String name, double height_in_inches, double weight) {
super();
this.name = name;
this.height_in_inches = height_in_inches;
this.weight = weight;
}
@Override
public String toString() {
return "Person [name=" + name + ", height_in_inches=" + height_in_inches + ", weight=" + weight + "]";
}

@Override
public int compareTo(Person o) {
// TODO Auto-generated method stub
return 0;
}
}



public class PersonComparisionTest {

private static void testTreeSet() {
Set<Person> empTreeSet = new TreeSet<Person>(new PersonWeightComparator());
empTreeSet.add(new Person("Pavan", 5.8, 68));
empTreeSet.add(new Person("Kumar", 5.7, 76));
empTreeSet.add(new Person("Jo", 5.2, 55));
empTreeSet.add(new Person("John", 7, 92));

Iterator<Person> itr1 = empTreeSet.iterator();
while(itr1.hasNext()) {
Person key = itr1.next();
System.out.println("Key = " + key);
}

}
public static void main(String[] args) {

testTreeSet();
}
}
