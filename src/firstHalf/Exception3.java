package firstHalf;
 class invalidPassword extends Exception
{
	 invalidPassword(String str)
	 {
		 super();
	 }
	}

public class Exception3 {

	public static void validate(String str) throws invalidPassword
	{
		if(str.length()<=7)
		{
			System.out.println("Type strong password");
		}
		else System.out.println("Password created");
	}
	public static void main(String[] args) throws invalidPassword {
		// TODO Auto-generated method stub
	
		validate("asdfgiilo");
	}

}
