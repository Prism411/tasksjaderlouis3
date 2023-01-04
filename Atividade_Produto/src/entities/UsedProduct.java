package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product{
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
	Date fabricationDate;
	public UsedProduct(String name, double price,Date fabricationDate) {
		super(name, price);
		this.fabricationDate = fabricationDate;
	}
	
	public void setFabricationDate(Date fabricationDate) {
		this.fabricationDate = fabricationDate;
	}
	
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append("nome: " + getName() + " preco:" + getPrice() + "Data: " + fabricationDate );
		return sb.toString();
	
}
	
	
	
}
