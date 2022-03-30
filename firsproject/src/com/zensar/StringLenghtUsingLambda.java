package com.zensar;
@FunctionalInterface
interface StringLength{
int getlength(String str);

}
public class StringLenghtUsingLambda {



public static void main(String[] args) {
// TODO Auto-generated method stub

StringLength stringLength = (String str)->str.length();
int length = stringLength.getlength("santhu");
System.out.println("Length : " + length);
}



}