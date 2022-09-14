package TestStrings;

import java.util.ArrayList;
import java.util.List;

public class PrintMatrix {
	
	public static void main(String[] args) {
		List<String> grid = new ArrayList<>();
		grid.add("ebacd");
		grid.add("fghij");
		grid.add("olmkn");
		grid.add("trpqs");
		grid.add("xywuv");
		
		String[] strArr = new String[] {"ebacd","fghij","olmkn","trpqs","xywuv"};
		int count=0;
		while(count<=strArr.length) {
		for(int i=0;i<strArr.length;i++)
		{
			for(int j=0;j<strArr[i].length();j++)
			{
				if(j==count)
				System.out.print(strArr[i].charAt(j));
			}
		}
		System.out.println();
		count++;
		}
	}

}

//print all string from each column