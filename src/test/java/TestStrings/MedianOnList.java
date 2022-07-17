package TestStrings;

import java.util.ArrayList;
import java.util.List;

public class MedianOnList {

	List<Double> getAverage(List<Integer> list) {
		List<Double> retList = new ArrayList<Double>();
		int[] arr = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			int sum = 0;
			int count = 0;
			arr[i] = list.get(i);
			for (int a : arr) {
				if (a != 0) {
					sum = sum + a;
					count++;
				}
			}
			double dCount = count;
			double dSum = sum;
			double avg = dSum / dCount;
			retList.add(avg);
		}

		return retList;
	}

	List<Integer> getMedian(List<Integer> list) {
		List<Integer> retList = new ArrayList<Integer>();
		int[] arr = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			int count = 0;
			arr[i] = list.get(i);
			for (int a : arr) {
				if (a != 0) {
					count++;
				}
			}
				if (count % 2 != 0)
				{
					retList.add(arr[(count/2)]);
				}
				else
				{
				 retList.add((arr[(count - 1) / 2] + arr[count / 2]) / 2);
				}
			}
		return retList;
		}

	public static void main(String[] args) {
		MedianOnList obj = new MedianOnList();
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(6);
		list.add(7);
		list.add(9);
		System.out.println("List is:" + list);

		List<Double> getList = obj.getAverage(list);
		System.out.println("List of average:" + getList);

		List<Integer> getMedian = obj.getMedian(list);
		System.out.println("List of Median:" + getMedian);
	}
}
