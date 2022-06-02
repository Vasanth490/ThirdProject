package firstHalf;

import java.util.Scanner;

public class StringPalindrome {
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
	if(read.equals(reverse))
	{
		System.out.println("It is a palindrome");
	}
	else System.out.println("It is not a palindrome");

	}
}
