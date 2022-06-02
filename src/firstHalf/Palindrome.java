package firstHalf;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
	
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n= s.nextInt();
	int rev=0;
	for (int i = n; i>0; i=i/10) {
		int lastDigit=i%10;
		rev=rev*10+lastDigit;
		}
	if(rev==n)
	{
		System.out.println("It is a palindrome.");
	}
	else System.out.println("It is not a palindrome");
	}
}
