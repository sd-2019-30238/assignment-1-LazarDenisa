package assignment1gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class BorrowBookGui extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			BorrowBookGui dialog = new BorrowBookGui();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public BorrowBookGui() {
		setTitle("Borrow a book");
		setBounds(100, 100, 1001, 555);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblBorrowABook = new JLabel("   Borrow a Book");
			lblBorrowABook.setFont(new Font("Times New Roman", Font.PLAIN, 30));
			lblBorrowABook.setBounds(370, 49, 229, 41);
			contentPanel.add(lblBorrowABook);
		}
		{
			JButton btnBorrow = new JButton("Borrow");
			btnBorrow.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnBorrow.setBounds(840, 453, 97, 25);
			contentPanel.add(btnBorrow);
		}
	}

}
