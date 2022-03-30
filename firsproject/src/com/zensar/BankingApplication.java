package com.zensar;

public class BankingApplication {
	
	    public static void main(String[] args) {
	        Savings s = new Savings();
	        s.displayDetails("sai",33000);
	        s.calculateBalance(2);
			 Current c = new Current();
	        c.displayDetails("Ashiu",45000);
	        c.calculateBalance(5);
	        
	    }
	}
	class Savings {
	    double amount;
	 void displayDetails(String name,double amt)
	    {
	 System.out.println(name + " " + amt);
	      amount = amt;
	    }
	void calculateBalance(int year)
	    {
	        double interest = 4.5;
	        System.out.println("Curr Balance " + amount*interest*year);
	    }
	}
	class Current{
	    double amount;
	    void displayDetails(String name,double amt)
	    {
	        System.out.println(name + " " + amt);
	        amount = amt;
	    }
	 void calculateBalance(int year)
	    {
	        double interest  = 5.5;
	        System.out.println("Curr Balance " + amount*interest*year);

	    }

	}
