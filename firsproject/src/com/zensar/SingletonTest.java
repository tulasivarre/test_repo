package com.zensar;
class Singleton{
private static Singleton ref=null;
private Singleton() {}
public static Singleton getInstance() {
if(ref==null) {
ref=new Singleton();
}
return ref;
}

}

public class SingletonTest {
public static void main(String args[]) {
Singleton s= Singleton.getInstance();
Singleton s2= Singleton.getInstance();
Singleton s3= Singleton.getInstance();
System.out.println(s==s2);
System.out.println(s2==s3);
System.out.println(s==s3);
}
}