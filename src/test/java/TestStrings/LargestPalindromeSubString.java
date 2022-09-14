package TestStrings;

/*1. By reverse input str and compare
2. compare 1st element to last element and so on
3. by mid point theory where L&R will be start from mid point*/

public class LargestPalindromeSubString {

	public static int longestPalSubstr(String str) {

		// All subStrings of length 1 are palindromes
		int maxLen = 1, start = 0;

		// Nested loop to mark start and end index
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				int flag = 1;

				// Check palindrome
				for (int k = 0; k < (j - i + 1) / 2; k++)
					if (str.charAt(i + k) != str.charAt(j - k))
						flag = 0;

				// Palindrome
				if (flag != 0 && (j - i + 1) > maxLen) {
					start = i;
					maxLen = j - i + 1;
				}
			}
		}
		
		System.out.print("Longest palindrome subString is: ");
	    for (int i = start; i <= start + maxLen - 1; ++i)
	        System.out.print(str.charAt(i));

		// return length of LPS
		return maxLen;
	}

	public static void main(String args[]) {
		// Your code goes here
		String s = "forgeeksskeegfor";
		System.out.println("\nSize of palindrom: "+longestPalSubstr(s));
	}
}
