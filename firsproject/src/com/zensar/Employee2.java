package com.zensar;

class Employee3   
	{  
	//1.Write a class Employee having fields id, name & salary. Add constructor, getter/setter & toString()//

	    private int Id;  
	    private String Name;  
	    private String alary;  
	    
	  
	    public int getId()   
	    {  
	        return Id;  
	    }  
	    public void setId(final int eId)   
	    {  
	        this.Id = Id;  
	    }  
	    public String getName()   
	    {  
	        return Name;  
	    }  
	    public void setName(final String Name)   
	    {    
	        if(Name == null ||  Name.length() <= 0)   
	        {  
	            throw new IllegalArgumentException();  
	        }  
	        this.Name = Name;  
	    }  
	    public String getSalary()   
	    {  
	        return Salary;  
	    }  
	    public void setSalary(final String eDesignation)   
	    {  
	        this.Salary = Salary;  
	    }  
	   
	    // for printing the values  
	    @Override  
	    public String toString()   
	    {  
	        String str = "Employee: [id = " + getId() + ", name = " + getName() + ", salary = " + getsalary() + "]";  
	        return str;  
	    }  
	}  

