

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Label;
import java.awt.Font;
import java.awt.TextField;
import javax.swing.border.LineBorder;
import java.awt.Button;
import com.toedter.components.JSpinField;
import com.toedter.components.JLocaleChooser;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JYearChooser;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JCalendar;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class createres extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createres frame = new createres();
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
					createres frame = new createres();
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
	public createres() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 730);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 51, 51));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label welcome_label = new Label("Welcome to Reservation+");
		welcome_label.setAlignment(Label.CENTER);
		welcome_label.setFont(new Font("Calibri", Font.BOLD, 15));
		welcome_label.setForeground(new Color(255, 255, 255));
		welcome_label.setBackground(new Color(51, 51, 51));
		welcome_label.setBounds(-69, 0, 337, 26);
		contentPane.add(welcome_label);
		
		TextField textTable = new TextField();
		textTable.setBackground(UIManager.getColor("Button.light"));
		textTable.setForeground(new Color(0, 0, 0));
		textTable.setFont(new Font("Calibri", Font.PLAIN, 15));
		textTable.setBounds(628, 126, 233, 30);
		contentPane.add(textTable);
		
		Label createres_label = new Label("Create Reservation");
		createres_label.setFont(new Font("Calibri", Font.BOLD, 15));
		createres_label.setForeground(new Color(255, 255, 255));
		createres_label.setBackground(new Color(51, 51, 51));
		createres_label.setAlignment(Label.CENTER);
		createres_label.setBounds(440, 0, 446, 37);
		contentPane.add(createres_label);
		
		TextField textTable_1 = new TextField();
		textTable_1.setForeground(Color.BLACK);
		textTable_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		textTable_1.setBounds(628, 196, 233, 30);
		contentPane.add(textTable_1);
		
		TextField textTable_2 = new TextField();
		textTable_2.setForeground(Color.BLACK);
		textTable_2.setFont(new Font("Calibri", Font.PLAIN, 15));
		textTable_2.setBounds(628, 267, 233, 30);
		contentPane.add(textTable_2);
		
		TextField textTable_3 = new TextField();
		textTable_3.setForeground(Color.BLACK);
		textTable_3.setFont(new Font("Calibri", Font.PLAIN, 15));
		textTable_3.setBounds(628, 343, 233, 30);
		contentPane.add(textTable_3);
		
		TextField textTable_4 = new TextField();
		textTable_4.setBackground(UIManager.getColor("Button.light"));
		textTable_4.setForeground(Color.BLACK);
		textTable_4.setFont(new Font("Calibri", Font.PLAIN, 15));
		textTable_4.setBounds(628, 420, 233, 30);
		contentPane.add(textTable_4);
		
		TextField textTable_5 = new TextField();
		textTable_5.setForeground(Color.BLACK);
		textTable_5.setFont(new Font("Calibri", Font.PLAIN, 15));
		textTable_5.setBounds(628, 497, 233, 48);
		contentPane.add(textTable_5);
		
		Button createres_button = new Button("Create Reservation");
		createres_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu mn = new MainMenu();
				mn.NewScreen();
			}
		});
		createres_button.setBackground(Color.LIGHT_GRAY);
		createres_button.setForeground(Color.BLACK);
		createres_button.setFont(new Font("Calibri", Font.BOLD, 13));
		createres_button.setBounds(628, 621, 233, 48);
		contentPane.add(createres_button);
		
		Label label_createres = new Label("Table:");
		label_createres.setFont(new Font("Calibri", Font.PLAIN, 12));
		label_createres.setForeground(new Color(255, 255, 255));
		label_createres.setBounds(628, 99, 59, 21);
		contentPane.add(label_createres);
		
		Label label_createres_1 = new Label("Name:");
		label_createres_1.setForeground(Color.WHITE);
		label_createres_1.setFont(new Font("Calibri", Font.PLAIN, 12));
		label_createres_1.setBounds(628, 169, 87, 21);
		contentPane.add(label_createres_1);
		
		Label label_createres_2 = new Label("Number of People:");
		label_createres_2.setForeground(Color.WHITE);
		label_createres_2.setFont(new Font("Calibri", Font.PLAIN, 12));
		label_createres_2.setBounds(628, 240, 132, 21);
		contentPane.add(label_createres_2);
		
		Label label_createres_3 = new Label("Time of Arrival:");
		label_createres_3.setForeground(Color.WHITE);
		label_createres_3.setFont(new Font("Calibri", Font.PLAIN, 12));
		label_createres_3.setBounds(628, 316, 109, 21);
		contentPane.add(label_createres_3);
		
		Label label_createres_4 = new Label("Contact Number:");
		label_createres_4.setForeground(Color.WHITE);
		label_createres_4.setFont(new Font("Calibri", Font.PLAIN, 12));
		label_createres_4.setBounds(628, 393, 132, 21);
		contentPane.add(label_createres_4);
		
		Label label_createres_5 = new Label("Comments:");
		label_createres_5.setForeground(Color.WHITE);
		label_createres_5.setFont(new Font("Calibri", Font.PLAIN, 12));
		label_createres_5.setBounds(628, 470, 109, 21);
		contentPane.add(label_createres_5);
		
		Button back_button = new Button("Back");
		back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		back_button.setFont(new Font("Calibri", Font.BOLD, 13));
		back_button.setForeground(Color.BLACK);
		back_button.setBackground(Color.LIGHT_GRAY);
		back_button.setBounds(23, 621, 98, 48);
		contentPane.add(back_button);
		
		Label label = new Label("Date of arrival:");
		label.setForeground(new Color(255, 255, 255));
		label.setFont(new Font("Calibri", Font.PLAIN, 14));
		label.setBounds(98, 162, 159, 21);
		contentPane.add(label);
		
		JCalendar calendar = new JCalendar();
		calendar.getYearChooser().getSpinner().setFont(new Font("Tahoma", Font.PLAIN, 10));
		calendar.getMonthChooser().getComboBox().setFont(new Font("Tahoma", Font.PLAIN, 12));
		calendar.setBounds(117, 182, 396, 380);
		contentPane.add(calendar);
		
		
		JLabel logolbl1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Logo.png")).getImage();
		logolbl1.setIcon(new ImageIcon(img));
		logolbl1.setBounds(23, 32, 191, 64);
		contentPane.add(logolbl1);
		
		JLabel phonelbl = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/phone.png")).getImage();
		phonelbl.setIcon(new ImageIcon(img1));
		phonelbl.setBounds(574, 411, 48, 48);
		contentPane.add(phonelbl);
		
		JLabel timelbl = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/time.png")).getImage();
		timelbl.setIcon(new ImageIcon(img2));
		timelbl.setBounds(574, 336, 48, 48);
		contentPane.add(timelbl);
		
		JLabel peoplelbl = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/people.png")).getImage();
		peoplelbl.setIcon(new ImageIcon(img3));
		peoplelbl.setBounds(574, 260, 48, 48);
		contentPane.add(peoplelbl);
		
		JLabel personlbl = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/person.png")).getImage();
		personlbl.setIcon(new ImageIcon(img4));
		personlbl.setBounds(574, 196, 48, 48);
		contentPane.add(personlbl);
		
		JLabel tablelbl = new JLabel("");
		Image img5 = new ImageIcon(this.getClass().getResource("/table.png")).getImage();
		tablelbl.setIcon(new ImageIcon(img5));
		tablelbl.setBounds(574, 114, 48, 48);
		contentPane.add(tablelbl);
		
		JLabel commentslbl = new JLabel("");
		Image img6 = new ImageIcon(this.getClass().getResource("/comments.png")).getImage();
		commentslbl.setIcon(new ImageIcon(img6));
		commentslbl.setBounds(574, 497, 48, 48);
		contentPane.add(commentslbl);
	}
}
