package com.zensar;

interface AddTwoNum{
int add(int a,int b);
}
public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddTwoNum ad1=(a,b)->(a+b);
		System.out.println(ad1.add(11,2));
	}

}
