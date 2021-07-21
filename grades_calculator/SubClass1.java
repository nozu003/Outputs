package grades_calculator;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class SubClass1 extends JFrame implements ActionListener {
	
	/*link*/
	static SubClass2 SClass2 = new SubClass2();
	
	/*variables*/
	public double firstGrade, secondGrade, finalGrade;
	
	/*identifiers*/
	public JLabel nameLbl, firstGrdLbl, secondGrdLbl, finalGrdLbl, remarksLbl;
	public JTextField nameTxtFld, firstGrdTxtFld, secondGrdTxtFld, finalGrdTxtFld;
	public JTextArea textArea;
	public JButton compute, $clear, $exit;
	
	/*constructor*/
	public SubClass1(){

		Container $main = getContentPane();
		
		$main.setLayout(null);
		
		/*JLabel*/
		$main.add(nameLbl = new JLabel("Name"));
		$main.add(firstGrdLbl = new JLabel("1st Grade"));
		$main.add(secondGrdLbl = new JLabel("2nd Grade"));
		$main.add(finalGrdLbl = new JLabel("Final Grade"));
		$main.add(remarksLbl = new JLabel("Remarks"));
		
		/*JTextField*/
		$main.add(nameTxtFld = new JTextField(20));
		$main.add(firstGrdTxtFld = new JTextField(20));
		$main.add(secondGrdTxtFld = new JTextField(20));
		$main.add(finalGrdTxtFld = new JTextField(20));
		
		/*JTextArea*/
		$main.add(textArea = new JTextArea());
		
		/*JButton*/
		$main.add(compute = new JButton("Compute"));
		$main.add($clear = new JButton("Clear"));
		$main.add($exit = new JButton("Exit"));
		
		compute.addActionListener(this);
		$clear.addActionListener(this);
		$exit.addActionListener(this);
		
		/*
		 * SETBOUNDS(column, row, width, height)
		 */
		
		/*JLabel*/
		nameLbl.setBounds(20, 20, 150, 30);
		firstGrdLbl.setBounds(20, 60, 150, 30);
		secondGrdLbl.setBounds(20, 100, 150, 30);
		finalGrdLbl.setBounds(20, 140, 150, 30);
		remarksLbl.setBounds(20, 180, 150, 30);
		
		/*JTextField*/
		nameTxtFld.setBounds(100, 20, 150, 30);
		firstGrdTxtFld.setBounds(100, 60, 150, 30);
		secondGrdTxtFld.setBounds(100, 100, 150, 30);
		finalGrdTxtFld.setBounds(100, 140, 150, 30);
		
		/*JTextArea*/
		textArea.setBounds(100, 180, 150, 200);
		
		/*JButton*/
		compute.setBounds(270, 20, 150, 30);
		$clear.setBounds(270, 60, 150, 30);
		$exit.setBounds(270, 100, 150, 30);
		
		/*setEditable*/
		finalGrdTxtFld.setEditable(false);
		textArea.setEditable(false);
				
	}

	public void actionPerformed(ActionEvent e) {
		
		/*Compute JButton*/
		if(e.getSource()==compute) {
			
			/*getText*/
			firstGrade = Double.parseDouble(firstGrdTxtFld.getText());
			secondGrade = Double.parseDouble(secondGrdTxtFld.getText());
			
			finalGrade = (firstGrade + secondGrade)/2;
			finalGrdTxtFld.setText(Double.toString(finalGrade));
			
			SClass2.remarksValidation(finalGrade);
			textArea.setText(SClass2.remarks);
		}
		
		/*Clear JButton*/
		if(e.getSource()==$clear) {
			nameTxtFld.setText(null);
			firstGrdTxtFld.setText(null);
			secondGrdTxtFld.setText(null);
			finalGrdTxtFld.setText(null);
			textArea.setText(null);
		}
		
		/*Exit JButton*/
		if(e.getSource()==$exit) {
			System.exit(0);
			
		}
	}
	
}
