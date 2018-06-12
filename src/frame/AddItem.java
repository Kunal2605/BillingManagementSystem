package frame;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class AddItem extends JFrame{
	
	String qty_list[]={"1","2","3","4","5","6","7","8","9","10"};
	JLabel l_add,l_name,l_price,l_qty;
	JSpinner  t_price;
	JComboBox<String> t_qty;
	JTextField t_name;
	JButton add,cancel;
	
	public AddItem(String title){
		super(title);
		setLayout(null);
		l_add = new JLabel("Add Items");
		l_add.setFont(new Font("Times New Roman", 2, 28));
		l_add.setBounds(240, 10, 200, 28);
		add(l_add);
		
		l_name = new JLabel("Item Name");
		l_name.setBounds(140, 60, 100, 25);
		add(l_name);
		
		l_price = new JLabel("Item Price");
		l_price.setBounds(140, 95, 100, 25);
		add(l_price);
		
		l_qty = new JLabel("Item Quantity");
		l_qty.setBounds(140, 130, 100, 25);
		add(l_qty);
		
		t_name = new JTextField();
		t_name.setBounds(230, 60, 180, 25);
		add(t_name);
		
		t_price = new JSpinner();
		t_price.setBounds(230, 95, 180, 25);
		add(t_price);
		
		t_qty = new JComboBox<String>(qty_list);
		t_qty.setBounds(230, 130, 180, 25);
		add(t_qty);
		
		add = new JButton("Add");
		add.setBounds(175, 170, 100, 25);
		add(add);
		
		cancel = new JButton("Cancel");
		cancel.setBounds(325, 170, 100, 25);
		add(cancel);
		
		setLocation(350,225);
		setSize(600,450);
		setVisible(true);
	}

	public static void main(String[] args) {
		AddItem add = new AddItem("Add Items");

	}

}
