package readWriteFiles;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedReader;

public class ReadFile {

	static void readByBufferedReader() throws Exception {
		File fileObj = new File("/Users/mayank.gupta/DemoFiles/Sample1.txt");
		BufferedReader br = new BufferedReader(new FileReader(fileObj));
		String strFile = "";

		while (br.readLine() != null) {
			strFile = br.readLine();
		}
		System.out.println(strFile);
		br.close();
	}

	static void readByFileReader() throws Exception {

		FileReader fileObj = new FileReader("/Users/mayank.gupta/DemoFiles/Sample1.txt");
		String strFile = "";
		while (fileObj.read() != -1)
			strFile = String.valueOf(fileObj.read());
		fileObj.close();
		System.out.print(strFile);
	}

	static void readByScannerWithLoop() throws Exception {
		String strFile = "";
		File fileObj = new File("/Users/mayank.gupta/DemoFiles/Sample1.txt");
		Scanner sc = new Scanner(fileObj);
		while (sc.hasNextLine()) {
			strFile = strFile + sc.nextLine();
		}
		sc.close();
		System.out.println(strFile);
	}

	static void readByScannerWithDeLimiter() throws Exception {
		String strFile = "";
		File fileObj = new File("/Users/mayank.gupta/DemoFiles/Sample1.txt");
		Scanner sc = new Scanner(fileObj);
		sc.useDelimiter("\\Java");

		while (sc.hasNextLine()) {
			strFile = strFile + sc.next();
		}
		sc.close();

		System.out.println(strFile);
	}

	public static void main(String[] args) throws Exception {
		readByBufferedReader();
		System.out.println("********************");
		readByFileReader();
		System.out.println("********************");
		readByScannerWithLoop();
		System.out.println("********************");
		readByScannerWithDeLimiter();

	}

}
