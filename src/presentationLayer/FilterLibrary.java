package presentationLayer;

import dataAccessLayer.BookDAO;

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
import java.sql.SQLException;

public class FilterLibrary extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;


	public static void showFilterLib() {
		try {
			FilterLibrary dialog = new FilterLibrary();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public FilterLibrary()  {
		setTitle("Filter books ");
		setBounds(100, 100, 998, 540);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(204, 204, 153));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblFilterLibrary = new JLabel("    Filter library");
			lblFilterLibrary.setFont(new Font("Times New Roman", Font.PLAIN, 30));
			lblFilterLibrary.setBounds(376, 54, 212, 36);
			contentPanel.add(lblFilterLibrary);
		}
		{
			textField = new JTextField();
			textField.setBounds(74, 124, 116, 22);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(74, 201, 116, 22);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBounds(74, 282, 116, 22);
			contentPanel.add(textField_2);
			textField_2.setColumns(10);
		}
		{
			textField_3 = new JTextField();
			textField_3.setBounds(74, 364, 116, 22);
			contentPanel.add(textField_3);
			textField_3.setColumns(10);
		}
		{
			JButton btnNewButton = new JButton("Filter by genre");
			btnNewButton.setBounds(219, 123, 143, 25);
			contentPanel.add(btnNewButton);
            btnNewButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    BookDAO bDAO = new BookDAO();
                    try{
                        String s = bDAO.filterByGenre(textField.getText());
                        System.out.println(s);
                    }catch(SQLException e){
                        System.out.println("Result not found");
                    }

                }
            });


        }


		{
			JButton btnNewButton_1 = new JButton("Filter by author");
			btnNewButton_1.setBounds(219, 200, 143, 25);
			contentPanel.add(btnNewButton_1);
            btnNewButton_1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    BookDAO bDAO = new BookDAO();
                    try{
                        String s = bDAO.filterByAuthor(textField_1.getText());
                        System.out.println(s);
                    }catch(SQLException e){
                        System.out.println("Result not found");
                    }

                }
            });
		}
		{
			JButton btnNewButton_2 = new JButton("Filter by title");
			btnNewButton_2.setBounds(219, 281, 143, 25);
			contentPanel.add(btnNewButton_2);
            btnNewButton_2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    BookDAO bDAO = new BookDAO();
                    try{
                        String s = bDAO.filterByTitle(textField_2.getText());
                        System.out.println(s);
                    }catch(SQLException e){
                        System.out.println("Result not found");
                    }

                }
            });
		}
		{
			JButton btnFilterByDate = new JButton("Filter by date");
			btnFilterByDate.setBounds(219, 363, 143, 25);
			contentPanel.add(btnFilterByDate);
            btnFilterByDate.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    BookDAO bDAO = new BookDAO();
                    try{
                        String s = bDAO.filterByReleaseDate(textField_3.getText());
                        System.out.println(s);
                    }catch(SQLException e){
                        System.out.println("Result not found");
                    }

                }
            });
		}
	}

}
