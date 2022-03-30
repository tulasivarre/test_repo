package com.zensar;

public class ComplexNumber {
	
	   int real; 
	   int img;
		
	   
	   ComplexNumber(int r, int i){
		this.real = r;
		this.img = i;
	   }
		
	   public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2)
	  
	   
	   {
		
	        ComplexNumber temp = new ComplexNumber(0, 0);

	        temp.real = c1.real + c2.real;
	        temp.img = c1.img + c2.img;
	        
	        
	        return temp;
	    }
	    public static void main(String args[]) {
	    	
		ComplexNumber c1 = new ComplexNumber(2, 4);
		ComplexNumber c2 = new ComplexNumber(3, 5);
	        ComplexNumber temp = add(c1, c2);
	        
	        System.out.printf("Sum is: "+ temp.real+" + "+ temp.img +"i");
	       
	    }
	}
