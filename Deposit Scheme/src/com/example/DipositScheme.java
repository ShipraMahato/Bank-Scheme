package com.example;

import java.util.Scanner;

public class DipositScheme {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in); 
		 System.out.println("Enter the  Name of customer");
		 String name= sc.next();
		 System.out.println("Enter the  age of customer");
		 int age= sc.nextInt();
		 System.out.println("Enter the amount (sum) :"); 
	     int sum = sc.nextInt();   
	     System.out.println("Enter the  term ");
		 int term= sc.nextInt();
		   
		   double totalAmount = 0 ;
		   double InterestEarned = 0;
		if(age< 60)
		   {
	        if( term <=1)  
	        {  InterestEarned=(sum*7.5)/100;
	           totalAmount = sum +InterestEarned ;
	        }  
	        else if(term >1 && term <=2)
	        {  InterestEarned=(sum*8.5)/100;
	           totalAmount = sum +InterestEarned ;  
	        }  
	        else if(term >2 && term <=3)  
	        {  InterestEarned=(sum*9.5)/100;
	           totalAmount = sum +InterestEarned ;
	        }  
	        else if( term >=3)  
	        {  InterestEarned=(sum*10.5)/100;
	           totalAmount = sum +InterestEarned ;
	        }  
		   
	        System.out.println( totalAmount);   
	} 
	        if(age>= 60)
	        	if( term <=1)  
		        {  InterestEarned=(sum*8.0)/100;
		           totalAmount = sum +InterestEarned ;
		        }  
		        else if(term >1 && term <=2)
		        {  InterestEarned=(sum*9.0)/100;
		           totalAmount = sum +InterestEarned ;  
		        }  
		        else if(term >2 && term <=3)  
		        {  InterestEarned=(sum*10.0)/100;
		           totalAmount = sum +InterestEarned ;
		        }  
		        else if( term >=3)  
		        {  InterestEarned=(sum*11.0)/100;
		           totalAmount = sum +InterestEarned ;
		        }  
			 System.out.println("Total amount "+"after "+term+"years will be Rs."+totalAmount);
	               
	    }   
		
	}


