package com.zensar;
	public class Diff 
	{
		public static void main(String[] args)
		{
	        String a = "ABC";
	        String b = new String("ABC");
	        if(a==b)
	            System.out.println("returns false");
	        else
	            System.out.println("Will not true beacause both are different in " + "space");
	        if(a.equals(b))
	            System.out.println("returns true");
	    }

}

