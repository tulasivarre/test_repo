package com.zensar;

public class AbstractClassMain
	{
		public static void main(String[] args)
		{

			System.out.println("Drawing on rectangle");
			System.out.println("Drawing on cube");
			System.out.println("Drawing on line");
		}
	}
	abstract class Shape
	{
		public void draw()
		{
			System.out.println("Draw method in shape class");
		}
		public abstract double calculateArea();
	}
	class Rectangle extends Shape
	{	
		double length;
		double breadth;
		public Rectangle(double length, double breadth) 
		{
			super();
			this.length = length;
			this.breadth = breadth;
		}
		@Override
		public double calculateArea()
		{		
			return length*breadth;
		}
	}
	 class Cube extends Shape
	 {
		 double num1;
		 double num2;
		 double num3;
		 public Cube(double num1, double num2,double num3) 
			{
				super();
				this.num1 = num1;
				this.num2 = num2;
				this.num3 = num3;
			}
		 @Override
			public double calculateArea()
			{		
				return num1*num2*num3;
			}
	 }
