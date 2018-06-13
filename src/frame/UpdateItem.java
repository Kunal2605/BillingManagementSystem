package frame;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;

import DAO.DAOFactory;
import bean.Item;


public class UpdateItem extends JFrame implements ActionListener{

	ArrayList<String> ql = new ArrayList<String>();
	String qty_list[]={"1","2","3","4","5","6","7","8","9","10"};
	String names[]={"name1","name2","name3","name4","name5"};
	JLabel l_update,l_name,l_price,l_qty,l_sel_name;
	JSpinner  t_price,t_qty;
	JComboBox<String> sel_name;
	JTextField t_name;
	JButton update,cancel;
	
	public UpdateItem(String title){
		super(title);
		setLayout(null);
		  
		l_update = new JLabel("Update Items");
		l_update.setFont(new Font("Times New Roman", 2, 35));
		l_update.setBounds(220, 10, 200, 35);
		add(l_update);
		
		l_sel_name = new JLabel("Select Name");
		l_sel_name.setBounds(140, 80, 100, 25);
		add(l_sel_name);
		
		l_name = new JLabel("Item Name");
		l_name.setBounds(140, 115, 100, 25);
		add(l_name);
		
		l_price = new JLabel("Item Price");
		l_price.setBounds(140, 150, 100, 25);
		add(l_price);
		
		l_qty = new JLabel("Item Quantity");
		l_qty.setBounds(140, 185, 100, 25);
		add(l_qty);
		
		sel_name = new JComboBox<String>(names);
		sel_name.setBounds(230, 80, 180, 25);
		add(sel_name);
		
		t_name = new JTextField();
		t_name.setBounds(230, 115, 180, 25);
		add(t_name);
		
		t_price = new JSpinner();
		t_price.setBounds(230, 150, 180, 25);
		add(t_price);
		
		t_qty = new JSpinner();
		t_qty.setBounds(230, 185, 180, 25);
		add(t_qty);
		
		update = new JButton("Update");
		update.setBounds(175, 225, 100, 25);
		add(update);
		
		cancel = new JButton("Cancel");
		cancel.setBounds(325, 225, 100, 25);
		add(cancel);
		
		update.addActionListener(this);
		cancel.addActionListener(this);
		
		setLocation(350,225);
		setSize(600,450);
		setVisible(true);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UpdateItem ui = new UpdateItem("Update Items");
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd.equals("Update"))
		{
			String name,up_name;
			int price,qty;
			name = t_name.getText();
			price = (int) t_price.getValue();
			qty = (int) t_qty.getValue();
			up_name = (String) sel_name.getSelectedItem();
			if(name.trim().length()<=0 || price<=0 || qty<=0){
				JOptionPane.showMessageDialog(null, "Name can't be blank or price and quantity can't be less than or equal to zero");
			}else{
				Item item = new Item();
				item.setName(name);
				item.setPrice(price);
				item.setQty(qty);
				item.setSel_name(up_name);
				DAOFactory dao = DAOFactory.getDAo();
				boolean flag = dao.UpdateProduct(item);
				if(flag)
				{
					JOptionPane.showMessageDialog(null, "Item Updated");
				}
				else{
					JOptionPane.showMessageDialog(null, "Error 404");
				} 
			}
			
			
		}
		else{
			t_name.setText("");
			t_price.setValue(0);;
			t_qty.setValue(0);
			
		}
		
	}

}
