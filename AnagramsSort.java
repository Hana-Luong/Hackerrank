package Anagrams;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramsSort {
	
	static boolean isAnagram(String a, String b) {
		// Complete the function

		char[] c = a.toLowerCase().toCharArray();
		char[] d = b.toLowerCase().toCharArray();
		Arrays.sort(c);
		Arrays.sort(d);
    
 	   return Arrays.equals(c,d);   	 
 	
}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
