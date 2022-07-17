package TestStrings;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicateNumber {

	void printRepeating(int arr[], int size) {
		System.out.println("The repeating elements are : ");
		Set<Integer> set = new HashSet<>();
		for (int i : arr) {
			set.add(i);
		}
		System.out.println(set);
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	// Driver code
	public static void main(String[] args) {
		RemoveDuplicateNumber duplicate = new RemoveDuplicateNumber();
		int arr[] = { 11, 66, 11, 33, 66, 22, 11 };
		int arr_size = arr.length;

		duplicate.printRepeating(arr, arr_size);
	}
}

/*
The repeating elements are : 
[33, 66, 22, 11]
33
66
22
11
*/