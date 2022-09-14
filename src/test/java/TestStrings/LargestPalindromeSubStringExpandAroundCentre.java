package TestStrings;

/*We observe that a palindrome mirrors around its center.
Therefore, a palindrome can be expanded from its center, 
and there are only 2n – 1 such center.*/

public class LargestPalindromeSubStringExpandAroundCentre {

	public static String longestPalindromeStr(String inpStr) {

		if (inpStr == null || inpStr.length() < 1)
			return "";
		
		if (inpStr.length()==1)
			return inpStr;

		int start = 0, subStrLen = 0;
		for (int i = 0; i < inpStr.length(); i++) {
			int lenOdd = expandAroundCenter(inpStr, i, i); //when str length is odd
			int lenEven = expandAroundCenter(inpStr, i, i + 1); //when str length is even
			int maxLen = Math.max(lenOdd, lenEven);
			if (maxLen > subStrLen) {
				start = i - (maxLen - 1)/2;
				subStrLen = maxLen;
			}
		}
		return inpStr.substring(start,start+subStrLen);
	}

	private static int expandAroundCenter(String str, int left, int right) {
		while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
			left--;
			right++;
		}
		return right - left - 1;
	}

	public static void main(String args[]) {
		// Your code goes here
		//System.out.println("\n" + longestPalindromeInt("forgeeksskeegfor"));
		String palSubStr = longestPalindromeStr("forgeeksskeegfor");
		System.out.println("Longest Palindrome Sub String: "+palSubStr);
		System.out.println("Length of Sub String: "+palSubStr.length());
	}
}