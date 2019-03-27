package presentationLayer;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ChoosePaymentGui extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void showPaymentsPage() {
		try {
			ChoosePaymentGui dialog = new ChoosePaymentGui();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ChoosePaymentGui() {
		setTitle("Payment Plans");
		setBounds(100, 100, 956, 579);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 153));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblPaymentPlans = new JLabel("Payment plans available");
			lblPaymentPlans.setFont(new Font("Times New Roman", Font.PLAIN, 30));
			lblPaymentPlans.setBounds(336, 46, 320, 41);
			contentPanel.add(lblPaymentPlans);
		}
		{
			JLabel lblNewLabel = new JLabel("Weekly - Value: 20 RON");
			lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			lblNewLabel.setBounds(370, 160, 232, 25);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Monthly - Value: 80 RON");
			lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			lblNewLabel_1.setBounds(370, 216, 216, 25);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblYearlyValue = new JLabel("Yearly - Value: 960 RON");
			lblYearlyValue.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			lblYearlyValue.setBounds(370, 274, 216, 25);
			contentPanel.add(lblYearlyValue);
		}
		{
			JButton btnNewButton = new JButton("Choose Weekly Plan");
			btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton.setBounds(66, 445, 235, 25);
			contentPanel.add(btnNewButton);
		}
		{
			JButton btnNewButton_1 = new JButton("Choose Monthly Plan");
			btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnNewButton_1.setBounds(363, 484, 218, 25);
			contentPanel.add(btnNewButton_1);
		}
		{
			JButton btnNewButton_2 = new JButton("Choose Yearly Plan");
			btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnNewButton_2.setBounds(628, 448, 200, 25);
			contentPanel.add(btnNewButton_2);
		}
	}

}
