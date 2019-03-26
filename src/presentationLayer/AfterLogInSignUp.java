package assignment1gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AfterLogInSignUp extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AfterLogInSignUp dialog = new AfterLogInSignUp();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AfterLogInSignUp() {
		setTitle("Choose an option");
		setBounds(100, 100, 1014, 561);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 204, 102));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblWhatDoYou = new JLabel("      What do you want to do ?");
			lblWhatDoYou.setFont(new Font("Times New Roman", Font.PLAIN, 30));
			lblWhatDoYou.setBounds(301, 49, 385, 65);
			contentPanel.add(lblWhatDoYou);
		}
		{
			JButton btnNewButton = new JButton("Borrow a book");
			btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton.setBounds(413, 175, 162, 25);
			contentPanel.add(btnNewButton);
		}
		{
			JButton btnNewButton_1 = new JButton("Return a book");
			btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton_1.setBounds(413, 228, 162, 25);
			contentPanel.add(btnNewButton_1);
		}
		{
			JButton btnViewBorrowHistory = new JButton("View borrow history");
			btnViewBorrowHistory.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnViewBorrowHistory.setBounds(399, 284, 217, 25);
			contentPanel.add(btnViewBorrowHistory);
		}
		{
			JButton btnGetRe = new JButton("Get Recommendations");
			btnGetRe.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnGetRe.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnGetRe.setBounds(399, 342, 217, 25);
			contentPanel.add(btnGetRe);
		}
		{
			JButton btnChoosePaymentPlan = new JButton("Choose payment plan");
			btnChoosePaymentPlan.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnChoosePaymentPlan.setBounds(399, 392, 213, 25);
			contentPanel.add(btnChoosePaymentPlan);
		}
	}

}
