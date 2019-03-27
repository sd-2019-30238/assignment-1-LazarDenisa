package presentationLayer;


import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class ValidatePayPlans extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void showValidatePayPage() {
		try {
			ValidatePayPlans dialog = new ValidatePayPlans();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ValidatePayPlans() {
		setTitle("Validate payments");
		setBounds(100, 100, 958, 551);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(204, 153, 102));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblValidatePaymentPlans = new JLabel("Validate Payment Plans");
			lblValidatePaymentPlans.setFont(new Font("Times New Roman", Font.PLAIN, 30));
			lblValidatePaymentPlans.setBounds(332, 25, 350, 45);
			contentPanel.add(lblValidatePaymentPlans);
		}
		
		JButton btnValidate = new JButton("Validate");
		btnValidate.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnValidate.setBounds(778, 450, 123, 25);
		contentPanel.add(btnValidate);
	}

}
