package SecondHalf;

import java.util.Scanner;

public class SubsetOfString {

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = s1.nextLine();
	    int len = str.length();
	    int temp = 0;
	    String s11[] = new String[len*(len+1)/2];
	    for(int i = 0; i < len; i++)
	    {
	       for(int j = i; j < len; j++)
	       {
	    	   s11[temp] = str.substring(i, j+1);
	    	   temp++;
	       }
	    }
	    System.out.println("All subsets for given string are: ");
	    for(int i = 0; i < s11.length; i++)
	    {
	    	System.out.println(s11[i]);
	    }
	}
}

