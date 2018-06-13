package frame;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class BillGenerator extends JFrame{

	String names[]={"Cash","Paytm","Credit Card","Debit Card"};
	String item_list[]={"name1","name2","name3","name3"};
	JLabel l_bill,l_bill_no,l_bill_date,l_payment_mode,l_cust_name,l_sep,l_item,l_price,l_qty,l_total_amt;
	JTextField t_no,t_name,t_date,t_price,t_qty,t_total_amt;
	JComboBox<String> pay_mode,item;
	JButton add_cart;
	
	public BillGenerator(String title) {
		super(title);
		setLayout(null);
		l_bill = new JLabel("New Bill");
		l_bill.setFont(new Font("Times New Roman", 2, 32));
		l_bill.setBounds(240, 10, 200, 32);
		add(l_bill);
		
		l_bill_no = new JLabel("Bill No.");
		l_bill_no.setBounds(50, 60, 100, 25);
		add(l_bill_no);
		
		l_bill_date = new JLabel("Enter Date");
		l_bill_date.setBounds(50, 95, 100, 25);
		add(l_bill_date);
		
		l_payment_mode = new JLabel("Payment Mode");
		l_payment_mode.setBounds(300, 60, 100, 25);
		add(l_payment_mode);
		
		l_cust_name = new JLabel("Customer Name");
		l_cust_name.setBounds(300, 95, 100, 25);
		add(l_cust_name);
		
		t_no = new JTextField();
		t_no.setBounds(130, 60, 150, 25);
		add(t_no);
		
		t_date = new JTextField();
		t_date.setBounds(130, 95, 150, 25);
		add(t_date);
		
		pay_mode = new JComboBox<String>(names);
		pay_mode.setBounds(410, 60, 150, 25);
		add(pay_mode);
		
		t_name = new JTextField();
		t_name.setBounds(410, 95, 150, 25);
		add(t_name);
		
		l_item = new JLabel("Select Item");
		l_item.setBounds(50, 150, 100, 25);
		add(l_item);
		
		item = new JComboBox<String>(item_list);
		item.setBounds(130, 150, 150, 25);
		add(item);
		
		l_price = new JLabel("Price");
		l_price.setBounds(300, 150, 100, 25);
		add(l_price);
		
		t_price = new JTextField();
		t_price.setBounds(410, 150, 150, 25);
		add(t_price);
		
		l_qty = new JLabel("Quantity");
		l_qty.setBounds(50, 185, 100, 25);
		add(l_qty);
		
		t_qty = new JTextField();
		t_qty.setBounds(130, 185, 150, 25);
		add(t_qty);
		
		l_total_amt = new JLabel("Total Price");
		l_total_amt.setBounds(300, 185, 100, 25);
		add(l_total_amt);
		
		t_total_amt = new JTextField();
		t_total_amt.setBounds(410, 185, 150, 25);
		add(t_total_amt);
		
		add_cart = new JButton("Add to cart");
		add_cart.setBounds(250,240,100,30);
		add(add_cart);
		
		setLocation(350,225);
		setSize(600,450);
		setVisible(true);
	}
	
	/*public static void main(String[] args) {
		BillGenerator bg = new BillGenerator("New bill");

	}*/

}
