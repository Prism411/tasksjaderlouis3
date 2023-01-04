package entities;
import java.util.Date;
import entities.Product;

public final class ImportedProduct extends Product  {

	private double impTaxes;

	public ImportedProduct(String name, double price, double impTaxes) {
		super(name, price);
		this.impTaxes = impTaxes;
	}
	
	public double TotalValue() {
		double price_product = getPrice();
		return price_product += impTaxes;
	}
	
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append("nome: " + getName() + " preco:" + TotalValue() + " taxa:" + impTaxes);
		return sb.toString();
	}
	
	
}
