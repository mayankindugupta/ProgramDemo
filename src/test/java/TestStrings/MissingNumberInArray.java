package TestStrings;

import java.util.Arrays;

public class MissingNumberInArray {

	int returnVal(int[] arr) {
		Arrays.sort(arr);
		int getVal = -1;
		int lastVal = arr[arr.length-1];
		System.out.print("Sorted Array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		if(arr[arr.length - 1]<0)
		{
			getVal= 1;
		}
		else
		{
		for (int i = 0; i < arr.length - 1; i++) {
			if (!(arr[i + 1] - arr[i] <= 1)) {
				getVal = arr[i] + 1;
			}	
		}
		}
		if (getVal == -1) 
		{
			getVal= lastVal+1;
		}
		return getVal;
	}

	public static void main(String[] args) {

		MissingNumberInArray obj = new MissingNumberInArray();
		int[] Arr1 = { 1, 2, 3 };
		int[] Arr2 = {1, 3, 6, 4, 1, 2};
		int[] Arr3 = {-1, -3};

		int retVal1 = obj.returnVal(Arr1);
		System.out.println("Value1:" + retVal1);
		int retVal2 = obj.returnVal(Arr2);
		System.out.println("Value2:" + retVal2);
		int retVal3 = obj.returnVal(Arr3);
		System.out.println("Value3:" + retVal3);
	}

}

/*
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 * 
 * Given A = [1, 2, 3], the function should return 4.
 * 
 * Given A = [−1, −3], the function should return 1.
 * 
 * Write an efficient algorithm for the following assumptions:
 * 
 * N is an integer within the range [1..100,000]; each element of array A is an
 * integer within the range [−1,000,000..1,000,000]. Copyright 2009–2021 by
 * Codility Limited. All Rights Reserved. Unauthorized copying, publication or
 * disclosure prohibited.
 */

/*
 * Example test: [1, 3, 6, 4, 1, 2] Output: 112346 OK
 * 
 * Example test: [1, 2, 3] Output: 123 WRONG ANSWER (got 2 expected 4)
 * 
 * Example test: [-1, -3] Output: -3-1 WRONG ANSWER (got -2 expected 1)
 */