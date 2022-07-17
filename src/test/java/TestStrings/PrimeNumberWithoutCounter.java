package TestStrings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrimeNumberWithoutCounter {

	List<Integer> setList = new ArrayList<Integer>();

	List<Integer> primeFunc(int num) {
		System.out.print("Input Numbers: "+num);
		
		for (int i = 2; i <=num; i++) {
		
			if(i==2 || i==3 || i==5 || i==7)
			{
				setList.add(i);
			}
				
			else if(!(i%2==0 || i%3==0 || i%5==0 || i%7==0))
			{
				setList.add(i);
			}
		}

		return setList;
	}

	// Driver code
	public static void main(String[] args) {
		PrimeNumberWithoutCounter obj = new PrimeNumberWithoutCounter();

		List<Integer> getList = obj.primeFunc(100);

		Iterator<Integer> cityIterator = getList.iterator();
		System.out.print("\nCount of Prime Numbers:"+getList.size());
		System.out.print("\nPrime Numbers Are:");
		
		while (cityIterator.hasNext()) {
			System.out.print(cityIterator.next()+" ");
		}
	}
}
