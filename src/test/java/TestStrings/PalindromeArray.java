package TestStrings;

/*1. By reverse input str and compare
2. compare 1st element to last element and so on
3. by mid point theory where L&R will be start from mid point*/

public class PalindromeArray {

	static void palindrome(int arr[], int n)
    {
        // Initialise flag to zero.
        int flag = 0;
 
        // Loop till array size n/2.
        for (int i = 0; i <= n / 2 ; i++) {
 
            // Check if first and last element are different
            // Then set flag to 1.
            if (arr[i] != arr[n - i - 1]) {
                flag = 1;
                break;
            }
        }
 
        // If flag is set then print Not Palindrome
        // else print Palindrome.
        if (flag == 1)
            System.out.println("Not Palindrome");
        else
            System.out.println("Palindrome");
    }
	
	public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 1 };
        int n = arr.length;
 
        palindrome(arr, n);
	}

}
