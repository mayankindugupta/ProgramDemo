package TestStrings;


import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		  
		Map<Integer,String> mapObj = new HashMap<>();
		mapObj.put(1, "ABC");
		mapObj.put(2, "XYZ");
		mapObj.put(3, "MNO");
		mapObj.put(4, "DEF");
		mapObj.put(5, "ABC");
		
		System.out.println("The Map object:"+mapObj);
		
		Iterator<Integer> it = mapObj.keySet().iterator();
		
		while(it.hasNext())
		{
			Integer key = (Integer) it.next();
			System.out.println(mapObj.get(key));
		}
		
		
		Hashtable<Integer,String> tableObj = new Hashtable<>();
		tableObj.put(1, "Mak");
		tableObj.put(2, "Cat");
		tableObj.put(3, "Net");
		tableObj.put(4, "Bat");
		tableObj.put(5, "Mak");
		
		System.out.println("The Table object:"+tableObj);
		
		for(Integer in: tableObj.keySet()) {
			System.out.println(tableObj.get(in));
		}
		 
	}

}

/*Hashmap vs Hashtable 
1. HashMap is non synchronized. It is not-thread safe and can’t be shared between many threads without proper synchronization code whereas 
Hashtable is synchronized. It is thread-safe and can be shared with many threads. 
2. HashMap allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value. 
3. HashMap is generally preferred over HashTable if thread synchronization is not needed
4. HashMap inherits AbstractMap class. Hashtable inherits Dictionary class.
Why HashTable doesn’t allow null and HashMap do? 
To successfully store and retrieve objects from a HashTable, the objects used as keys must implement the hashCode method and the equals method. 
Since null is not an object, it can’t implement these methods. HashMap is an advanced version and improvement on the Hashtable. HashMap was created later.
*/
//We can make the HashMap as synchronized by calling this code: Map m = Collections.synchronizedMap(hashMap);
