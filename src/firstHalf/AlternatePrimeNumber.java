package firstHalf;

import java.util.Scanner;

public class AlternatePrimeNumber {

		// TODO Auto-generated method stub
	
		public static int checkPrime(int num) 
		    { 
			int i, flag = 0; 
			for(i = 2; i<= num / 2; i++) 
			{ 
			   if(num % i == 0) 
			   { 
			       flag = 1; 
			       break; 
			   } 
			} 

			
			if(flag == 0) 
			   return 1; 
			else
			   return 0; 
		    } 

		    static void printAltPrime(int n) 
		    { 
			
			int temp = 2; 

			for(int num = 2; num <= n-1; num++) 
			{ 
			   
			   if (checkPrime(num) == 1) 
			   {  
				
				if (temp % 2 == 0) 
				   System.out.print(num + " "); 

				temp ++; 
			   } 
			} 
		    } 

		    public static void main(String[] args)  
		    { 
		    	Scanner s= new Scanner(System.in);
		    	System.out.println("Enter the alternate prime number to be printed within :");
			int num = s.nextInt(); 
			System.out.print("Alternate prime numbers upto " + num+" are: ");  
			printAltPrime(num); 
		    } 
}

