package TestStrings;

public class TripletsSumUsingLoops {

	public static void findTripletSum(int[] numArr, int target) {
		for (int i = 0; i < numArr.length - 2; i++) {
			for (int j = i + 1; j < numArr.length - 1; j++) {
				for (int k = j + 1; k < numArr.length; k++) {
					if (numArr[i] + numArr[j] + numArr[k] == target) {
						System.out.print("Triplet is:" + numArr[i] + "," + numArr[j] + "," + numArr[k]);
						System.out.println();
					}
				}
			}
		}
	}

	public static void findDoubleSum(int[] numArr, int target) {
		for (int i = 0; i < numArr.length - 1; i++) {
			for (int j = i + 1; j < numArr.length; j++) {
				if (numArr[i] + numArr[j] == target) {
					System.out.print("Triplet is:" + numArr[i] + "," + numArr[j]);
					System.out.println();

				}
			}
		}
	}

	public static void main(String[] args) {
		int[] intArray = { 2, 7, 4, 0, 9, 5, 1, 3 };
		int target = 6;

		findTripletSum(intArray, target);
		findDoubleSum(intArray, target);
	}
}
