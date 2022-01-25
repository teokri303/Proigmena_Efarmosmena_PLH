import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Label;
import javax.swing.JLabel;
import java.awt.Button;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class editprofile extends JFrame {

	private JPanel contentPane;
	private JTextField txtTelephoneNumber;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					editprofile frame = new editprofile();
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
					editprofile frame = new editprofile();
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
	public editprofile() {
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
		welcome_label.setBackground(new Color(51, 51, 51));
		welcome_label.setBounds(-69, 0, 337, 26);
		contentPane.add(welcome_label);
		
		
		Label edit_profile = new Label("Edit profile ");
		edit_profile.setForeground(Color.WHITE);
		edit_profile.setFont(new Font("Calibri", Font.BOLD, 15));
		edit_profile.setBounds(815, 0, 171, 42);
		contentPane.add(edit_profile);
		
		JTextArea txtrOwnersName = new JTextArea();
		txtrOwnersName.setFont(new Font("Calibri", Font.BOLD, 18));
		txtrOwnersName.setBounds(54, 195, 364, 32);
		contentPane.add(txtrOwnersName);
		
		JTextArea txtrBusinessName = new JTextArea();
		txtrBusinessName.setFont(new Font("Calibri", Font.BOLD, 18));
		txtrBusinessName.setBounds(54, 288, 364, 32);
		contentPane.add(txtrBusinessName);
		
		txtTelephoneNumber = new JTextField();
		txtTelephoneNumber.setFont(new Font("Calibri", Font.BOLD, 18));
		txtTelephoneNumber.setBounds(54, 372, 364, 32);
		contentPane.add(txtTelephoneNumber);
		txtTelephoneNumber.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Calibri", Font.BOLD, 18));
		txtEmail.setBounds(54, 458, 364, 32);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		Button btnNewButton = new Button("Save \r\nchanges");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu mn = new MainMenu();
				mn.NewScreen();
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 15));
		btnNewButton.setBounds(653, 635, 141, 42);
		contentPane.add(btnNewButton);
		
		Button btnNewButton_1 = new Button("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu mn = new MainMenu();
				mn.NewScreen();
			}
		});
		btnNewButton_1.setFont(new Font("Calibri", Font.BOLD, 15));
		btnNewButton_1.setBounds(10, 635, 98, 48);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Owner's name");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 23));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(54, 172, 178, 24);
		contentPane.add(lblNewLabel);
		
		JLabel logolbl1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Logo.png")).getImage();
		logolbl1.setIcon(new ImageIcon(img));
		logolbl1.setBounds(20, 42, 191, 64);
		contentPane.add(logolbl1);
		
		JLabel lblBusinessName = new JLabel("Business name\r\n");
		lblBusinessName.setForeground(Color.WHITE);
		lblBusinessName.setFont(new Font("Calibri", Font.BOLD, 23));
		lblBusinessName.setBounds(54, 267, 178, 24);
		contentPane.add(lblBusinessName);
		
		JLabel lblTelephoneNumber = new JLabel("Telephone number");
		lblTelephoneNumber.setForeground(Color.WHITE);
		lblTelephoneNumber.setFont(new Font("Calibri", Font.BOLD, 23));
		lblTelephoneNumber.setBounds(54, 347, 214, 24);
		contentPane.add(lblTelephoneNumber);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Calibri", Font.BOLD, 23));
		lblEmail.setBounds(54, 436, 178, 24);
		contentPane.add(lblEmail);
	}
}