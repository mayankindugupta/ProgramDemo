package TestStrings;

public class TestCode3 {

	int returnVal(int N) {
			String retStr="";
			int position=-1;
		if (N < 0) {
			int num = Math.abs(N);
			String str = String.valueOf(num);
			for (int i = str.length()-1; i >=0; i--) {
				System.out.println(str.charAt(i));
				if(str.charAt(i)=='5')
				{
					position=i;
					break;
				}
			}
			System.out.println("Pos"+position);
			for (int i = 0; i<str.length(); i++) {
				if(i!=position)
				{
					retStr+=str.charAt(i);
				}
			}
			retStr='-'+retStr;
			return Integer.parseInt(retStr); 
		}
		else
		{
			String str = String.valueOf(N);
			for (int i = 0;i<str.length(); i++) {
				System.out.println(str.charAt(i));
				if(str.charAt(i)=='5')
				{
					position=i;
					break;
				}
			}
			System.out.println("Pos"+position);
			for (int i = 0; i<str.length(); i++) {
				if(i!=position)
				{
					retStr+=str.charAt(i);
				}
			}
			return Integer.parseInt(retStr); 
		}
	}

	public static void main(String[] args) {

		TestCode3 obj = new TestCode3();
		//int n = -5859;
		int n = 15958;

		System.out.println(obj.returnVal(n));

	}

}
