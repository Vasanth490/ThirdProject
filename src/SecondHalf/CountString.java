package SecondHalf;

public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub       
		        String str= "Hello world";    
		        int count = 0;    
		            
		       for(int i = 0; i < str.length(); i++) 
		        {    
		            if(str.charAt(i) !=' ')    
		                count++;    
		        }  
		            
		        
		        System.out.println("Total number of characters in a string: " + count);    
		       }   
}
