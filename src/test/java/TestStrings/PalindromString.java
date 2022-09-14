package TestStrings;

/*1. By reverse input str and compare
2. compare 1st element to last element and so on
3. by mid point theory where L&R will be start from mid point*/

public class PalindromString {

	public static void main(String[] args) {
		
		String str ="abcdcba";
		int size = str.length();
		boolean flag=false;
		
		for(int i=0;i<size/2;i++)
		{
			if(str.charAt(i)==str.charAt(size-1-i))
				flag=true;
			else
				flag=false;
				
		}
		
		if(flag)
			System.out.println("String is Palindrom");
		else
			System.out.println("String is NOT Palindrom");
	}

}
