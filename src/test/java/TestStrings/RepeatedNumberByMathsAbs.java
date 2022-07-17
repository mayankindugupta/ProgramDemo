package TestStrings;

public class RepeatedNumberByMathsAbs {

	void printRepeating(int arr[], int size) {
		int i;
        System.out.println("The repeating elements are : ");
         
        for (i = 0; i < size; i++) {
            int j = Math.abs(arr[i]);
            if (arr[j] >= 0)
                arr[j] = -arr[j];
            else
                System.out.print(j + " ");
        }
	}

	public static void main(String[] args) {
		RepeatedNumberByMathsAbs repeat = new RepeatedNumberByMathsAbs();
		int arr[] = { 4, 2, 4, 5, 2, 3, 1 };
		int arr_size = arr.length;
		repeat.printRepeating(arr, arr_size);
	}
}
