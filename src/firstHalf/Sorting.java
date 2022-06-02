package firstHalf;

import java.util.Scanner;

public class Sorting {
	public static void main(String[] args) {
		
	
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the size : ");
	int size=s.nextInt();
	int [] a=new int[size];
	System.out.println("Enter the elements :");
	for (int i = 0; i < a.length; i++) {
		a[i]=s.nextInt();
		}
	System.out.println("The sorted elements are : ");
	int temp;
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length-1-i; j++) {
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i] + " ");
	}
	}
}
