package TestStrings;

import java.util.ArrayList;
import java.util.List;

/*We observe that a palindrome mirrors around its center.
Therefore, a palindrome can be expanded from its center, 
and there are only 2n – 1 such center.*/

public class LargestPalindromeSubArray {

	public static int[] longestPalindromeArr(int[] inpArr) {

		if (inpArr == null || inpArr.length < 1)
			return null;
		
		if (inpArr.length==1)
			return inpArr;

		int start = 0, subStrLen = 0;
		for (int i = 0; i < inpArr.length; i++) {
			int lenOdd = expandAroundCenter(inpArr, i, i); //when str length is odd
			int lenEven = expandAroundCenter(inpArr, i, i + 1); //when str length is even
			int maxLen = Math.max(lenOdd, lenEven);
			if (maxLen > subStrLen) {
				start = i - (maxLen - 1)/2;
				subStrLen = maxLen;
			}
		}
		///subStrLen-start+1
		int[] retArr = new int[subStrLen];
		for(int i=start;i<=subStrLen+1;i++)
		{
			retArr[i-start] = inpArr[i];
		}
		return retArr;
	}

	private static int expandAroundCenter(int[] arr, int left, int right) {
		while (left >= 0 && right < arr.length && arr[left] == arr[right]) {
			left--;
			right++;
		}
		return right - left - 1;
	}

	public static void main(String args[]) {
		int[] inputArray = {1,2,3,4,5,4,3,7,8};
		int[] palSubArray = longestPalindromeArr(inputArray);
		System.out.println("Length of Sub Array: "+palSubArray.length);
		System.out.print("Elements of Sub Array: ");
		for(int num:palSubArray)
		{
			System.out.print(num+" ");
		}
		
	}
}