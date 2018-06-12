package frame;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Dashboard extends JFrame{
	
	JMenuBar bar;
	JMenu item,bill;
	JMenuItem new_item,update_item,new_bill,recover_bill,logout,exit;
	
	public Dashboard(String title) {
		super(title);
		setLayout(null);
		
		bar = new JMenuBar();
		item= new JMenu("Item");
		bill= new JMenu("Bill");
		new_item= new JMenuItem("New Item");
		update_item= new JMenuItem("Update Item");
		new_bill= new JMenuItem("New bill");
		recover_bill= new JMenuItem("Recover bill");
		
		logout= new JMenuItem("Logout");
		exit= new JMenuItem("Exit");
		
		item.add(new_item);
		item.add(update_item);
		item.addSeparator();
		item.add(logout);
		item.add(exit);
		
		bill.add(new_bill);
		bill.add(recover_bill);
		
		bar.add(item);
		bar.add(bill);
		
		setJMenuBar(bar);
		
		setVisible(true);
		setSize(900,700);
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

}
