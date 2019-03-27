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

public class ViewBorrowHistory extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void showBorrowHistPage() {
		try {
			ViewBorrowHistory dialog = new ViewBorrowHistory();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ViewBorrowHistory() {
		getContentPane().setBackground(new Color(0, 153, 204));
		setTitle("Borrowed Books");
		setBounds(100, 100, 1052, 555);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 1, 508);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			JLabel lblBorrowedBooks = new JLabel("Borrowed Books");
			lblBorrowedBooks.setFont(new Font("Times New Roman", Font.PLAIN, 30));
			lblBorrowedBooks.setBounds(397, 44, 208, 36);
			getContentPane().add(lblBorrowedBooks);
		}
	}
}
