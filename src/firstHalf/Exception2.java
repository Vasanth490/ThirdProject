package firstHalf;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {	int a[]=new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("You should not add the values exceeding the size");
	}
	}

}
