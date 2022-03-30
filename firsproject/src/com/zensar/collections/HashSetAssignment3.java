package com.zensar.collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetAssignment3 {

public static void main(String[] args) {
Set<String> hset = new LinkedHashSet<String>();
System.out.println("original list: using LinkedHashSet()");
hset.add("tom");
hset.add("jerry");
hset.add("mrbean");
hset.add("doramon");
Iterator<String> itr = hset.iterator();
while(itr.hasNext()) {
String key = itr.next();
System.out.println(key);
}

Set<String> hset1 = new HashSet<String>();
System.out.println("unordered list: using HashSet() ");
hset1.add("tom");
hset1.add("jerry");
hset1.add("mrbean");
hset1.add("doramon");
Iterator<String> itr1 = hset1.iterator();
while(itr1.hasNext()) {
String key1 = itr1.next();
System.out.println(key1);
}

}

}
