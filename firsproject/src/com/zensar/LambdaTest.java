package com.zensar;
interface MathOperation{
public int operation(int x,int y);
}
interface MathOperation2{
public int operation2(String a);
}public class LambdaTest { public static void main(String[] args) {
// TODO Auto-generated method stub
MathOperation addition=(int x,int y)->x+y;
MathOperation subtraction=(int x,int y)->x-y;
MathOperation multiplication=(int x,int y)->x*y;
MathOperation division=(int x,int y)->x/y;
MathOperation2 lenofstring=(String a)->a.length();
System.out.println(addition.operation(5, 10));
System.out.println(subtraction.operation(5, 10));
System.out.println(lenofstring.operation2("Hello")); 


	}

}
nen 