package Anagrams;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramsHashMap {

	static boolean isAnagram(String a, String b) {
		// Complete the function
		a = a.toLowerCase(); 
		b = b.toLowerCase();
		
		HashMap<Character, Integer> map1 = new HashMap<>();
		Character map1Key = null;
		Integer map1Value;
		for (int i = 0; i < a.length(); i++) {
			map1Key = a.charAt(i);
			if (map1.containsKey(map1Key)) {
				map1Value = map1.get(map1Key) + 1;
				map1.replace(map1Key, map1Value);
			} else {
				map1.put(map1Key, 1);
			}
			HashMap<Character, Integer> map2 = new HashMap<>();
			Character map2Key = null;
			Integer map2Value;
			for (int j = 0; j < b.length(); j++) {
				map2Key = b.charAt(j);
				if (map2.containsKey(map2Key)) {
					map2Value = map2.get(map2Key) + 1;
				} else {
					map2.put(map2Key, 1);
				}
			}
			if (map1.equals(map2))
				return true;
		}
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