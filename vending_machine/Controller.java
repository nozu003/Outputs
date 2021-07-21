package vending_machine;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
import javax.swing.SwingConstants;

@SuppressWarnings("unused")
public class Controller {

	private JFrame frmBigHeroAcademy;
	private JTextField bill_txtFld;
	private JTextField balance_txtFld;

	private int balance = 0;
	private int change = 0;
	private int quantity = 50;
	private JButton btn_ok;
	private JButton btn_0;
	private JButton btn_backspace;
	private JButton btn_1;
	private JButton btn_2;
	private JButton btn_3;
	private JButton btn_4;
	private JButton btn_5;
	private JButton btn_6;
	private JButton btn_7;
	private JButton btn_8;
	private JButton btn_9;
	private JTextField selection_txtFld_Price;
	/**
	 * Launch the application.
	 */
	
	static SubClass1 SC1 = new SubClass1();
	private JTextField coins_txtFld;
	private JButton coin_button;
	private JButton purchase_button;
	private JTextField change_txtFld;
	private JLabel image;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Controller window = new Controller();
					window.frmBigHeroAcademy.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Assessment_3TUAZON() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBigHeroAcademy = new JFrame();
		frmBigHeroAcademy.setTitle("Big Hero Academy Vending Machine");
		frmBigHeroAcademy.setResizable(false);
		frmBigHeroAcademy.setBounds(100, 100, 450, 645);
		frmBigHeroAcademy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBigHeroAcademy.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		frmBigHeroAcademy.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		bill_txtFld = new JTextField();
		bill_txtFld.setFont(new Font("Tahoma", Font.PLAIN, 10));
		bill_txtFld.setForeground(Color.WHITE);
		bill_txtFld.setBorder(null);
		bill_txtFld.setOpaque(false);
		bill_txtFld.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
			         e.consume();
			      }
			}
		});
		
		JButton bill_button = new JButton(">");
		bill_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bill_button.setBackground(Color.BLACK);
		bill_button.setOpaque(false);
		bill_button.setBorder(null);
		bill_button.setForeground(Color.WHITE);
		bill_button.setFont(new Font("Tahoma", Font.PLAIN, 6));
		bill_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				balance += Integer.parseInt(bill_txtFld.getText());
				balance_txtFld.setText(Integer.toString(balance));
				bill_txtFld.setText(null);
			}
		});
		
		JLabel quantity_lbl = new JLabel("");
		quantity_lbl.setText(Integer.toString(quantity));
		SC1.beverageQuantity(quantity);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("17");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1_1.setBounds(135, 316, 17, 14);
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_2_4_1 = new JLabel("18");
		lblNewLabel_1_2_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_4_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_4_1.setBounds(170, 315, 17, 14);
		panel.add(lblNewLabel_1_2_4_1);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("19");
		lblNewLabel_1_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_1_1_1.setBounds(203, 316, 17, 14);
		panel.add(lblNewLabel_1_2_1_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("15");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1.setBounds(67, 316, 17, 14);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_2_3_1_1 = new JLabel("21");
		lblNewLabel_1_2_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_3_1_1.setBounds(271, 316, 17, 14);
		panel.add(lblNewLabel_1_2_3_1_1);
		
		JLabel lblNewLabel_1_2_2_1_1 = new JLabel("20");
		lblNewLabel_1_2_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_2_1_1.setBounds(238, 316, 17, 14);
		panel.add(lblNewLabel_1_2_2_1_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("16");
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_3_1.setBounds(102, 316, 17, 14);
		panel.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_2 = new JLabel("8");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(67, 236, 17, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("10");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1.setBounds(135, 236, 17, 14);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_4 = new JLabel("11");
		lblNewLabel_1_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_4.setBounds(170, 235, 17, 14);
		panel.add(lblNewLabel_1_2_4);
		
		JLabel lblNewLabel_1_2_3_1 = new JLabel("14");
		lblNewLabel_1_2_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_3_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_3_1.setBounds(271, 236, 17, 14);
		panel.add(lblNewLabel_1_2_3_1);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("13");
		lblNewLabel_1_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_2_1.setBounds(238, 236, 17, 14);
		panel.add(lblNewLabel_1_2_2_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("9");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_3.setBounds(102, 236, 17, 14);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("12");
		lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_1_1.setBounds(203, 236, 17, 14);
		panel.add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("5");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_1.setBounds(203, 163, 17, 14);
		panel.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("7");
		lblNewLabel_1_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_3.setBounds(271, 163, 17, 14);
		panel.add(lblNewLabel_1_2_3);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("6");
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_2.setBounds(238, 163, 17, 14);
		panel.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("3");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(135, 163, 17, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("2");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(102, 163, 17, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("4");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(170, 162, 17, 14);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel = new JLabel("1");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(67, 163, 17, 14);
		panel.add(lblNewLabel);
		quantity_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		quantity_lbl.setForeground(Color.ORANGE);
		quantity_lbl.setFont(new Font("Segoe UI Emoji", Font.BOLD, 24));
		quantity_lbl.setBounds(54, 60, 40, 38);
		panel.add(quantity_lbl);
		bill_button.setBounds(370, 139, 18, 11);
		panel.add(bill_button);
		bill_txtFld.setBounds(341, 139, 46, 11);
		panel.add(bill_txtFld);
		bill_txtFld.setColumns(10);
		
		balance_txtFld = new JTextField();
		balance_txtFld.setFont(new Font("Tahoma", Font.PLAIN, 10));
		balance_txtFld.setBorder(null);
		balance_txtFld.setForeground(Color.WHITE);
		balance_txtFld.setOpaque(false);
		balance_txtFld.setEditable(false);
		balance_txtFld.setBounds(334, 163, 59, 16);
		panel.add(balance_txtFld);
		balance_txtFld.setColumns(10);
		
		btn_ok = new JButton("");
		btn_ok.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_ok.setBackground(Color.BLACK);
		btn_ok.setOpaque(false);
		btn_ok.setForeground(Color.WHITE);
		btn_ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SC1.beverageSelection(Integer.parseInt(selection_txtFld_Price.getText()));
				if(!(SC1.price == -1)) {
					selection_txtFld_Price.setText(selection_txtFld_Price.getText() + "     "+ Integer.toString(SC1.price));
				}else {
					selection_txtFld_Price.setText("Invalid input");
				}
			}
		});
		btn_ok.setFont(new Font("Dialog", Font.PLAIN, 10));
		btn_ok.setBounds(336, 305, 16, 18);
		panel.add(btn_ok);
		
		btn_0 = new JButton("");
		btn_0.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_0.setBackground(Color.BLACK);
		btn_0.setOpaque(false);
		btn_0.setForeground(Color.WHITE);
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selection_txtFld_Price.setText(selection_txtFld_Price.getText() + 0);
			}
		});
		btn_0.setFont(new Font("Dialog", Font.PLAIN, 10));
		btn_0.setBounds(353, 307, 16, 16);
		panel.add(btn_0);
		
		btn_backspace = new JButton("");
		btn_backspace.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_backspace.setBackground(Color.BLACK);
		btn_backspace.setOpaque(false);
		btn_backspace.setForeground(Color.WHITE);
		btn_backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!selection_txtFld_Price.getText().isEmpty()) {
					selection_txtFld_Price.setText(selection_txtFld_Price.getText().substring(0, selection_txtFld_Price.getText().length() - 1));
				}
			}
		});
		btn_backspace.setFont(new Font("Dialog", Font.PLAIN, 10));
		btn_backspace.setBounds(370, 306, 15, 17);
		panel.add(btn_backspace);
		
		btn_1 = new JButton("");
		btn_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_1.setBackground(Color.BLACK);
		btn_1.setOpaque(false);
		btn_1.setForeground(Color.WHITE);
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selection_txtFld_Price.setText(selection_txtFld_Price.getText() + 1);
			}
		});
		btn_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		btn_1.setBounds(336, 253, 16, 18);
		panel.add(btn_1);
		
		btn_2 = new JButton("");
		btn_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_2.setBackground(Color.BLACK);
		btn_2.setOpaque(false);
		btn_2.setForeground(Color.WHITE);
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selection_txtFld_Price.setText(selection_txtFld_Price.getText() + 2);
			}
		});
		btn_2.setFont(new Font("Dialog", Font.PLAIN, 10));
		btn_2.setBounds(353, 253, 16, 18);
		panel.add(btn_2);
		
		btn_3 = new JButton("");
		btn_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_3.setBackground(Color.BLACK);
		btn_3.setOpaque(false);
		btn_3.setForeground(Color.WHITE);
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selection_txtFld_Price.setText(selection_txtFld_Price.getText() + 3);
			}
		});
		btn_3.setFont(new Font("Dialog", Font.PLAIN, 10));
		btn_3.setBounds(370, 253, 15, 17);
		panel.add(btn_3);
		
		btn_4 = new JButton("");
		btn_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_4.setBackground(Color.BLACK);
		btn_4.setOpaque(false);
		btn_4.setForeground(Color.WHITE);
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selection_txtFld_Price.setText(selection_txtFld_Price.getText() + 4);
			}
		});
		btn_4.setFont(new Font("Dialog", Font.PLAIN, 10));
		btn_4.setBounds(336, 271, 16, 17);
		panel.add(btn_4);
		
		btn_5 = new JButton("");
		btn_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_5.setBackground(Color.BLACK);
		btn_5.setOpaque(false);
		btn_5.setForeground(Color.WHITE);
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selection_txtFld_Price.setText(selection_txtFld_Price.getText() + 5);
			}
		});
		btn_5.setFont(new Font("Dialog", Font.PLAIN, 10));
		btn_5.setBounds(353, 271, 16, 17);
		panel.add(btn_5);
		
		btn_6 = new JButton("");
		btn_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_6.setBackground(Color.BLACK);
		btn_6.setOpaque(false);
		btn_6.setForeground(Color.WHITE);
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selection_txtFld_Price.setText(selection_txtFld_Price.getText() + 6);
			}
		});
		btn_6.setFont(new Font("Dialog", Font.PLAIN, 10));
		btn_6.setBounds(370, 271, 15, 17);
		panel.add(btn_6);
		
		btn_7 = new JButton("");
		btn_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_7.setBackground(Color.BLACK);
		btn_7.setOpaque(false);
		btn_7.setForeground(Color.WHITE);
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selection_txtFld_Price.setText(selection_txtFld_Price.getText() + 7);
			}
		});
		btn_7.setFont(new Font("Dialog", Font.PLAIN, 10));
		btn_7.setBounds(336, 288, 16, 17);
		panel.add(btn_7);
		
		btn_8 = new JButton("");
		btn_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_8.setBackground(Color.BLACK);
		btn_8.setOpaque(false);
		btn_8.setForeground(Color.WHITE);
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selection_txtFld_Price.setText(selection_txtFld_Price.getText() + 8);
			}
		});
		btn_8.setFont(new Font("Dialog", Font.PLAIN, 10));
		btn_8.setBounds(352, 289, 17, 17);
		panel.add(btn_8);
		
		btn_9 = new JButton("");
		btn_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_9.setBackground(Color.BLACK);
		btn_9.setOpaque(false);
		btn_9.setForeground(Color.WHITE);
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selection_txtFld_Price.setText(selection_txtFld_Price.getText() + 9);
			}
		});
		btn_9.setFont(new Font("Dialog", Font.PLAIN, 10));
		btn_9.setBounds(370, 289, 15, 17);
		panel.add(btn_9);
		
		selection_txtFld_Price = new JTextField();
		selection_txtFld_Price.setOpaque(false);
		selection_txtFld_Price.setBorder(null);
		selection_txtFld_Price.setForeground(Color.WHITE);
		selection_txtFld_Price.setFont(new Font("Tahoma", Font.PLAIN, 10));
		selection_txtFld_Price.setEditable(false);
		selection_txtFld_Price.setBounds(332, 235, 56, 16);
		panel.add(selection_txtFld_Price);
		selection_txtFld_Price.setColumns(10);
		
		coins_txtFld = new JTextField();
		coins_txtFld.setBorder(null);
		coins_txtFld.setOpaque(false);
		coins_txtFld.setForeground(Color.WHITE);
		coins_txtFld.setFont(new Font("Tahoma", Font.PLAIN, 10));
		coins_txtFld.setBounds(333, 183, 40, 15);
		panel.add(coins_txtFld);
		coins_txtFld.setColumns(10);
		
		coin_button = new JButton("");
		coin_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		coin_button.setBackground(Color.BLACK);
		coin_button.setOpaque(false);
		coin_button.setBorder(null);
		coin_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				balance += Integer.parseInt(coins_txtFld.getText());
				balance_txtFld.setText(Integer.toString(balance));
				coins_txtFld.setText(null);
			}
		});
		coin_button.setBounds(378, 182, 15, 15);
		panel.add(coin_button);
		
		purchase_button = new JButton("Purchase");
		purchase_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		purchase_button.setBackground(Color.BLACK);
		purchase_button.setBorder(null);
		purchase_button.setOpaque(false);
		purchase_button.setFont(new Font("Tahoma", Font.PLAIN, 10));
		purchase_button.setForeground(Color.WHITE);
		purchase_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(balance < SC1.price) {
					JOptionPane.showMessageDialog(null, "Insufficient funds", "WARNING",JOptionPane.WARNING_MESSAGE);
				}else {
					change = balance - SC1.price;
					change_txtFld.setText(Integer.toString(change));
					balance_txtFld.setText(null);
					selection_txtFld_Price.setText(null);
				}
			}
		});
		purchase_button.setBounds(331, 332, 60, 15);
		panel.add(purchase_button);
		
		change_txtFld = new JTextField();
		change_txtFld.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		change_txtFld.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!change_txtFld.getText().isEmpty()) {
					change_txtFld.setText(null);
					balance = 0;
					SC1.price = 0;
					quantity_lbl.setText(Integer.toString(SC1.cquantity--));
					quantityChecker(SC1.cquantity);
				}
			}
		});
		change_txtFld.setForeground(Color.WHITE);
		change_txtFld.setFont(new Font("Tahoma", Font.BOLD, 12));
		change_txtFld.setBorder(null);
		change_txtFld.setOpaque(false);
		change_txtFld.setEditable(false);
		change_txtFld.setAutoscrolls(false);
		change_txtFld.setBounds(359, 371, 30, 32);
		panel.add(change_txtFld);
		change_txtFld.setColumns(10);
		
		image = new JLabel("");
		image.setIcon(new ImageIcon(Assessment_3TUAZON.class.getResource("/Assessment3/Vending_machine_tuazon.png")));
		image.setBounds(0, 0, 434, 634);
		panel.add(image);
	}
	private void quantityChecker(int checker) {
		if(checker < 0) {
			JOptionPane.showMessageDialog(null, "The vending machine has no more stocks for beverages. Come back again next time.", "OUT OF SERVICE", JOptionPane.ERROR_MESSAGE);
			bill_txtFld.setEnabled(false);
			coins_txtFld.setEnabled(false);
			coin_button.setEnabled(false);
			btn_0.setEnabled(false);
			btn_1.setEnabled(false);
			btn_2.setEnabled(false);
			btn_3.setEnabled(false);
			btn_4.setEnabled(false);
			btn_5.setEnabled(false);
			btn_6.setEnabled(false);
			btn_7.setEnabled(false);
			btn_8.setEnabled(false);
			btn_9.setEnabled(false);
			btn_ok.setEnabled(false);
			btn_backspace.setEnabled(false);
			purchase_button.setEnabled(false);
			change_txtFld.setEnabled(false);
		}
	}
}
