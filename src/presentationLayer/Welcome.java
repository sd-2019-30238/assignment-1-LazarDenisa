package assignment1gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Welcome {

	private JFrame frmWelcome;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome window = new Welcome();
					window.frmWelcome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Welcome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWelcome = new JFrame();
		frmWelcome.setBackground(new Color(255, 204, 204));
		frmWelcome.setTitle("Welcome");
		frmWelcome.setBounds(100, 100, 984, 587);
		frmWelcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWelcome.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 204, 204));
		panel.setBounds(0, 0, 966, 540);
		frmWelcome.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("      Welcome to the bookshop!");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 31));
		lblNewLabel.setBounds(259, 43, 397, 101);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Log in staff");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.setBounds(373, 310, 206, 25);
		panel.add(btnNewButton);
		
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSignUp.setBounds(373, 365, 206, 25);
		panel.add(btnSignUp);
		
		JButton button = new JButton("Log in");
		button.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		button.setBounds(373, 249, 206, 25);
		panel.add(button);
		
		JButton btnFilterBooksIn = new JButton("Filter books in the library");
		btnFilterBooksIn.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnFilterBooksIn.setBounds(344, 424, 262, 25);
		panel.add(btnFilterBooksIn);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(0, 0, 97, 25);
		frmWelcome.getContentPane().add(btnNewButton_1);
	}
}
