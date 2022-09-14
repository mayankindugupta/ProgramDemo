package TestStrings;

import java.util.Arrays;
import java.util.HashMap;

public class AnagramStrings {

	static boolean anagramUsingLoop(String str1, String str2) {

		String rStr1 = str1.replaceAll("\\s", "");
		String rStr2 = str2.replaceAll("\\s", "");

		rStr1 = rStr1.toLowerCase();
		rStr2 = rStr2.toLowerCase();

		// check if length is same
		if (rStr1.length() != rStr2.length()) {
			return false;
		} else {

			// convert strings to char array
			char[] charArray1 = rStr1.toCharArray();
			char[] charArray2 = rStr2.toCharArray();

			// sort the char array
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

			// if sorted char arrays are same then the string is anagram
			boolean result = Arrays.equals(charArray1, charArray2);

			if (result)
				return true;
			else
				return false;
		}
	}

	static boolean anagramUsingMap(String a, String b) {
		
		a = a.replaceAll("\\s", "").toLowerCase();
		b = b.replaceAll("\\s", "").toLowerCase();

		if (a.length() != b.length()) {
			return false;
		}

		HashMap<Character, Integer> map = new HashMap<>();

		// Loop over all character of String a and put in HashMap.
		for (int i = 0; i < a.length(); i++) {
			if (map.containsKey(a.charAt(i)))
				map.put(a.charAt(i), map.get(a.charAt(i)) + 1);
			else
				map.put(a.charAt(i), 1);
		}

		// Now loop over String b
		for (int i = 0; i < b.length(); i++) {
			// Check if current character already exists in HashMap/map
			if (map.containsKey(b.charAt(i)))
				map.put(b.charAt(i), map.get(b.charAt(i)) - 1);
			else
				return false;
		}

		// Loop over all keys and check if all keys are 0.
		for (char key : map.keySet()) {
			if (map.get(key) != 0) {
				return false;
			}
		}

		// Returning True as all keys are zero
		return true;
	}

	public static void main(String[] args) {
		String str1 = "My Name is Mayank";// "Race";
		String str2 = "Mayank My name is";// "Care";

		System.out.println("Are Strings Anagram using loop with Big O = nlogn: " + anagramUsingLoop(str1, str2));
		System.out.println("Are Strings Anagram using map with Big O = n: " + anagramUsingMap(str1, str2));
	}
}
