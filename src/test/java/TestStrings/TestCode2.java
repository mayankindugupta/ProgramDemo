package TestStrings;

import java.util.ArrayList;
import java.util.TreeMap;

public class TestCode2 {

	int returnVal(String S) {

		ArrayList<String> firstList = new ArrayList<>();
		ArrayList<String> secondList = new ArrayList<>();
		ArrayList<Integer> thirdlist = new ArrayList<>();
		TreeMap<String, Integer> firstMap = new TreeMap<>();
		TreeMap<String, Integer> secondMap = new TreeMap<>();

		for (int i = 0; i < S.length(); i++) {
			for (int j = i + 1; j <= S.length(); j++) {
				if (i != j)
					firstList.add(S.substring(i, j));
			}
		}

		for (String str : firstList) {
			firstMap.put(str, firstMap.getOrDefault(str, 0) + 1);
		}

		for (String str : firstMap.keySet()) {
			if (firstMap.get(str) == 1)
				secondList.add(str);
		}

		for (String str : secondList) {
			secondMap.put(str, str.length());
		}

		for (String str : secondMap.keySet())
			thirdlist.add(secondMap.get(str));

		int intVal = Integer.MAX_VALUE;

		for (int i : thirdlist)
			intVal = Math.min(intVal, i);

		return intVal == Integer.MAX_VALUE ? 0 : intVal;
	}

	public static void main(String[] args) {

		TestCode2 obj = new TestCode2();
		String S = "ababaabba";
		int a = obj.returnVal(S);
		System.out.println(a);

	}

}
