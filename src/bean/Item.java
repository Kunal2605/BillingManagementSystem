package bean;

import java.util.ArrayList;

public class Item {

	String name,sel_name;
	float price,qty;
	ArrayList<String> data = new ArrayList<String>();
	public ArrayList<String> getData() {
		return data;
	}
	public void setData(ArrayList<String> data) {
		this.data = data;
	}
	public String getName() {
		return name;
	}
	public String getSel_name() {
		return sel_name;
	}
	public void setSel_name(String sel_name) {
		this.sel_name = sel_name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getQty() {
		return qty;
	}
	public void setQty(float qty) {
		this.qty = qty;
	}
}
