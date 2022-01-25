
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Label;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextArea;
import javax.swing.JTextPane;
import java.awt.Button;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class supporthelp extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					supporthelp frame = new supporthelp();
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
					supporthelp frame = new supporthelp();
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
	public supporthelp() {
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
		
		
		Label Support_label = new Label("Support-Help ");
		Support_label.setForeground(Color.WHITE);
		Support_label.setAlignment(Label.CENTER);
		Support_label.setFont(new Font("Calibri", Font.BOLD, 15));
		Support_label.setBounds(490, 0, 654, 26);
		contentPane.add(Support_label);
		
		JTextPane txtpnNameRestaurants = new JTextPane();
		txtpnNameRestaurants.setText("Your message....\r\n");
		txtpnNameRestaurants.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtpnNameRestaurants.setBounds(219, 284, 639, 233);
		contentPane.add(txtpnNameRestaurants);
		
		Button Send_message_button = new Button("Back");
		Send_message_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu mn = new MainMenu();
				mn.NewScreen();
			}
		});
		Send_message_button.setFont(new Font("Calibri", Font.BOLD, 15));
		Send_message_button.setBounds(10, 639, 85, 44);
		contentPane.add(Send_message_button);
		
		JLabel lblNewLabel = new JLabel("Contac Info");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(219, 120, 113, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("email : reservation+@gmail.com \r\ntelephone number : 2102333333");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(219, 145, 457, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contact form ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(219, 190, 143, 26);
		contentPane.add(lblNewLabel_2);
		
		JEditorPane dtrpnName = new JEditorPane();
		dtrpnName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		dtrpnName.setText("Name\r\n\r\n");
		dtrpnName.setBounds(219, 219, 151, 26);
		contentPane.add(dtrpnName);
		
		JEditorPane dtrpnRestaurantName = new JEditorPane();
		dtrpnRestaurantName.setText("Restaurant Name\r\n\r\n");
		dtrpnRestaurantName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		dtrpnRestaurantName.setBounds(219, 247, 151, 26);
		contentPane.add(dtrpnRestaurantName);
		
		Button Back_button_1 = new Button("Send");
		Back_button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu mn = new MainMenu();
				mn.NewScreen();
			}
		});
		Back_button_1.setFont(new Font("Calibri", Font.BOLD, 15));
		Back_button_1.setBounds(855, 639, 85, 44);
		contentPane.add(Back_button_1);
	}
}