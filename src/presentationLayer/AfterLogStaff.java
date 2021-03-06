package presentationLayer;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AfterLogStaff extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void showAfterLogStaffPage() {
		try {
			AfterLogStaff dialog = new AfterLogStaff();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AfterLogStaff() {
		setTitle("Manage library");
		setBounds(100, 100, 1023, 589);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(204, 255, 102));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);



		{//AUTHORIZE RETURNS
			JButton btnAuthorizeReturns = new JButton("Authorize returns");
			btnAuthorizeReturns.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnAuthorizeReturns.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				AuthorizeReturns ar = new AuthorizeReturns();
				ar.showAuthorizeRetPage();
				}
			});
			btnAuthorizeReturns.setBounds(380, 123, 194, 25);
			contentPanel.add(btnAuthorizeReturns);
		}



		{//VALIDATE PAYMENT PLANS
			JButton btnValidatePaymentPlans = new JButton("Validate payment plans");
			btnValidatePaymentPlans.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnValidatePaymentPlans.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					ValidatePayPlans vpp = new ValidatePayPlans();
					vpp.showValidatePayPage();
				}
			});
			btnValidatePaymentPlans.setBounds(349, 242, 265, 25);
			contentPanel.add(btnValidatePaymentPlans);
		}
	}

}
