package com.zensar.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

class Item1 {
public String name;
public Item1(String name) {
this.name = name;
}
@Override
public String toString() {
return name;
}
}

public class CollectionTest {
private static void testHashMap() {
	Map<String,Item1> hashMap = new HashMap<String,Item1>();
	hashMap.put("chair", new Item1("wooden chair"));
	hashMap.put("Table", new Item1("wooden Table"));
	hashMap.put("Laptop", new Item1("HP laptop"));
	String itemKey = null;
	Item1 itemValue = new Item1("ICE CREAM");
	if(itemKey!=null && itemValue!=null)
	hashMap.put(itemKey, itemValue);

	Item1 item = hashMap.get("Laptop");
	System.out.println("Item1 : " + item);
	}

private static void testHashtable() {
Map<String,Item1> hashtable = new Hashtable<String,Item1>();
hashtable.put("chair", new Item1("wooden chair"));
hashtable.put("Table", new Item1("wooden Table"));
hashtable.put("Laptop", new Item1("HP laptop"));
String itemKey = null;
Item1 itemValue = new Item1("ICE CREAM");
if(itemKey!=null && itemValue!=null)
hashtable.put(itemKey, itemValue);

Item1 item = hashtable.get("Laptop");
System.out.println("Item1 : " + item);
}

private static void testArryList() {
List<String> arrayList = new ArrayList<String>();
arrayList.add("Tom");
arrayList.add("Jerry");
arrayList.add("Ivan");
arrayList.remove("Jerry");
Iterator<String> itr =arrayList.iterator(); //itr is similar to linkedlist HEAD
while(itr.hasNext()) {
String name = itr.next();
System.out.println(name);
}
}

private static void testVector() {
List<String> vector = new Vector<String>();
vector.add("Tom");
vector.add("Jerry");
vector.add("Ivan");
vector.remove("Jerry");
Iterator<String> itr =vector.iterator(); //itr is similar to linkedlist HEAD
while(itr.hasNext()) {
String name = itr.next();
System.out.println(name);
}
Vector<String> vector_2 = new Vector<String>();
vector.add("Tom");
vector.add("Jerry");
vector.add("Ivan");
vector.remove("Jerry");
vector.add("Tom");
vector.add("Jerry");
vector.add("Ivan");
vector.remove("Jerry");
System.out.println("Capacity :" + vector_2.capacity());
System.out.println("Size :" + vector_2.size());
}
private static void testLinkedList() {
List<String> linkedList = new LinkedList<String>();
linkedList.add("Tom");
linkedList.add("Jerry");
linkedList.add("Ivan");
linkedList.remove("Jerry");
Iterator<String> itr = linkedList.iterator(); //itr is similar to linkedlist HEAD
while(itr.hasNext()) {
String name = itr.next();

System.out.println(name);
}
}
public static void main(String[] args) {
// TODO Auto-generated method stub
//testLinkedList();
//testArryList();
//testVector();
testHashtable();
}

}