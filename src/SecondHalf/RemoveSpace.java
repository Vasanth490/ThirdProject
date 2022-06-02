package SecondHalf;

import java.util.Scanner;

public class RemoveSpace {

	    public static void main(String[] args) {
	        String sentence = " How are you      doing";
	        System.out.println("Original sentence: " + sentence);

	        sentence = sentence.replaceAll("\\s", "");
	        System.out.println("After replacement: " + sentence);
	    }
	
}
