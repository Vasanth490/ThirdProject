package firstHalf;

import java.util.Scanner;

public class SmallestElement {
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
		System.out.println("The smallest element in an array :");
		int smallest=a[0];
		for (int i = 0; i < a.length; i++) {
			if(smallest>a[i])
			{
				smallest=a[i];
			}
		}
		System.out.println(smallest);
	}

}
