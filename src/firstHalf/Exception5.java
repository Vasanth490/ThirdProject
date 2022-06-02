package firstHalf;

public class Exception5 {
	public static void main(String args[])
		{
		try {
		String a = "How are you "; // length is 22
		char c = a.charAt(18); // accessing 25th element
		System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e) {
		System.out.println("StringIndexOutOfBoundsException");
		}


	}

}
