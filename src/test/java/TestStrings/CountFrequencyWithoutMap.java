package TestStrings;

import java.util.HashSet;
import java.util.Set;


public class CountFrequencyWithoutMap {

	void printFrequency(int num[], int size) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < size; i++) {
			int count = 0;
			if (!set.contains(num[i])) {
				for (int j = i; j < size; j++) {
					if (num[i] == num[j]) {
						count++;
						set.add(num[i]);
					}	
				}
				System.out.println(num[i] + ":" + count);
			}
		}
	}

	// Driver code
	public static void main(String[] args) {
		CountFrequencyWithoutMap obj = new CountFrequencyWithoutMap();
		int arr[] = { 11, 66, 11, 33, 22, 11, 66, 22};
		int arr_size = arr.length;

		obj.printFrequency(arr, arr_size);
	}
}
