
import java.io.*;
import java.lang.*;
import java.util.*;



class Person{

int height_in_inches;

String name;
int weight;

public Person(int height_in_inches, String name, int weight)
{


this.height_in_inches = height_in_inches;
this.name = name;
this.weight = weight;
}


public String toString()
{

return this.height_in_inches + " " + this.name + " "
+ this.weight;
}
}



class Sortbyroll implements Comparator<Person> {


public int compare(Person a, Person b)
{

return a.height_in_inches - b.height_in_inches;
}
}



class Sortbyname implements Comparator<Person> {


public int compare(Person a, Person b)
{

return a.name.compareTo(b.name);
}
}



class PersonTest {


public static void main(String[] args)
{

ArrayList<Person> ar = new ArrayList<Person>();

ar.add(new Person(5, "Mayank", 50));
ar.add(new Person(4, "Anshul", 100));
ar.add(new Person(6, "Solanki", 40));
ar.add(new Person(4, "Aggarwal", 30));




System.out.println("Unsorted");


for (int i = 0; i < ar.size(); i++)
System.out.println(ar.get(i));


Collections.sort(ar, new Sortbyroll());


System.out.println("\nSorted by height");


for (int i = 0; i < ar.size(); i++)
System.out.println(ar.get(i));


Collections.sort(ar, new Sortbyname());


System.out.println("\nSorted by name");


for (int i = 0; i < ar.size(); i++)
System.out.println(ar.get(i));
}
}
