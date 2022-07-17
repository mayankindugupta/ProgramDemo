package TestStrings;

public class StringCombination {

	public static void Combination1(String str, String ans) {
		// If string is empty
		if (str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);

			String strOut = str.substring(0, i) + str.substring(i + 1);

			Combination1(strOut, temp + ans);
		}
	}

	public static String Combination2(String str) {

		String finalOutput = "";
		String output = "";
		for (int i = 0; i < str.length(); i++) {
			output = "";
			char ch = str.charAt(i);
			output = String.valueOf(ch);
			for (int j = i + 1; j < str.length(); j++) {
				String sub1 = String.valueOf(str.charAt(j));
				String sub2 = str.substring(j, str.length());
				if (sub1.equals(sub2))
					output = output + " " + ch + sub1 + " ";
				else
					output = output + " " + ch + sub1 + " " + ch + sub2 + " ";
			}
			finalOutput = finalOutput + output;
		}
		finalOutput = finalOutput + output;// w wx wy wz x xy xz y yz z
		return finalOutput;
	}

	public static void main(String[] args) {
		String strInput = "wxyz";
		// Combination1(strInput,"");
		String output = Combination2(strInput);
		System.out.println(output);
	}
}

//Find All Possible Combinations Of String
//Input -  "wxyz" 
//Output: " w wx wxy wxyz wxz wy wyz wz x xy xyz xz y yz z "
/* Name of the class has to be "Main" only if the class is public. */