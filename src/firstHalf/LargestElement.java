package firstHalf;

import java.util.Scanner;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size=s.nextInt();
		int [] a=new int[size];
		System.out.println("Enter the elements : ");
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		System.out.println("The largest element in an array :");
		int largest=a[0];
		for (int i = 0; i < a.length; i++) {
			if(largest<a[i])
			{
				largest=a[i];
			}
		}
		System.out.println(largest);
	}

}
