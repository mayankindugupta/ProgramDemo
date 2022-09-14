package TestStrings;

public class ReverseSubArrayInArray {

	static int[] reverseString(int arr[], int n) {

		int size = arr.length;
		for (int i = 0; i < size;i = i + n) {
			int tempL = i;
			int tempR = Math.min(i + n - 1, size - 1);
			int tempVar;
			while (tempR > tempL) {
				tempVar = arr[tempL];
				arr[tempL] = arr[tempR];
				arr[tempR] = tempVar;
				tempL = tempL + 1;
				tempR = tempR - 1;
			}
		}
		return arr;
	}
	

	public static void main(String[] args) {

		int[] inputNumArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] getnumArray = reverseString(inputNumArr, 3);
		for(int n:getnumArray)
		{
			System.out.print(n+" ");
		}
	}
}
