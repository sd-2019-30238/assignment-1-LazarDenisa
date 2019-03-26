package assignment1gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogIn extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			LogIn dialog = new LogIn();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public LogIn() {
		setTitle("Log in ");
		setBounds(100, 100, 1015, 554);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(153, 204, 153));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("   Log in ");
			lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
			lblNewLabel.setBounds(411, 28, 127, 36);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("   Username");
			lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			lblNewLabel_1.setBounds(151, 153, 161, 25);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("     Password");
			lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			lblNewLabel_2.setBounds(145, 271, 120, 16);
			contentPanel.add(lblNewLabel_2);
		}
		{
			textField = new JTextField();
			textField.setBounds(369, 156, 254, 22);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(369, 270, 254, 22);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			JButton btnNewButton = new JButton("Log in ");
			btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton.setBounds(424, 445, 97, 25);
			contentPanel.add(btnNewButton);
		}
	}

}
