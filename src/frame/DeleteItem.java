package frame;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DeleteItem extends JFrame{
	
	String names[]={"name1","name2","name3","name4","name5"};
	JLabel sel_item,del;
	JComboBox<String> sel_name;
	JButton del_btn,cancel;
	
	public DeleteItem(String title) {
		super(title);
		setLayout(null);
		del = new JLabel("Delete Items");
		del.setFont(new Font("Times New Roman", 2, 30));
		del.setBounds(240, 10, 200, 30);
		add(del);
		
		sel_item = new JLabel("Select Item");
		sel_item.setBounds(140, 60, 100, 25);
		add(sel_item);
		
		sel_name = new JComboBox<String>(names);
		sel_name.setBounds(230, 60, 180, 25);
		add(sel_name);
		
		del_btn = new JButton("Delete");
		del_btn.setBounds(175, 100, 100, 25);
		add(del_btn);
		
		cancel = new JButton("Cancel");
		cancel.setBounds(325, 100, 100, 25);
		add(cancel);
		
		setLocation(350,225);
		setSize(600,450);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteItem dl = new DeleteItem("Delete Items");

	}

}
