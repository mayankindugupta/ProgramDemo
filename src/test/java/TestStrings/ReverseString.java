package TestStrings;

public class ReverseString {

	String reverseString(String str) {
		String arr[] = str.split(" ");
		String returnStr="";
		for(int i=arr.length-1;i>=0;i-- )		
		{
			returnStr+=arr[i]+" ";
		}
		return returnStr.trim();
	}
	
	String reverseStringWord(String str) {
		String arr[] = str.split(" ");
		String word="";
		for(int i=arr.length-1;i>=0;i-- )		
		{
			for(int j=arr[i].length()-1;j>=0;j--) {
				word+=arr[i].charAt(j);
			}
			word+=" ";
		}
		return word.trim();
	}
	
	String reverseEachWord(String str) {
		String arr[] = str.split(" ");
		String word="";
		for(int i=0;i<arr.length;i++ )		
		{
			for(int j=arr[i].length()-1;j>=0;j--) {
				word+=arr[i].charAt(j);
			}
			word+=" ";
		}
		return word.trim();
	}
	
	public static void main(String[] args) {
		String str = "Mayank is writing a String";
		ReverseString obj = new ReverseString();
		System.out.println("Input String: "+str);
		System.out.println("Reversed String: "+obj.reverseString(str));
		System.out.println("Reversed String & Word: "+obj.reverseStringWord(str));
		System.out.println("Reversed Each Word: "+obj.reverseEachWord(str));
	}
	

}
