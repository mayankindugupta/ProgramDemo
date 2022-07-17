package TestStrings;

public class TestStringShiftNotProper {
	
	void shiftString(int[] arr, int x) {
		System.out.print("Input Array is: ");
		for(int i=0;i<arr.length;i++ )		
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.print("\n"+"Output Array is: ");
		for(int i=0;i<x;i++ )		
		{
				int temp = arr[i];
				arr[i]=arr[i+x];
				arr[i+x]=temp;
		}
		
		for(int i=0;i<arr.length;i++ )		
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	
	//Input : [1,3,4,2,6,7] Output : [2,6,7,1,3,4]
	public static void main(String[] args) {
		int arr[] = {1,3,4,2,6,7};
		int shift = 2;
		TestStringShiftNotProper obj = new TestStringShiftNotProper();
		obj.shiftString(arr,shift);
	}
	

}
