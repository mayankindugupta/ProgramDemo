package TestStrings;

public class AddEachDigitOfLongNumber {

	public static int addDigit(long num) {
		long digit;
		long sum = 0;
		while (num > 0) {
			digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}
		return (int) sum;
	}

	public static int superDigit(String n, int k) {
		// Write your code here
		String finalStr = "";
		while (k >= 1) {
			finalStr = finalStr + n;
			k--;
		}
		System.out.println("Final String:" + finalStr);

		long retVal = Long.valueOf(finalStr);
		do {
			retVal = addDigit(retVal);
		} while (retVal > 9);
		return (int) retVal;
	}

	public static void main(String[] args) {
		long a = 987159623;
		int num = addDigit(a);
		System.out.println(num);
		System.out.println(superDigit("49", 2));

	}
}
