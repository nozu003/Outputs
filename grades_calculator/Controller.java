package grades_calculator;

import javax.swing.*;

public class Controller {

	static SubClass1 frame = new SubClass1();
	
	public static void main(String[] args) {
		
		frame.setTitle("Title Bar");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(480, 440); /*width x height*/
		frame.setLocationRelativeTo(null); /*centers the window*/
		frame.setVisible(true); /*sets visibility of window to true(visible)*/
	}

}
