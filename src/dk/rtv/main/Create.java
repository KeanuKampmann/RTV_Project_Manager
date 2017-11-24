package dk.rtv.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Create extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void window() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Create frame = new Create();
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
	public Create() {
		setTitle("Neues Projekt");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 277, 160);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10, 0, 140, 14);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(10, 14, 140, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDeadline = new JLabel("Deadline:");
		lblDeadline.setBounds(10, 45, 140, 14);
		contentPane.add(lblDeadline);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 59, 140, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 104, 140, 20);
		contentPane.add(textField_2);
		
		JLabel lblProjektleiter = new JLabel("Projektleiter:");
		lblProjektleiter.setBounds(10, 90, 140, 14);
		contentPane.add(lblProjektleiter);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
			}
		});
		btnNewButton.setBounds(160, 81, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(186, 17, 46, 14);
		contentPane.add(lblId);
		
		textField_3 = new JTextField();
		textField_3.setBounds(203, 14, 46, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	}
}
