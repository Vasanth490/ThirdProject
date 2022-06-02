package SecondHalf;

import java.util.Scanner;

public class MaxMinChar {
	
	   public static void main(String[] args) 
	   {  
	      Scanner s=new Scanner(System.in);
	      System.out.println("Enter the string: ");
	      String str=s.nextLine();
	      int[] ar = new int[str.length()];    
	      char minChar = str.charAt(0), maxChar = str.charAt(0);    
	      int i, j, min, max;            
	      char string[] = str.toCharArray();    
	      for(i = 0; i < string.length; i++) 
		  {    
	          ar[i] = 1;    
	          for(j = i+1; j < string.length; j++) 
			  {    
	              if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') 
				  {    
	                  ar[i]++;    
	                      
	                  string[j] = '0';    
	              }    
	          }    
	      }    
	      min = max = ar[0];    
	      for(i = 0; i <ar.length; i++) 
		  {    
	          if(min > ar[i] && ar[i] != '0') 
			  {    
	              min = ar[i];    
	              minChar = string[i];    
	          }    
	          if(max < ar[i]) 
			  {    
	              max = ar[i];    
	              maxChar = string[i];    
	          }    
	      }             
	      System.out.println("Minimum occurring character: " + minChar);    
	      System.out.println("Maximum occurring character: " + maxChar);    
	  }  
	}


