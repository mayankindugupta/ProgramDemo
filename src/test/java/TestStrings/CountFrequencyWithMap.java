package TestStrings;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyWithMap {

	void printFrequency(int arr[], int size)
    {
       Map<Integer,Integer> mapObj = new HashMap<>();
       
       for(int i=0;i<size;i++)
       {
    	   		if(mapObj.containsKey(arr[i]))
    	   		{
    	   			mapObj.put(arr[i], mapObj.get(arr[i])+1);
    	   		}
    	   		else
    	   		{
    	   			mapObj.put(arr[i], 1);
    	   		}
       }
       
       for(Integer k: mapObj.keySet())
       {
    	   System.out.println(k+":"+mapObj.get(k));
       }
    }
 
    // Driver code
    public static void main(String[] args)
    {
    	CountFrequencyWithMap obj = new CountFrequencyWithMap();
        int arr[] = { 11, 66, 11, 33, 66, 22, 11 };
        int arr_size = arr.length;
 
        obj.printFrequency(arr, arr_size);
    }
}
