package com.zensar.sort;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;



class PersonDetails implements Comparable<PersonDetails>{
private String name;
private int height;
private int weight;

public PersonDetails(String name, int height, int weight) {
super();
this.name = name;
this.height = height;
this.weight = weight;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public int getHeight() {
return height;
}

public void setHeight(int height) {
this.height = height;
}

public int getWeight() {
return weight;
}

public void setWeight(int weight) {
this.weight = weight;
}

@Override
public String toString() {
return "PersonDetails [name=" + name + ", height=" + height + ", weight=" + weight + "]";
}

@Override
public int compareTo(PersonDetails pd) {
// TODO Auto-generated method stub
int i = this.name.compareTo(pd.name);
if (i != 0)
return i;

return Integer.compare(this.height, pd.height);
}

}
public class Person1 {

public static void main(String[] args) {
// TODO Auto-generated method stub
List<PersonDetails> persondetails = new ArrayList<>();
persondetails.add(new PersonDetails("san",5,60));
persondetails.add(new PersonDetails("man",3,40));
persondetails.add(new PersonDetails("ran",6,70));
System.out.println("before sorting");
for (PersonDetails x : persondetails)
	System.out.println(x);

Comparator<PersonDetails> byName = new Comparator<PersonDetails>() {
public int compare(PersonDetails p1, PersonDetails p2) {
return p1.getName().compareTo(p2.getName());
}
};
persondetails.sort(byName);
System.out.println("name based sorting: ");
for(PersonDetails x : persondetails) {
System.out.println(x);
}
}

}
