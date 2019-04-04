package presentationLayer;

import businessLogic.Recommendation;
import businessLogic.RecommendationFactory;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Recommendations extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField, textField_1;

	/**
	 * Launch the application.
	 */
	public static void showRecommendationsPage() {
		try {
			Recommendations dialog = new Recommendations();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Recommendations() {
		setTitle("Recommendations");
		setBounds(100, 100, 993, 503);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(153, 102, 153));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblRecommendations = new JLabel("Recommendations");
			lblRecommendations.setFont(new Font("Times New Roman", Font.PLAIN, 30));
			lblRecommendations.setBounds(348, 45, 236, 46);
			contentPanel.add(lblRecommendations);
		}
		{
			JLabel lblInsertGenre = new JLabel("Insert criterion");
			lblInsertGenre.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			lblInsertGenre.setBounds(48, 145, 187, 33);
			contentPanel.add(lblInsertGenre);
		}
		{
			textField = new JTextField();
			textField.setBounds(170, 152, 201, 22);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(438, 152, 187, 22);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			JButton btnGetRecommendations = new JButton("Get recommendations");
			btnGetRecommendations.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnGetRecommendations.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String criterion = textField.getText();
						RecommendationFactory rf = new RecommendationFactory();
						Recommendation  recommendation = rf.makeRecommendation(criterion);
						String s = recommendation.getRecommendation(textField_1.getText());
					System.out.println(s);
				}
			});
			btnGetRecommendations.setBounds(112, 221, 243, 25);
			contentPanel.add(btnGetRecommendations);
		}
	}

}
