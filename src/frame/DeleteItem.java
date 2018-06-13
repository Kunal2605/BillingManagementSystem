
package frame;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import DAO.DAOFactory;
import bean.Item;

public class DeleteItem extends JFrame implements ActionListener{
	
	String names[]={"name1","name2","name3","name4","name5"};
	JLabel sel_item;
	JComboBox<String> sel_name;
	JButton del_btn,cancel;
	public DeleteItem(String title) {
		
		super(title);
		setLayout(null);
		
			
			sel_item = new JLabel("Select Item");
			sel_item.setBounds(140, 100, 100, 25);
			sel_item.setBounds(140, 60, 100, 25);
			add(sel_item);
			
			sel_name = new JComboBox<String>(names);
			sel_name.setBounds(230, 100, 180, 25);
			sel_name.setBounds(230, 60, 180, 25);
			add(sel_name);
			
			del_btn = new JButton("Delete");
			del_btn.setBounds(175, 170, 100, 25);
			del_btn.setBounds(175, 100, 100, 25);
			add(del_btn);
			
			cancel = new JButton("Cancel");
			cancel.setBounds(325, 170, 100, 25);
			cancel.setBounds(325, 100, 100, 25);
			add(cancel);
			
			del_btn.addActionListener(this);
			cancel.addActionListener(this);
			
			setLocation(350,225);
			setSize(600,450);
			setVisible(true);

	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd.equals("Delete"))
		{
			String del_name;
			del_name = (String) sel_name.getSelectedItem();
			
				Item item = new Item();
				item.setSel_name(del_name);
				DAOFactory dao = DAOFactory.getDAo();
				boolean flag = dao.DeleteProduct(item);
				if(flag)
				{
					JOptionPane.showMessageDialog(null, "Item Deleted");
				}
				else{
					JOptionPane.showMessageDialog(null, "Error 404");
				} 
			
			
		}
		else{
			
			
		}

		
	}

}