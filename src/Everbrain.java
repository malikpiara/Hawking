import java.util.Scanner;
import java.io.*;
public class Everbrain {

	public static void main(String[] args) {
		
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
