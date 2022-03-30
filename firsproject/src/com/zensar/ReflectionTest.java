package com.zensar;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;class House {
private String city = "Hyd";
private String houseNo = "8-149/9";
public void foo() {
System.out.println("Inside foo");
}
}
public class ReflectionTest {
public static void main(String[] args) throws Exception {
String className = args[0]; // java.lang.String
Class c = Class.forName(className); // forecefully loads the class definition inside code segment
Constructor con[] = c.getDeclaredConstructors();
Field f[] = c.getDeclaredFields();
Method m[] = c.getDeclaredMethods();
for(int i=0;i<con.length;i++)
System.out.println(con[i]);
for(int i=0;i<f.length;i++)
System.out.println(f[i]);
for(int i=0;i<m.length;i++)
System.out.println(m[i]);
Class classHouse = House.class;
con = classHouse.getDeclaredConstructors();
f = classHouse.getDeclaredFields();
m = classHouse.getDeclaredMethods();
for(int i=0;i<con.length;i++)
System.out.println(con[i]);
for(int i=0;i<f.length;i++)
System.out.println(f[i]);
for(int i=0;i<m.length;i++)
System.out.println(m[i]);
int modifiers = classHouse.getModifiers();
System.out.println("Is Abstract class ? : " +Modifier.isAbstract(modifiers));
System.out.println("Is Final class ? : " +Modifier.isFinal(modifiers));
Field cityField = classHouse.getDeclaredField("city");
Field houseField = classHouse.getDeclaredField("houseNo");
cityField.setAccessible(true);
houseField.setAccessible(true);
System.out.println("Private city filed : " +cityField.get(new House()));
System.out.println("Private houseNo : " +houseField.get(new House()));
}
}