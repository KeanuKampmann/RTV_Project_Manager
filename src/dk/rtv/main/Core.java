package dk.rtv.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Core extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Core frame = new Core();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception
	 */
	public Core() throws InterruptedException {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Core.class.getResource("/dk/rtv/others/RTV-Logo.jpg")));
		setTitle("RTV Project Manager");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 221);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 641, 24);
		contentPane.add(toolBar);
		
		JButton btnNeu = new JButton("Neu");
		btnNeu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Create.window();
			}
		});
		toolBar.add(btnNeu);
		
		JLabel lblId = new JLabel("ID:      Name:                                  Deadline:                                  ProjektLeiter:");
		lblId.setBounds(10, 35, 520, 14);
		contentPane.add(lblId);
		
		JLabel lblNewLabel = new JLabel("0       null                                   null                                   null");
		lblNewLabel.setBounds(10, 60, 530, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(542, 56, 89, 23);
		contentPane.add(btnDelete);
		
		JLabel label = new JLabel("0       null                                   null                                   null");
		label.setBounds(10, 81, 530, 14);
		contentPane.add(label);
		
		JButton button = new JButton("Delete");
		button.setBounds(542, 77, 89, 23);
		contentPane.add(button);
		
		JLabel label_1 = new JLabel("0       null                                   null                                   null");
		label_1.setBounds(10, 102, 530, 14);
		contentPane.add(label_1);
		
		JButton button_1 = new JButton("Delete");
		button_1.setBounds(542, 98, 89, 23);
		contentPane.add(button_1);
		
		JLabel label_2 = new JLabel("0       null                                   null                                   null");
		label_2.setBounds(10, 123, 530, 14);
		contentPane.add(label_2);
		
		JButton button_2 = new JButton("Delete");
		button_2.setBounds(542, 119, 89, 23);
		contentPane.add(button_2);
		
		JLabel label_3 = new JLabel("0       null                                   null                                   null");
		label_3.setBounds(10, 144, 530, 14);
		contentPane.add(label_3);
		
		JButton button_3 = new JButton("Delete");
		button_3.setBounds(542, 140, 89, 23);
		contentPane.add(button_3);
		
		JLabel label_4 = new JLabel("0       null                                   null                                   null");
		label_4.setBounds(10, 166, 530, 14);
		contentPane.add(label_4);
		
		JButton button_4 = new JButton("Delete");
		button_4.setBounds(542, 162, 89, 23);
		contentPane.add(button_4);
		
	}
}
