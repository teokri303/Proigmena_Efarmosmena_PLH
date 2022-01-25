import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JTable;
import java.awt.Button;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reserved_Tables extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reserved_Tables frame = new Reserved_Tables();
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
					Reserved_Tables frame = new Reserved_Tables();
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
	public Reserved_Tables() {
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
		
		
		Label edit_profile = new Label("Reserved Table");
		edit_profile.setForeground(Color.WHITE);
		edit_profile.setFont(new Font("Calibri", Font.BOLD, 15));
		edit_profile.setBounds(815, 0, 171, 42);
		contentPane.add(edit_profile);
		
		JLabel logolbl1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Logo.png")).getImage();
		logolbl1.setIcon(new ImageIcon(img));
		logolbl1.setBounds(20, 42, 191, 64);
		contentPane.add(logolbl1);
		
		JLabel lblNewLabel = new JLabel("Reserved Table");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(248, 137, 110, 42);
		contentPane.add(lblNewLabel);
		
		Button button = new Button("101");
		button.setBounds(258, 185, 70, 22);
		contentPane.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Editres editres = new Editres();
				editres.NewScreen();
			}
		});
		
		Button button_1 = new Button("108");
		button_1.setBounds(258, 224, 70, 22);
		contentPane.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Editres editres = new Editres();
				editres.NewScreen();
			}
		});
		
		Button button_2 = new Button("111");
		button_2.setBounds(258, 265, 70, 22);
		contentPane.add(button_2);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Editres editres = new Editres();
				editres.NewScreen();
			}
			});
		Button button_3 = new Button("Back");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Editres edit_res = new Editres();
				edit_res.NewScreen();
			}
		});
		button_3.setBounds(20, 397, 90, 42);
		contentPane.add(button_3);
		
}
}