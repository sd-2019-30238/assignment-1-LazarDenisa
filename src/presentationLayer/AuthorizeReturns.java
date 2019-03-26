package assignment1gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;

public class AuthorizeReturns extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AuthorizeReturns dialog = new AuthorizeReturns();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AuthorizeReturns() {
		getContentPane().setBackground(new Color(153, 255, 153));
		setTitle("Authorize returns");
		setBounds(100, 100, 958, 546);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 432, 1);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			JButton btnAuthorize = new JButton("Authorize");
			btnAuthorize.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnAuthorize.setBounds(726, 445, 140, 25);
			getContentPane().add(btnAuthorize);
		}
		
		JLabel lblOngoingReturns = new JLabel("Ongoing returns");
		lblOngoingReturns.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblOngoingReturns.setBounds(343, 64, 226, 35);
		getContentPane().add(lblOngoingReturns);
	}

}
