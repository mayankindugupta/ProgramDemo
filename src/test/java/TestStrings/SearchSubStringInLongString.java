package TestStrings;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchSubStringInLongString {

	static String readByScanner() throws Exception {
		String strFile = "";
		File fileObj = new File("/Users/mayank.gupta/DemoFiles/Sample1.txt");
		Scanner sc = new Scanner(fileObj);
		while (sc.hasNextLine()) {
			strFile = strFile + sc.nextLine();
		}
		sc.close();
		return strFile;
	}
	
	static Map<Integer,List<Integer>> returnString(String inputStr)
	{
		List<Integer> list = new ArrayList<>();
		Map<Integer,List<Integer>> map = new HashMap<>();
		Matcher matcher = Pattern.compile("Java").matcher(inputStr);
		 
        int count = 0;
        while (matcher.find()) {
        	list.add(matcher.start());
            count++;
        }
        map.put(count, list);
        return map;
	}
	
	public static void main(String[] args) throws Exception {

		Map<Integer,List<Integer>> getMap = new HashMap<>();
		String inputString = readByScanner();
		System.out.println("Text from file:"+inputString);
		getMap = returnString(inputString);
		System.out.println("\nCount of occurence of keywork along with its indexes:"+getMap);
	}
}
