// TODO We need a new "output.txt" file to be created when there none

import java.io.*;
import java.awt.*;
import java.io.IOException;
import javax.swing.*;

public class Frame {
	public static void main (String[] args) {

		// Creates and sets up a new window
		JFrame frame = new JFrame();
		frame.setTitle("Everbrain");
		frame.setSize(700, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JTextArea textArea = new JTextArea();	// Rows + Columns not specified
		frame.getContentPane().add(textArea);

		try {
			BufferedReader input = new BufferedReader(new FileReader("output.txt"));

			String line;
			while((line = input.readLine()) != null)
			{
				textArea.read(input, null);
			}

			input.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
