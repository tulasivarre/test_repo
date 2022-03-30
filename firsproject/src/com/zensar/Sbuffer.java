package com.zensar;
	public class Sbuffer
	{
	    public static void main(String[] args) 
	    {
	        String s1 = "immutable";
	        System.out.println("String");
	        System.out.println(s1);
	        System.out.println("************");
	        StringBuilder sb = new StringBuilder("mutable");
	        System.out.println("String Builder");
	        System.out.println(sb);
	        System.out.println("************");
	        StringBuffer sb1 = new StringBuffer("mutable");
	        System.out.println("String Buffer");
	        System.out.println(sb1);
	    }
	}

