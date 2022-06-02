package firstHalf;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i=25;
			int j=1/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("The number should not be divided by zero");
		}

	}

}
