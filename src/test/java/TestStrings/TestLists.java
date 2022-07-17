package TestStrings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestLists {

	public static void main(String[] args) {
		  
		  List<String> list = new ArrayList<>();
		  list.add("Ravi");//adding object in arraylist    
		  list.add("Vijay");    
		  list.add("Ravi");    
		  list.add("Ajay");  
		  
		  System.out.println("Arraylist: "+list); 
		  
		  Set<String> setList = new HashSet<>();
		  
		  for(String s : list) {
			  setList.add(s);
		  }
		  
		  System.out.println("Set of Array List: "+setList); 
		  
		  
		  Set<String> setTree = new TreeSet<>();
		  
		  for(String s : list)
		  {
			  setTree.add(s);
		  }
		  
		  System.out.println("Tree of Array List: "+setTree); 
		  
		  List<String> linkdList = new LinkedList<>();
		  for(String s : list) {
			  linkdList.add(s);
		  }

		  System.out.println("Linked list: "+linkdList); 
	}

}
/*
Arraylist: [Ravi, Vijay, Ravi, Ajay]
Set of Array List: [Vijay, Ravi, Ajay]
Tree of Array List: [Ajay, Ravi, Vijay]
Linked list: [Ravi, Vijay, Ravi, Ajay]
*/