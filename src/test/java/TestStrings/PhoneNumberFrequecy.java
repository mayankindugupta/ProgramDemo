package TestStrings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneNumberFrequecy {

	void printPhoneFrequency(String arr[], int size) {
		Map<String, Integer> mapObj = new HashMap<>();

		for (int i = 0; i < size; i++) {
			if (mapObj.containsKey(arr[i])) {
				mapObj.put(arr[i], mapObj.get(arr[i]) + 1);
			} else {
				mapObj.put(arr[i], 1);
			}
		}

		for (String k : mapObj.keySet()) {
			System.out.println(k + ":" + mapObj.get(k));
		}

		Set<String> set = new HashSet<>();
		for (String a : arr) {
			set.add(a);
		}
	       System.out.println("DuplicateLess: "+set);
	}

	// Driver code
	public static void main(String[] args) {
		PhoneNumberFrequecy obj = new PhoneNumberFrequecy();
		String arr[] = { "9871596234", "9958996397", "9873161271", "9871596234", "9873161271", "9871596234",
				"8798674309" };
		int arr_size = arr.length;

		obj.printPhoneFrequency(arr, arr_size);
	}
}
/*  
9873161271:2
9871596234:3
9958996397:1
8798674309:1
DuplicateLess: [9873161271, 9871596234, 9958996397, 8798674309]
*/