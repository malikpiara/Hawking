import java.io.*;
import java.awt.*;
import java.io.IOException;
import javax.swing.*;

public class Frame {
	public static void main (String[] args) {

		try {
			FileReader reader = new FileReader("output.txt");
			BufferedReader br = new BufferedReader(reader);

			String text;
			// Reads lines from .txt file until it reaches null
			while ((text = br.readLine()) != null) {
				System.out.println(text);
			}

			// Creates new frame.
			JFrame frame = new JFrame();
			
			JTextArea textArea = new JTextArea(30, 50);
			
			textArea.read(br, "output.txt");
			br.close();

			//frame.getContentPane().setBackground(Color.WHITE);
		//	frame.setSize(800,600);
			frame.getContentPane().add(textArea, BorderLayout.CENTER);
		    frame.pack();
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
