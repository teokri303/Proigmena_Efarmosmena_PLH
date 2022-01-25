import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Label;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Scrollbar;
import com.toedter.components.JSpinField;
import com.toedter.components.JLocaleChooser;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JYearChooser;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JCalendar;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Editres extends JFrame {

	private JPanel contentPanel_edit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Editres frame = new Editres();
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
					Editres frame = new Editres();
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
	public Editres() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 730);
		contentPanel_edit = new JPanel();
		contentPanel_edit.setForeground(new Color(255, 255, 255));
		contentPanel_edit.setBackground(new Color(51, 51, 51));
		contentPanel_edit.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPanel_edit);
		contentPanel_edit.setLayout(null);
		
		Label label_edit = new Label("Welcome to Reservation+");
		label_edit.setFont(new Font("Calibri", Font.BOLD, 15));
		label_edit.setForeground(new Color(255, 255, 255));
		label_edit.setAlignment(Label.LEFT);
		label_edit.setBounds(10, 0, 255, 33);
		contentPanel_edit.add(label_edit);
		
		Label label_edit_1 = new Label("Edit Reservation");
		label_edit_1.setFont(new Font("Calibri", Font.BOLD, 15));
		label_edit_1.setForeground(new Color(255, 255, 255));
		label_edit_1.setAlignment(Label.CENTER);
		label_edit_1.setBounds(669, 0, 355, 33);
		contentPanel_edit.add(label_edit_1);
		
		
		JCalendar calendar = new JCalendar();
		calendar.getYearChooser().getSpinner().setFont(new Font("Tahoma", Font.PLAIN, 10));
		calendar.getMonthChooser().getComboBox().setFont(new Font("Tahoma", Font.PLAIN, 12));
		calendar.setBounds(117, 182, 396, 380);
		contentPanel_edit.add(calendar);
		
		
		Label label_edit_2 = new Label("Select Date :");
		label_edit_2.setForeground(new Color(255, 255, 255));
		label_edit_2.setFont(new Font("Calibri", Font.PLAIN, 14));
		label_edit_2.setBounds(117, 145, 137, 21);
		contentPanel_edit.add(label_edit_2);
		
		Button button_edit = new Button("Reserved Tables");
		button_edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reserved_Tables restable = new Reserved_Tables();
				restable.NewScreen();
			}
		});
		button_edit.setBackground(new Color(51, 51, 51));
		button_edit.setFont(new Font("Calibri", Font.BOLD, 16));
		button_edit.setBounds(607, 258, 213, 71);
		contentPanel_edit.add(button_edit);
		
		Button button_edit_1 = new Button("Free Tables");
		button_edit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Free_tables freetable = new Free_tables();
				freetable.NewScreen();
				
			}
		});
		button_edit_1.setFont(new Font("Calibri", Font.BOLD, 16));
		button_edit_1.setBackground(new Color(51, 51, 51));
		button_edit_1.setBounds(607, 411, 213, 71);
		contentPanel_edit.add(button_edit_1);
		
		Button button_edit_2 = new Button("Back");
		button_edit_2.setFont(new Font("Calibri", Font.BOLD, 16));
		button_edit_2.setBackground(new Color(51, 51, 51));
		button_edit_2.setBounds(10, 635, 98, 48);
		contentPanel_edit.add(button_edit_2);
		
		JLabel logolbl1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Logo.png")).getImage();
		logolbl1.setIcon(new ImageIcon(img));
		logolbl1.setBounds(20, 37, 191, 64);
		contentPanel_edit.add(logolbl1);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
