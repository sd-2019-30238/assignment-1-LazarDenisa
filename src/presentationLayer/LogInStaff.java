package presentationLayer;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class LogInStaff extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void showLoginStaff() {
		try {
			LogInStaff dialog = new LogInStaff();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public LogInStaff() {
		setTitle("Staff log in ");
		setBounds(100, 100, 1000, 525);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(153, 102, 153));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblStaffLogIn = new JLabel("    Log in staff");
			lblStaffLogIn.setFont(new Font("Times New Roman", Font.PLAIN, 30));
			lblStaffLogIn.setBounds(380, 47, 187, 52);
			contentPanel.add(lblStaffLogIn);
		}

		{
			JLabel lblNewLabel = new JLabel("   StaffName");
			lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			lblNewLabel.setBounds(199, 138, 111, 25);
			contentPanel.add(lblNewLabel);
		}

		{
			JLabel lblNewLabel_1 = new JLabel("Password");
			lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			lblNewLabel_1.setBounds(211, 227, 99, 19);
			contentPanel.add(lblNewLabel_1);
		}

		{
			textField = new JTextField();
			textField.setBounds(380, 141, 220, 22);
			contentPanel.add(textField);
			textField.setColumns(10);
		}

		{
			textField_1 = new JTextField();
			textField_1.setBounds(380, 227, 220, 22);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}

		{
			JButton btnLogInStaff = new JButton("Log in staff");
			btnLogInStaff.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnLogInStaff.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String usernameStaff = textField.getText();
					String passwordStaff = textField_1.getText();
					AfterLogStaff als = new AfterLogStaff();
					als.showAfterLogStaffPage();
				}
			});
			btnLogInStaff.setBounds(431, 401, 136, 25);
			contentPanel.add(btnLogInStaff);
		}
	}

}
