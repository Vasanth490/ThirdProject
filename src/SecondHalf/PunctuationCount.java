package SecondHalf;

public class PunctuationCount {
	    public static void main (String [] args) {
	        //Stores the count of punctuation marks
	        int count= 0;
	        String str = "Hi! How are you?";
	        for (int i = 0; i < str.length(); i++) {
	                //Checks whether given character is punctuation mark
	            if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||str.charAt(i) == '?' || str.charAt(i) == '-' ||
	                    str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':') {
	                count++;
	            }
	        }
	        System.out.println("Total number of punctuation characters exists in string: " +  count);
	    }
	}


