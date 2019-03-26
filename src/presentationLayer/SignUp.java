package assignment1gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;

public class SignUp extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			SignUp dialog = new SignUp();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public SignUp() {
		setTitle("Sign Up");
		setBounds(100, 100, 1005, 564);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 153));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("            Sign Up");
			lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
			lblNewLabel.setBounds(318, 34, 208, 53);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("         First Name");
			lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			lblNewLabel_1.setBounds(139, 135, 178, 16);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Last Name");
			lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			lblNewLabel_2.setBounds(186, 184, 97, 16);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Address");
			lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			lblNewLabel_3.setBounds(200, 228, 83, 16);
			contentPanel.add(lblNewLabel_3);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Age");
			lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			lblNewLabel_4.setBounds(210, 279, 56, 16);
			contentPanel.add(lblNewLabel_4);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("Id User");
			lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			lblNewLabel_5.setBounds(200, 330, 93, 16);
			contentPanel.add(lblNewLabel_5);
		}
		{
			JButton btnNewButton = new JButton("Sign Up");
			btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnNewButton.setBounds(402, 479, 178, 25);
			contentPanel.add(btnNewButton);
		}
		
		textField = new JTextField();
		textField.setBounds(394, 132, 202, 22);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(394, 183, 202, 22);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(394, 227, 202, 22);
		contentPanel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(394, 276, 202, 22);
		contentPanel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(394, 327, 202, 22);
		contentPanel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblIdAccount = new JLabel("Id Account");
		lblIdAccount.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblIdAccount.setBounds(186, 377, 117, 16);
		contentPanel.add(lblIdAccount);
		
		textField_5 = new JTextField();
		textField_5.setBounds(394, 374, 202, 22);
		contentPanel.add(textField_5);
		textField_5.setColumns(10);
	}
}
