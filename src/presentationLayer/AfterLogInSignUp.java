package presentationLayer;

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
	public static void showAfter() {
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

		{ //BORROW A BOOK
			JButton btnNewButton = new JButton("Borrow a book");
			btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnNewButton.addActionListener(new ActionListener() {
                @Override
				public void actionPerformed(ActionEvent e) {
					BorrowBookGui borrow = new BorrowBookGui();
					borrow.showBorrowPage();
				}
			});
			btnNewButton.setBounds(413, 175, 162, 25);
			contentPanel.add(btnNewButton);
		}

		{// RETURN A BOOK
			JButton btnNewButton_1 = new JButton("Return a book");
			btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnNewButton_1.addActionListener(new ActionListener() {
                @Override
				public void actionPerformed(ActionEvent e) {
                    ReturnBookGui returnBook = new ReturnBookGui();
                    returnBook.showReturnPage();
				}
			});
			btnNewButton_1.setBounds(413, 228, 162, 25);
			contentPanel.add(btnNewButton_1);
		}

		{//VIEW BORROW HISTORY
			JButton btnViewBorrowHistory = new JButton("View borrow history");
			btnViewBorrowHistory.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnViewBorrowHistory.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    ViewBorrowHistory borrowHistory = new ViewBorrowHistory();
                    borrowHistory.showBorrowHistPage();
                }
            });
			btnViewBorrowHistory.setBounds(399, 284, 217, 25);
			contentPanel.add(btnViewBorrowHistory);
		}

		{//GET RECOMMENDATIONS
			JButton btnGetRe = new JButton("Get Recommendations");
			btnGetRe.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnGetRe.addActionListener(new ActionListener() {
                @Override
				public void actionPerformed(ActionEvent e) {
                    Recommendations recs = new Recommendations();
                    recs.showRecommendationsPage();
				}
			});
			btnGetRe.setBounds(399, 342, 280, 25);
			contentPanel.add(btnGetRe);
		}

		{//CHOOSE PAYMENT PLAN
			JButton btnChoosePaymentPlan = new JButton("Choose payment plan");
			btnChoosePaymentPlan.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnChoosePaymentPlan.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ChoosePaymentGui pay = new ChoosePaymentGui();
                    pay.showPaymentsPage();
                }
            });
			btnChoosePaymentPlan.setBounds(399, 392, 213, 25);
			contentPanel.add(btnChoosePaymentPlan);
		}
	}

}
