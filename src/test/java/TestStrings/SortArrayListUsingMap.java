package TestStrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortArrayListUsingMap {

	public static void returnSortedList(List<String> list) {

		Map<Integer, String> mapObj = new HashMap<>();
		for (String str : list) {
			int count = str.length();
			if (mapObj.containsKey(count)) {
				mapObj.put(count, mapObj.get(count) + "," + str);
			} else {
				mapObj.put(count, str);
			}
		}

		// To Sort Map by its keys
		Map<Integer, String> sortedMap = new TreeMap<Integer, String>(mapObj);
		//Map<String, Integer> reverseSortedMap = new TreeMap<String, Integer>(Collections.reverseOrder());
		// System.out.println(sortedMap);

		Iterator<Integer> it = sortedMap.keySet().iterator();

		int count = 1;
		while (it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println("At position "+count + " with size "+key +":" +sortedMap.get(key));
			count++;
		}

	}

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("France");
		list.add("United States");
		list.add("England");
		list.add("India");
		list.add("Bangladesh");
		list.add("Srilanka");
		list.add("United Arab Emirate");
		list.add("Russia");
		list.add("Belgium");
		list.add("Pakistan");
		list.add("Brazil");

		System.out.println("All Countries: " + list);

		returnSortedList(list);
	}
}
