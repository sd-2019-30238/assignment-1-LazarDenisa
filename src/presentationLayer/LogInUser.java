package presentationLayer;

import businessLogic.User;
import dataAccessLayer.ConnectionFactory;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LogInUser extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private ArrayList<User> loggedInUsers = new ArrayList<User>();

	/**
	 * Launch the application.
	 */
	public static void showLogIn() {
		try {
			LogInUser dialog = new LogInUser();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public LogInUser() {
		setTitle("Log in ");
		setBounds(100, 100, 1015, 554);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(153, 204, 153));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("   Log in ");
			lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
			lblNewLabel.setBounds(411, 28, 127, 36);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("   Username");
			lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			lblNewLabel_1.setBounds(151, 153, 161, 25);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("     Password");
			lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			lblNewLabel_2.setBounds(145, 271, 120, 16);
			contentPanel.add(lblNewLabel_2);
		}
		{//user
			textField = new JTextField();
			textField.setBounds(369, 156, 254, 22);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{//pass
			textField_1 = new JTextField();
			textField_1.setBounds(369, 270, 254, 22);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			JButton btnNewButton = new JButton("Log in ");
			btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

				    //CHECK USERNAME AND PASSWORD, and if they are correct take user to next page


                    String logQuery = "SELECT * FROM accounts WHERE username=? and password=?";
                    Connection conn=null;
                    PreparedStatement ps = null;
                    ResultSet rs = null;

                    try{
                        conn = ConnectionFactory.getConnection();
                        ps = conn.prepareStatement(logQuery);
                        ps.setString(1,textField.getText());
                        ps.setString(2,textField_1.getText());
                        rs = ps.executeQuery();
                        if(rs.next()){
                            AfterLogInSignUp alsu = new AfterLogInSignUp();
                            alsu.showAfter();
                            User u = new User(textField.getText(),textField_1.getText());
                            loggedInUsers.add(u);
                        }
                    }catch(SQLException exception){
                        exception.printStackTrace();
                    }
				}
			});
			btnNewButton.setBounds(424, 445, 97, 25);
			contentPanel.add(btnNewButton);
		}
	}

	public ArrayList<User> getLoggedInUsers(){
	    return this.loggedInUsers;
    }

}
