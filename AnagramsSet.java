package Anagrams;

import java.util.HashSet;
import java.util.Scanner;
//if there is not repetition


public class AnagramsSet {

	static boolean isAnagram(String a, String b) {
		// Complete the function
		a = a.toLowerCase(); 
		b = b.toLowerCase();
		HashSet<Character> set1 = new HashSet();  
		for (int i = 0; i < a.length(); i++) {
			set1.add(a.charAt(i));
		}
		HashSet<Character> set2 = new HashSet();  
		for (int j = 0; j < b.length(); j++) {
			set2.add(b.charAt(j));
		}			
		if (set1.equals(set2))
				return true;		
		return false;
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