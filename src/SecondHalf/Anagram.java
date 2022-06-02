package SecondHalf;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
  public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the string1 :");
    String str1 = s.next();
    System.out.println("Enter the string2 :");
    String str2 = s.next();
    
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

   
    if(str1.length() == str2.length()) {

      
      char[] charArray1 = str1.toCharArray();
      char[] charArray2 = str2.toCharArray();

    
      Arrays.sort(charArray1);
      Arrays.sort(charArray2);

      
      boolean result = Arrays.equals(charArray1, charArray2);

      if(result) {
        System.out.println(str1 + " and " + str2 + " are anagram.");
      }
      else {
        System.out.println(str1 + " and " + str2 + " are not anagram.");
      }
    }
    else {
      System.out.println(str1 + " and " + str2 + " are not anagram.");
    }
  }
}
