package TestStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridStringChallenge {

	 static void getColumnString(List<String> grid)
	{
		//String[] strArr = new String[] {"ebacd","fghij","olmkn","trpqs","xywuv"};
		int count=0;
		//List<String> retList = new ArrayList<>();
		while(count<=grid.size()) {
		for(int i=0;i<grid.size();i++)
		{
			for(int j=0;j<grid.get(i).length();j++)
			{
				if(j==count)
				System.out.print(grid.get(i).charAt(j));
			}
		}
		System.out.println();
		count++;
		}
		
	}
	public static void gridChallenge(List<String> grid) {
	    List<String> sortList = new ArrayList<>();
	    List<Character> sortList1 = new ArrayList<>();
	    char[] charArr1 = new char[5];
	    for(String str: grid)
	    {
	        char charArr[] = str.toCharArray();
	        Arrays.sort(charArr);
	        sortList.add(new String(charArr));
	    }
	    
	    System.out.println("Sorted List:"+sortList);
	    
	}
	
	public static void main(String[] args) {
		List<String> grid = new ArrayList<>();
		grid.add("ebacd");
		grid.add("fghij");
		grid.add("olmkn");
		grid.add("trpqs");
		grid.add("xywuv");
	
		gridChallenge(grid);
		System.out.println("******Column Array******");
		getColumnString(grid);

	}

}
