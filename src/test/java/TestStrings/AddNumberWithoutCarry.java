package TestStrings;

public class AddNumberWithoutCarry {

	public static int addInterger(int num1, int num2)
    {
		int lastBit=0;
		int place=1;
		int result=0;
		while(num1>0||num2>0)
		{
			lastBit=(num1%10)+(num2%10);
			lastBit=lastBit%10;
			result=result+(lastBit*place);
			num1=num1/10;
			num2=num2/10;
			place=place*10;
		}
        return result;
    }
	
	public static String addString(String str1, String str2)
    {
		
		if(str1.length()>str2.length())
		{
			str2=reverseStr(str2);
			for(int i=0;i<=str1.length()-str2.length();i++)
			{
				str2=str2+"0";
			}
			str1=reverseStr(str1);
		}		
		else if(str1.length()<str2.length())
		{
			str1=reverseStr(str1);
			for(int i=0;i<=str2.length()-str1.length();i++)
			{
				str2=str2+"0";
			}
			str2=reverseStr(str2);
		}
		
		int[] chArr = new int[str1.length()];
		
		System.out.println(str1+"--"+str1.length());
		System.out.println(str2+"--"+str2.length());
		
		for(int i=0;i<str1.length();i++)
		{
			//System.out.println(str1.charAt(i));
			//chArr[i] = Integer.valueOf(str1.charAt(i))+Integer.valueOf(str2.charAt(i));
			chArr[i] = Integer.valueOf(str1.charAt(i))+Integer.valueOf(str2.charAt(i));
		}
		return chArr.toString();
    }
	
	private static String reverseStr(String str)
	{
		StringBuilder reverseString = new StringBuilder(str);
		return reverseString.reverse().toString();		
	}

	public static void main(String args[]) {
		
		System.out.println("Addition of Integer Number:"+addInterger(198111, 8732));
		System.out.println("Addition of String Number:"+addString("3333311111111111", "44422222221111"));
		
		/*
		 * Input : str1 = "3333311111111111", str2 = "44422222221111" Output :
		 * 3377733333332222
		 * 
		 * Input : str1 = "7777555511111111", str2 = "3332222221111" Output :
		 * 7780887733332222
		 */
	}

}
