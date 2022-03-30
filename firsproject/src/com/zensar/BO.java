package com.zensar;

import com.zensar.BO.MathOperation;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.*;
import java.util.stream.*;

interface functionalInterface_Demo2
{
int value_display(int a1 , int b1);

    abstract void orders(int price);
}

public class BO {
	//1)Write an application to perform basic arithmetic operations like add, subtract, multiply & divide. You need to define a functional interface first//
	//2)Write an application using lambda expressions to print Orders having 2 criteria implemented: 1) order price more than 10000 2) order status is ACCEPTED or COMPLETED//
	//3)Use the functional interfaces Supplier, Consumer, Predicate & Function to invoke built-in methods from Java API//
	//4)Remove the words that have odd lengths from the list. HINT: Use one of the new methods from JDK 8. Use removeIf() method from Collection interfaRece//
	//5)Create a string that consists of the first letter of each word in the list of Strings provided. HINT: Use Consumer interface & a StringBuilder to construct the result//
	//6)Replace every word in the list with its upper case equivalent. Use replaceAll() method & UnaryOperator interface//
	//7)Convert every key-value pair of the map into a string and append them all into a single string, in iteration order. HINT: Use Map.entrySet() method & a StringBuilder to construct the result String//

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Map<Integer, String> map = new HashMap<>();
		        map.put(1, "ABC");
		        map.put(2, "PQR");
		        map.put(3, "XYZ");
		        String result = map.entrySet()
		            .stream()
		            .map(entry -> entry.getKey() + " - " + entry.getValue())
		            .collect(Collectors.joining(", "));
		        System.out.println(result);
		    }

		{
		List<String> List = new ArrayList<String>(); 
		List.add("I");
		List.add("Love");
		List.add("My");
		List.add("India");
		System.out.println("Before Converting  :: " + List);
		UnaryOperator <List<String>> MakingCaptialLettersOfWords = list -> 
		{ list.replaceAll(e-> e.toUpperCase());
		return list;};
		MakingCaptialLettersOfWords.apply(List);
		System.out.println("After Converting into Capital Letters :: " + List);
	}

		{
		List<String> Str = new ArrayList<String>();
		StringBuilder ListFirstCharacterStr = new StringBuilder();
		Str.add("I");
		Str.add("Love");
		Str.add("My");
		Str.add("World");
		Consumer<List<String>> CreateNewString = list -> 
		{
			list.forEach(e -> {ListFirstCharacterStr.append(e.charAt(0));});
		};
		CreateNewString.accept(Str);
		System.out.print("First Character of List are\n " + ListFirstCharacterStr);
		{
		
        ArrayList<String> arrayList = new ArrayList<String>
        (Arrays.asList("Tulasi", "saijyothi", "Vineetha", "Santhosh", "Ashiu"));      
         
        Predicate<String> filter = str -> (str.length()%2)!=0;
         
        System.out.println("Original ArrayList          : " + arrayList);
        boolean value = arrayList.removeIf(filter);
        System.out.println("Returned value : " + value);
        System.out.println("ArrayList after removeIf()  : " + arrayList);
        {
		System.out.println("----Supplier Interface----");
		Supplier<String> supplier= ()-> "ABC";
		System.out.println(supplier.get());

		System.out.println("----Consumer Interface----");
		Consumer<String> consumerString=s->System.out.println(s);
		consumerString.accept("XYZ");
		
		System.out.println("----Predicate Interface----");
		Predicate<Integer> predicate = i -> i > 100;
        	boolean greaterCheck = predicate.test(200);
        	System.out.println("is 200 greater than 100: "+greaterCheck);	
		
		System.out.println("----Funtion Interface----");
		Function<Integer,Double> functionSqrt = n -> Math.sqrt(n);
        	System.out.println("Square root of 49: "+functionSqrt.apply(49));
        	System.out.println("Square root of 81: "+functionSqrt.apply(81));
        	{
	    	NewFunc n = (price)->
	        {
	            if(price>1000)
	            {
	                System.out.println(price);
	                System.out.println("Completed");
	            }
	            else
	                System.out.println(price + "\nNot Completed");
	        };
	        n.orders(2600);
	        n.orders(3400);
		
	        LambdaAssignment tester = new LambdaAssignment();

	        MathOperation addition = (int a, int b) -> a + b;
	        MathOperation subtraction = (a, b) -> a - b;
	        MathOperation multiplication = (int a, int b) -> a * b;
	        MathOperation division = (int a, int b) -> a / b;
	   
	        System.out.println("Addition = " + addition.operation(15, 35));
	        System.out.println("Subtraction = " + subtraction.operation(15, 35));
	        System.out.println("Multiplication = " +multiplication.operation(15, 35));
	        System.out.println("Division  = " + division.operation(15, 35));
        	}}}}
      
interface MathOperation 
{
   int operation(int a, int b);
}
	
interface GreetingService 
{
   void sayMessage(String message);
}
	
private int operate(int a, int b, MathOperation mathOperation) 
{
   return mathOperation.operation(a, b);
}
}



