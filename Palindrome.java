package practice;

import java.util.Scanner;
import java.util.HashMap;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		sc.close();
		
		HashMap<Integer, Character> map1 = new HashMap<>();
		HashMap<Integer, Character> map2 = new HashMap<>();

		
		for (int i = 0; i <= (A.length() - 1)/2 ; i++) {
			map1.put(i, A.charAt(i));	
		}
		
		int j = 0;
		for (int i = A.length() - 1; i >=(A.length() - 1)/2 ; i--) {
			map2.put(j, A.charAt(i));
			j++; 
			if (j > (A.length() - 1)/2 ) {
				break;
			}			
		}
		if (map1.equals(map2)) 
			System.out.println("Yes");
		else
			System.out.println("No");     
	}
}
