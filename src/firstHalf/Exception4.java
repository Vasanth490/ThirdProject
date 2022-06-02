package firstHalf;

public class Exception4 {
	public static void main(String args[])
	{
	try {
	int num = Integer.parseInt ("qwert") ;
	System.out.println(num);
	} 
	catch(NumberFormatException e) {
	System.out.println("Number format exception");
	}
	}

}
