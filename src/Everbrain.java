// TODO Right now you can only insert one line. Let's work on a way
//		to support paragraphs!

import java.util.Scanner;
import java.io.*;
public class Everbrain {

	public static void main(String[] args) {
		Writer();
	}

	// Writes text inserted in the console in a given .txt file
	// If the .txt file does not existed, it creates one
	public static void Writer() {
		try {
			FileWriter fw = new FileWriter("output.txt");
			PrintWriter pw = new PrintWriter(fw);

			Scanner input = new Scanner(System.in);
			String text = input.nextLine();
			input.close();

			pw.println(text);
			pw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
