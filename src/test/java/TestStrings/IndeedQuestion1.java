package TestStrings;

/*
We are working on a security system for a badged-access room in our company's building.

Given an ordered list of employees who used their badge to enter or exit the room, write a function that returns two collections:

1. All employees who didn't use their badge while exiting the room - they recorded an enter without a matching exit. (All employees are required to leave the room before the log ends.)

2. All employees who didn't use their badge while entering the room - they recorded an exit without a matching enter. (The room is empty when the log begins.)

Each collection should contain no duplicates, regardless of how many times a given employee matches the criteria for belonging to it.

records1 = [
  ["Martha",   "exit"],
  ["Paul",     "enter"],
  ["Martha",   "enter"],
  ["Steve",    "enter"],
  ["Martha",   "exit"],
  ["Jennifer", "enter"],
  ["Paul",     "enter"],
  ["Curtis",   "exit"],
  ["Curtis",   "enter"],
  ["Paul",     "exit"],
  ["Martha",   "enter"],
  ["Martha",   "exit"],
  ["Jennifer", "exit"],
  ["Paul",     "enter"],
  ["Paul",     "enter"],
  ["Martha",   "exit"],
  ["Paul",     "enter"],
  ["Paul",     "enter"],
  ["Paul",     "exit"],
  ["Paul",     "exit"] 
]

Expected output: ["Paul", "Curtis", "Steve"], ["Martha", "Curtis", "Paul"]

Other test cases:

records2 = [
  ["Paul", "enter"],
  ["Paul", "exit"],
]

Expected output: [], []

records3 = [
  ["Paul", "enter"],
  ["Paul", "enter"],
  ["Paul", "exit"],
  ["Paul", "exit"],
]

Expected output: ["Paul"], ["Paul"]

records4 = [
  ["Paul", "enter"],
  ["Paul", "exit"],
  ["Paul", "exit"],
  ["Paul", "enter"],
]

Paul,enter,exit,exit,enter


enter
enter
exit
exit


Expected output: ["Paul"], ["Paul"]

All Test Cases:
mismatches(records1) => ["Paul", "Curtis", "Steve"], ["Martha", "Curtis", "Paul"]
mismatches(records2) => [], []
mismatches(records3) => ["Paul"], ["Paul"]
mismatches(records4) => ["Paul"], ["Paul"]

n: length of the badge records array
*/
import java.util.*;

public class IndeedQuestion1 {

	static List<List<String>> returnEmp(String[][] entExt) {
		Map<String, List<String>> mObj = new HashMap<>();
		List<List<String>> retList = new ArrayList<>();
		List<String> enter = new ArrayList<>();
		List<String> exit = new ArrayList<>();
		for (String[] str : entExt) {
			String usr = str[0];
			String ee = str[1];
			mObj.put(usr, mObj.getOrDefault(usr, new ArrayList<>()));
			mObj.get(usr).add(ee);
		}

		for (String emp : mObj.keySet()) {
			int flag = 0;
			for (String str : mObj.get(emp)) {
				System.out.println(emp + ":" + str);
				if (str.contains("enter") && flag == 0) // enter 1st time
					flag = 1; // enter
				else if (str.contains("enter") && flag == 1) // enter 2nd time without exit
				{
					flag = -2; // enter
					enter.add(emp);
				}
				else if (str.contains("enter") && flag == -1) //enter after exit
					flag = -1;
				
				if (str.contains("exit") && flag == 0) //exit 1st time without enter
					flag = -1;
				else if (str.contains("exit") && flag == 1) // exit after enter
					flag = 2; // exit';
				
				
			}

			if (flag == 1)
			{
				enter.add(emp);
				System.out.println(emp+" added to entry list");
			}
			else if (flag == -1)
			{
				System.out.println(emp+" added to exit list");
				exit.add(emp);
			}
			else if (flag ==-2)
			{
				System.out.println(emp+" added to exit list");
				exit.add(emp);
			}
			else if (flag ==2)
				System.out.println("Legal Entry");
				
		}

		retList.add(enter);
		retList.add(exit);
		return retList;

	}

	public static void main(String[] argv) {
		String records1[][] = new String[][] { { "Martha", "exit" }, { "Paul", "enter" }, { "Martha", "enter" },
				{ "Steve", "enter" }, { "Martha", "exit" }, { "Jennifer", "enter" }, { "Paul", "enter" },
				{ "Curtis", "exit" }, { "Curtis", "enter" }, { "Paul", "exit" }, { "Martha", "enter" },
				{ "Martha", "exit" }, { "Jennifer", "exit" }, { "Paul", "enter" }, { "Paul", "enter" },
				{ "Martha", "exit" }, { "Paul", "enter" }, { "Paul", "enter" }, { "Paul", "exit" },
				{ "Paul", "exit" } };

		String records2[][] = new String[][] { { "Paul", "enter" }, { "Paul", "exit" }, };

		String records3[][] = new String[][] { { "Paul", "enter" }, { "Paul", "enter" }, { "Paul", "exit" },
				{ "Paul", "exit" }, };

		String records4[][] = new String[][] { { "Paul", "enter" }, { "Paul", "exit" }, { "Paul", "exit" },
				{ "Paul", "enter" }, };
		System.out.println(returnEmp(records3));
	}
}
