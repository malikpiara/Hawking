import java.util.Scanner;
import java.io.*;
public class Everbrain {

	public static void main(String[] args) {
		
		try {
			FileWriter banana = new FileWriter("output.txt");
			PrintWriter morango = new PrintWriter(banana);
			
			Scanner input = new Scanner(System.in);
			String text = input.nextLine();
			morango.println(text);

			morango.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
