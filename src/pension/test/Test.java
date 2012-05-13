package pension.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		PrintStream st;
		try {
			st = new PrintStream(new FileOutputStream("output.txt"));
			System.setErr(st);
			System.setOut(st);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		ApplicationContext context = 
	    		new ClassPathXmlApplicationContext("Client.xml");
		JFrame frame = (JFrame) context.getBean("window");
        frame .setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
  		frame .pack      ();
  		frame .setVisible(true );
	}

}
