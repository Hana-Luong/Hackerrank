package practice;

import java.util.Scanner;

/*Lexicographical Order

  ball < cat, dog < dorm, Happy < happy, Zoo < ball

  A substring of a string is a contiguous block of characters in the string. 
  For example, the substrings of abc are a, b, c, ab, bc, and abc.
		
  Given a string, s, and an integer, k , complete the function so that it finds 
  the lexicographically smallest and largest substrings of length k .

		
		Constraints

		 consists of English alphabetic letters only (i.e., [a-zA-Z]).
		 
*/

public class String2 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        smallest = largest = s.substring(0,k);
        if (s.length() >=1 && s.length() <= 1000) {
           for (int i = 0; i <= s.length() - k; i++ ) {
        	   
               String current = s.substring(i, (i+k));
               if (current.compareTo(largest) > 0) {
                   largest = current; 
               }
               if (current.compareTo(smallest) < 0) {
                   smallest = current;
               }
           }
        }
        
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

