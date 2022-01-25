import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;

import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Signup extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup frame = new Signup();
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
					Signup frame = new Signup();
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
	public Signup() {
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
		logolbl1.setBounds(10, 37, 190, 64);
		contentPane.add(logolbl1);
		
		Label label_edit_1 = new Label("Sign up");
		label_edit_1.setFont(new Font("Calibri", Font.BOLD, 15));
		label_edit_1.setForeground(new Color(255, 255, 255));
		label_edit_1.setAlignment(Label.CENTER);
		label_edit_1.setBounds(669, 0, 355, 33);
		contentPane.add(label_edit_1);
		
		textField = new JTextField();
		textField.setBounds(78, 152, 190, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(80, 123, 83, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblRestaurantName = new JLabel("Restaurant Name");
		lblRestaurantName.setForeground(Color.WHITE);
		lblRestaurantName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRestaurantName.setBounds(78, 191, 130, 29);
		contentPane.add(lblRestaurantName);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(78, 220, 190, 38);
		contentPane.add(textField_1);
		
		JLabel lblEmail = new JLabel("E-mail\r\n");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setBounds(80, 269, 83, 29);
		contentPane.add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(78, 297, 190, 38);
		contentPane.add(textField_2);
		Image img5 = new ImageIcon(this.getClass().getResource("/table.png")).getImage();
		
		
		
		
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(80, 346, 83, 29);
		contentPane.add(lblPassword);
		
	
		
		passwordField = new JPasswordField();
		passwordField.setBounds(78, 375, 190, 38);
		contentPane.add(passwordField);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(408, 66, 45, 38);
		contentPane.add(spinner);
		
		JLabel lblTables = new JLabel("Tables");
		lblTables.setForeground(Color.WHITE);
		lblTables.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTables.setBounds(353, 67, 60, 32);
		contentPane.add(lblTables);
		
		Button button = new Button("Save");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login login = new login();
				login.NewScreen();
				
			
			}
		});
		button.setBounds(440, 385, 83, 28);
		contentPane.add(button);
		
		
		
		Button button_1 = new Button("Back");
		button_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				login login = new login();
				login.NewScreen();
				
			}
		});
		button_1.setBounds(316, 385, 83, 28);
		contentPane.add(button_1);
	}

}
