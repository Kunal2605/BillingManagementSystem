package frame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class WelcomeScreen extends JFrame implements Runnable{
	
	JLabel l_Welcome;
	JProgressBar j_bar;
	Thread t;
	
	public WelcomeScreen(String title){
		super(title);
		setLayout(null);
		setUndecorated(true);
		t= new Thread(this);
		l_Welcome = new JLabel("Billing System");
		l_Welcome.setFont(new Font("Times New Roman", 2, 30));
		l_Welcome.setBounds(100, 100, 200, 30);
		add(l_Welcome);
		
		j_bar = new JProgressBar();
		j_bar.setBounds(0, 242, 400, 250);
		j_bar.setForeground(Color.green);
		add(j_bar);
		
		t.start();
		setLocation(480,200);
		setSize(400,250);
		setVisible(true);
	}
	
	@Override
	public void run() {
		try {
			for (int i = 1; i <= 100; i++) {
				j_bar.setValue(i);
				t.sleep(30);
			}
			dispose();
			new LoginFrame("Login");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WelcomeScreen lg = new WelcomeScreen("Welcome Screen");
	}

}
