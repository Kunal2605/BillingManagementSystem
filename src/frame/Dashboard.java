package frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Dashboard extends JFrame implements ActionListener{
	
	JMenuBar bar;
	JMenu item,bill;
	JMenuItem new_item,update_item,del_item,new_bill,recover_bill,logout,exit;
	
	public Dashboard(String title) {
		super(title);
		setLayout(null);
		
		bar = new JMenuBar();
		item= new JMenu("Item");
		bill= new JMenu("Bill");
		new_item= new JMenuItem("New Item");
		new_item.addActionListener(this);
		update_item= new JMenuItem("Update Item");
		update_item.addActionListener(this);
		del_item = new JMenuItem("Delete Item");
		del_item.addActionListener(this);
		new_bill= new JMenuItem("New bill");
		new_bill.addActionListener(this);
		recover_bill= new JMenuItem("Recover bill");
		
		logout= new JMenuItem("Logout");
		exit= new JMenuItem("Exit");
		
		item.add(new_item);
		item.add(update_item);
		item.add(del_item);
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

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd.equals("New Item"))
		{
			/*dispose();*/
		    new AddItem("Add Items");
		}
		else if(cmd.equals("Update Item"))
		{
			/*dispose();*/
		    new UpdateItem("Update Items");
		}
		else if(cmd.equals("Delete Item"))
		{
			/*dispose();*/
		    new DeleteItem("Delete Item");
		}
		else if(cmd.equals("New bill"))
		{
			/*dispose();*/
		    new BillGenerator("New Bill");
		}
	}
	
	

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

}
