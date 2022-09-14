package TestStrings;

import java.util.Set;
import java.util.TreeSet;

public class CommonCharactersInStringArray {

	public static void main(String[] args) {

		String[] strArr = {"sugarcane","cigar","garland"};//{ "abcd", "bcd", "cda", "da" };
		Set<Character> set = new TreeSet<>();
		char[] charArr= {};
		for (int k = 0; k < strArr.length; k++) {
			String str1 ="";
			String str2 = "";
			if (k == 0) {
				str1 = strArr[k];
				str2 = strArr[k+1];
				charArr = new char[strArr[0].length()];
				for (int i = 0; i < str1.length(); i++) {
					for (int j = 0; j < str2.length(); j++) {
						if (str1.charAt(i) == str2.charAt(j)) {
							charArr[i]=str1.charAt(i);
						}
					}
				}
				k++;
			}
			else
			{
				String tempStr = new String(charArr);
				str1=tempStr;
				str2 = strArr[k];
				charArr= new char[str1.length()];;
				for (int i = 0; i < str1.length(); i++) {
					for (int j = 0; j < str2.length(); j++) {
						if (str1.charAt(i) == str2.charAt(j)) {
							charArr[i]=str1.charAt(i);
						}
					}
				}
			}
			if(k==strArr.length-1)
			{
				for(char c: charArr)
				{
					if(c>=65 && c<=122)
					set.add(c);
				}
				System.out.println(set);
			}
		}
	}
}
