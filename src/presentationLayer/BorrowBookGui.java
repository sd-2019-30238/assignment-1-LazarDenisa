package presentationLayer;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class BorrowBookGui extends JDialog {

	private final JPanel contentPanel = new JPanel();


	public static void showBorrowPage() {
		try {
			BorrowBookGui dialog = new BorrowBookGui();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


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
