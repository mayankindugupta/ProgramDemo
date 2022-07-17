package TestStrings;

import java.util.Arrays;

public class BinarySearchClass {

	int binarySearch(int arr[], int size, int val) {
		int flag = -1;
		int first = 0;
		int last = size - 1;
		while (first <= last) {
			int mid = (first + last) / 2;
			if (arr[mid] == val) {
				flag = mid;
				break;
			} else if (arr[mid] > val)
				last = mid - 1;
			else
				first = mid + 1;
		}
		return flag;
	}

	// Driver code
	public static void main(String[] args) {
		BinarySearchClass obj = new BinarySearchClass();
		int arr[] = { 23, 11, 89, 33, 67, 2, 98 };
		Arrays.sort(arr);
		int arr_size = arr.length;
		int index = obj.binarySearch(arr, arr_size, 89);
		System.out.println(index);
	}
}
