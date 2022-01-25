import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Panel;
import java.awt.List;
import java.awt.Scrollbar;
import java.awt.ScrollPane;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Label;
import javax.swing.JSlider;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import java.awt.TextField;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

public class MainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	/**
	 * Create the frame.
	 */
	public MainMenu() {
		setAutoRequestFocus(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 730);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		Label welcome_label = new Label("Welcome to Reservation+");
		welcome_label.setAlignment(Label.CENTER);
		welcome_label.setFont(new Font("Calibri", Font.BOLD, 15));
		welcome_label.setForeground(new Color(255, 255, 255));
		welcome_label.setBackground(Color.DARK_GRAY);
		welcome_label.setBounds(-69, 0, 337, 26);
		contentPane.add(welcome_label);
		
		JLabel logolbl1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Logo.png")).getImage();
		logolbl1.setIcon(new ImageIcon(img));
		logolbl1.setBounds(23, 32, 191, 64);
		contentPane.add(logolbl1);
		
		Button button_1 = new Button("102");
		button_1.setBackground(new Color(0, 204, 0));
		button_1.setBounds(53, 178, 70, 22);
		contentPane.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createres crt = new createres();
				crt.NewScreen();
				
			}
		});
		
		Button button_2 = new Button("103");
		button_2.setBackground(new Color(0, 204, 0));
		button_2.setBounds(53, 247, 70, 22);
		contentPane.add(button_2);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createres crt = new createres();
				crt.NewScreen();
				
			}
		});
		
		Button button_3 = new Button("104");
		button_3.setBackground(new Color(0, 204, 0));
		button_3.setBounds(168, 110, 70, 22);
		contentPane.add(button_3);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createres crt = new createres();
				crt.NewScreen();
				
			}
		});
		
		Button button_4 = new Button("105");
		button_4.setBackground(new Color(0, 204, 0));
		button_4.setBounds(168, 178, 70, 22);
		contentPane.add(button_4);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createres crt = new createres();
				crt.NewScreen();
				
			}
		});
		
		Button button_5 = new Button("106");
		button_5.setBackground(new Color(0, 204, 0));
		button_5.setBounds(168, 247, 70, 22);
		contentPane.add(button_5);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createres crt = new createres();
				crt.NewScreen();
				
			}
		});
		
		Button button_6 = new Button("107");
		button_6.setBackground(new Color(0, 204, 0));
		button_6.setBounds(286, 110, 70, 22);
		contentPane.add(button_6);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createres crt = new createres();
				crt.NewScreen();
				
			}
		});
		
		Button button_7 = new Button("108");
		button_7.setBackground(new Color(255, 0, 0));
		button_7.setBounds(286, 178, 70, 22);
		contentPane.add(button_7);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createres crt = new createres();
				crt.NewScreen();
				
			}
		});
		
		Button button_8 = new Button("109");
		button_8.setBackground(new Color(0, 204, 0));
		button_8.setBounds(286, 247, 70, 22);
		contentPane.add(button_8);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createres crt = new createres();
				crt.NewScreen();
				
			}
		});
		
		Button button_9 = new Button("110");
		button_9.setBackground(new Color(0, 204, 0));
		button_9.setBounds(381, 147, 70, 22);
		contentPane.add(button_9);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createres crt = new createres();
				crt.NewScreen();
				
			}
		});
		
		Button button_10 = new Button("111");
		button_10.setBackground(new Color(255, 0, 0));
		button_10.setBounds(381, 198, 70, 22);
		contentPane.add(button_10);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createres crt = new createres();
				crt.NewScreen();
				
			}
		});
		
		Button button_11 = new Button("112");
		button_11.setBackground(new Color(0, 204, 0));
		button_11.setBounds(457, 147, 70, 22);
		contentPane.add(button_11);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createres crt = new createres();
				crt.NewScreen();
				
			}
		});
		
		Button button_12 = new Button("113");
		button_12.setBackground(new Color(0, 204, 0));
		button_12.setBounds(457, 198, 70, 22);
		contentPane.add(button_12);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createres crt = new createres();
				crt.NewScreen();
				
			}
		});
		
		Button button = new Button("101");
		button.setBackground(new Color(255, 0, 0));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createres crt = new createres();
				crt.NewScreen();
				
			}
		});
		button.setBounds(53, 110, 70, 22);
		contentPane.add(button);
		
		Button button_13 = new Button("Reservations Edit");
		button_13.setFont(new Font("Calibri", Font.BOLD, 13));
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Editres editres = new Editres();
				editres.NewScreen();
				
			}
		});
		button_13.setBounds(735, 147, 226, 22);
		contentPane.add(button_13);
		
		Button button_13_1 = new Button("Support");
		button_13_1.setFont(new Font("Calibri", Font.BOLD, 13));
		button_13_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				supporthelp sphelp = new supporthelp();
				sphelp.NewScreen();
				
			}
		});
		button_13_1.setBounds(735, 471, 226, 22);
		contentPane.add(button_13_1);
		
		Button button_13_2 = new Button("Edit Profile");
		button_13_2.setFont(new Font("Calibri", Font.BOLD, 13));
		button_13_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editprofile editpro = new editprofile();
				editpro.NewScreen();
			}
		});
		button_13_2.setBounds(735, 198, 226, 22);
		contentPane.add(button_13_2);
		
		Button button_13_3 = new Button("Create Space");
		button_13_3.setFont(new Font("Calibri", Font.BOLD, 13));
		button_13_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_13_3.setBounds(735, 247, 226, 22);
		contentPane.add(button_13_3);
		
		Button button_13_4 = new Button("Timeline");
		button_13_4.setFont(new Font("Calibri", Font.BOLD, 13));
		button_13_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_13_4.setBounds(735, 299, 226, 22);
		contentPane.add(button_13_4);
		
		Button button_13_5 = new Button("Clear");
		button_13_5.setFont(new Font("Calibri", Font.BOLD, 13));
		button_13_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_13_5.setBounds(735, 413, 226, 22);
		contentPane.add(button_13_5);
		
		Button button_13_6 = new Button("Create Reservation");
		button_13_6.setFont(new Font("Calibri", Font.BOLD, 13));
		button_13_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createres crt = new createres();
				crt.NewScreen();
			}
		});
		button_13_6.setBounds(735, 93, 226, 22);
		contentPane.add(button_13_6);
		
		TextField textField = new TextField();
		textField.setText("Search\r\n");
		textField.setBounds(806, 49, 102, 22);
		contentPane.add(textField);
		
		Button button_13_5_1 = new Button("Select plan ");
		button_13_5_1.setFont(new Font("Calibri", Font.BOLD, 13));
		button_13_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_13_5_1.setBounds(735, 354, 226, 22);
		contentPane.add(button_13_5_1);
		
		Button button_13_5_2 = new Button("Log out");
		button_13_5_2.setFont(new Font("Calibri", Font.BOLD, 13));
		button_13_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login login = new login();
				login.NewScreen();
		
				
			
			
			}
		});
		button_13_5_2.setBounds(735, 520, 226, 22);
		contentPane.add(button_13_5_2);
		
		Label label_edit_1 = new Label("Menu");
		label_edit_1.setFont(new Font("Calibri", Font.BOLD, 15));
		label_edit_1.setForeground(new Color(255, 255, 255));
		label_edit_1.setAlignment(Label.CENTER);
		label_edit_1.setBounds(606, 10, 355, 33);
		contentPane.add(label_edit_1);
	}
}