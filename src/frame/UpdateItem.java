package frame;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class UpdateItem extends JFrame{

	String qty_list[]={"1","2","3","4","5","6","7","8","9","10"};
	String names[]={"name1","name2","name3","name4","name5"};
	JLabel l_update,l_name,l_price,l_qty,l_sel_name;
	JSpinner  t_price;
	JComboBox<String> t_qty,sel_name;
	JTextField t_name;
	JButton update,cancel;
	
	public UpdateItem(String title){
		super(title);
		setLayout(null);
		l_update = new JLabel("Update Items");
		l_update.setFont(new Font("Times New Roman", 2, 32));
		l_update.setBounds(240, 10, 200, 32);
		add(l_update);
		
		l_sel_name = new JLabel("Select Name");
		l_sel_name.setBounds(140, 60, 100, 25);
		add(l_sel_name);
		
		l_name = new JLabel("Item Name");
		l_name.setBounds(140, 95, 100, 25);
		add(l_name);
		
		l_price = new JLabel("Item Price");
		l_price.setBounds(140, 130, 100, 25);
		add(l_price);
		
		l_qty = new JLabel("Item Quantity");
		l_qty.setBounds(140, 165, 100, 25);
		add(l_qty);
		
		sel_name = new JComboBox<String>(names);
		sel_name.setBounds(230, 60, 180, 25);
		add(sel_name);
		
		t_name = new JTextField();
		t_name.setBounds(230, 95, 180, 25);
		add(t_name);
		
		t_price = new JSpinner();
		t_price.setBounds(230, 130, 180, 25);
		add(t_price);
		
		t_qty = new JComboBox<String>(qty_list);
		t_qty.setBounds(230, 165, 180, 25);
		add(t_qty);
		
		update = new JButton("Update");
		update.setBounds(175, 205, 100, 25);
		add(update);
		
		cancel = new JButton("Cancel");
		cancel.setBounds(325, 205, 100, 25);
		add(cancel);
		
		setLocation(350,225);
		setSize(600,450);
		setVisible(true);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UpdateItem ui = new UpdateItem("Update Items");
	}

}
