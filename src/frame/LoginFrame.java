package frame;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import constant.Constant;

public class LoginFrame extends JFrame implements ActionListener{
	JLabel l_login,l_email,l_pass;
	JTextField t_email;
	JPasswordField t_pass;
	JButton signin,cancel;
	
	public LoginFrame(String title) {
		super(title);
		setLayout(null);
		l_login = new JLabel("Login");
		l_login.setFont(new Font("Times New Roman", 2, 32));
		l_login.setBounds(150, 5, 100, 35);
		add(l_login);
		
		l_email = new JLabel("Email");
		l_email.setBounds(40, 60, 100, 25);
		add(l_email);
		
		l_pass = new JLabel("Password");
		l_pass.setBounds(40, 95, 100, 25);
		add(l_pass);
		
		t_email = new JTextField();
		t_email.setBounds(130, 60, 180, 25);
		add(t_email);
		
		t_pass = new JPasswordField();
		t_pass.setBounds(130, 95, 180, 25);
		add(t_pass);
		
		signin = new JButton("SignIn");
		signin.setBounds(100, 150, 100, 25);
		add(signin);
		
		cancel = new JButton("Cancel");
		cancel.setBounds(230, 150, 100, 25);
		add(cancel);
		
		signin.addActionListener(this);
		cancel.addActionListener(this);
		
		setLocation(450,270);
		setSize(400,250);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String cmd = e.getActionCommand();
		if(cmd.equals("SignIn")){
			String email,pass;
			email = t_email.getText();
			pass = t_pass.getText();
			if(email.trim().length()<=0 || pass.trim().length()<=0){
				JOptionPane.showMessageDialog(null, "Don't leave blank");
			}else{
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(Constant.DB_HOST + Constant.DB_NAME,Constant.DB_USER_NAME,Constant.DB_USER_PASSWORD);
					String query = "SELECT * FROM "+Constant.DB_USER_TABLE+" WHERE `email_id`=? AND PASSWORD=?";
					PreparedStatement statement = con.prepareStatement(query);
					statement.setString(1, email);
					statement.setString(2, pass);
					
					ResultSet set = statement.executeQuery();
					if (set.next()) {
						dispose();
						new Dashboard("Dashboard");
					}
					else{
						JOptionPane.showMessageDialog(null, "Incorrect email or pass");
					}
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				/*if(email.equals(pass)){
					dispose();
					new Dashboard("Dashboard");
				}
				else{
					JOptionPane.showMessageDialog(null, "Incorrect email or pass");
				}*/ 
			}
		}
		else{
			t_email.setText("");
			t_pass.setText("");
		}
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoginFrame lg = new LoginFrame("Login Form");
	}*/

}
