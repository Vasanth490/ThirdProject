package firstHalf;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args)
	{
	System.out.println("Enter string to reverse:");

	Scanner s = new Scanner(System.in);
	String read = s.nextLine();
	String reverse = "";


	for(int i = read.length() - 1; i >= 0; i--)
	{
	reverse = reverse + read.charAt(i);
	}

	System.out.println("Reversed string is:");
	System.out.println(reverse);
	}
	
}
