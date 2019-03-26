package assignment1gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class ReturnBookGui extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ReturnBookGui dialog = new ReturnBookGui();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ReturnBookGui() {
		setTitle("Return Book");
		setBounds(100, 100, 841, 448);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(153, 204, 204));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblReturnABook = new JLabel("Return a book");
			lblReturnABook.setFont(new Font("Times New Roman", Font.PLAIN, 30));
			lblReturnABook.setBounds(331, 46, 186, 36);
			contentPanel.add(lblReturnABook);
		}
		
		JButton btnReturnBook = new JButton("Return Book");
		btnReturnBook.setBounds(666, 352, 116, 25);
		contentPanel.add(btnReturnBook);
	}

}
