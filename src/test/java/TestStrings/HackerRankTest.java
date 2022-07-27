package TestStrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HackerRankTest {

	public static int diagonalDifference(List<List<Integer>> arr) {
		int rSum = 0;
		int lSum = 0;
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr.get(i).size(); j++) {
				if (i == j)
					rSum = rSum + arr.get(i).get(j);
				if (i + j == arr.size() - 1)
					lSum = lSum + arr.get(i).get(j);
			}
		}
		if (rSum >= lSum)
			return rSum - lSum;
		else
			return lSum - rSum;
	}

	public static int lonelyinteger(List<Integer> a) {
		int retNum = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : a) {
			if (map.containsKey(num))
				map.put(num, map.get(num) + 1);
			else
				map.put(num, 1);
		}

		for (int k : map.keySet()) {
			if (map.get(k) == 1)
				retNum = k;
		}
		return retNum;
	}
	
	public static List<Integer> convertArrayToList(int[] arr)
    {
        List<Integer> list = new ArrayList<>();
        for (int t : arr) {
            list.add(t);
        }
        return list;
    }
	
    public static String caesarCipher(String s, int k) {
        String retVal=""; int updatedAscVal;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            int ascVal = c;
            if(k>26)
            {
                k=k%26;
            }
            if(ascVal>=65&&ascVal<=90)
            {
                if(ascVal+k>90)
                updatedAscVal=64+ascVal+k-90;
                else
                updatedAscVal=ascVal+k;
            }
            else if (ascVal>=97 && ascVal<=122)
            {
                if(ascVal+k>122)
                updatedAscVal=96+ascVal+k-122;
                else
                updatedAscVal=ascVal+k;
            }
            else
                updatedAscVal=ascVal;
                      
            retVal=retVal+Character.toString((char)updatedAscVal);
        }
    return retVal;
    }

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,3,2,1};
		String str = "Hello_World!";
		List<Integer> list = convertArrayToList(arr);
		System.out.println(list);
		int num = lonelyinteger(list);
		System.out.println(num);
		String retStr = caesarCipher(str, 44);
		System.out.println(retStr);
	}

}
