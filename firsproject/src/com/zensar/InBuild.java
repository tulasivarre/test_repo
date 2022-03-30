package com.zensar;


	import java.util.function.Supplier;

import com.zensar.LambdaAssignment.MathOperation;

import java.util.function.Consumer;
	import java.util.function.Function;
	import java.util.function.Predicate;


	public class InBuild {
	

		public static void main(String[] args) 
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
			
			 
		}

	}
	interface MathOperation 
	{
	   int operation(int a, int b);
	}
		
	interface GreetingService 
	{
	   void sayMessage(String message);
	}
	private int operation(int a, int b, MathOperation mathOperation) 
	
	{
	   return mathOperation.operation(a, b);
}

}
