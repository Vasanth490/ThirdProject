package firstHalf;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=s.nextInt();
		int rev=0;
		for (int i = n; i>0; i=i/10) {
			int ld=i%10;
			rev=rev*10+ld;
			}
		System.out.println("The reversed number : ");
		System.out.println(rev);
	}

}
