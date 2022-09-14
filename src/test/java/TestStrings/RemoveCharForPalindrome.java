package TestStrings;

public class RemoveCharForPalindrome {

	static boolean checkPalindrome(String str, int first, int last) {
		while (first < last) {
			if (str.charAt(first) != str.charAt(last))
			{
				return false;
			}			
			first++;
			last--;
		}
		return true;
	}

	public static int possiblePalinByRemovingOneChar(String str) {
		int first = 0;
		int last = str.length() - 1;
		while (first < last) {
			if (str.charAt(first) != str.charAt(last)) {
				
				if (checkPalindrome(str, first + 1, last))
                    return first;
 
                if (checkPalindrome(str, first, last - 1))
                    return last;
                
                return -1;
			}
			else
			{
				first++; last--;
			}
		}
		return -2;

	}

	public static void main(String[] args) {
		String str = "abcba";
		//String str = "abcbea";
		//String str = "abecbea";
		int idx = possiblePalinByRemovingOneChar(str);

		if (idx == -1)
			System.out.println("Not Possible");
		else if (idx == -2)
			System.out.println("Possible without " + "removing any character");
		else
			System.out.println("Possible by removing" + " character at index " + idx);

	}

}
