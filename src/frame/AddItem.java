package frame;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import DAO.DAOFactory;
import bean.Item;

public class AddItem extends JFrame implements ActionListener{
	
	JLabel l_add,l_name,l_price,l_qty;
	JSpinner  t_price,t_qty;
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
		
		l_price = new JLabel("Item Price(Rs.)");
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
		
		t_qty = new JSpinner();
		t_qty.setBounds(230, 130, 180, 25);
		add(t_qty);
		
		add = new JButton("Add");
		add.setBounds(175, 170, 100, 25);
		add(add);
		
		cancel = new JButton("Cancel");
		cancel.setBounds(325, 170, 100, 25);
		add(cancel);
		
		add.addActionListener(this);
		cancel.addActionListener(this);
		
		setLocation(350,225);
		setSize(600,450);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String cmd = e.getActionCommand();
		if(cmd.equals("Add"))
		{
			String name;
			int price,qty;
			name = t_name.getText();
			price = (int) t_price.getValue();
			qty = (int) t_qty.getValue();
			if(name.trim().length()<=0 || price<=0 || qty<=0){
				JOptionPane.showMessageDialog(null, "Name can't be blank or price and quantity can't be less than or equal to zero");
			}else{
				Item item = new Item();
				item.setName(name);
				item.setPrice(price);
				item.setQty(qty);
				DAOFactory dao = DAOFactory.getDAo();
				boolean flag = dao.InsertProduct(item);
				if(flag)
				{
					JOptionPane.showMessageDialog(null, "New item added");
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

	public static void main(String[] args) {
		AddItem add = new AddItem("Add Items");

	}

}
