package entities;

public class OrderItem {

	private Integer quantity;
	private double price;

	private Product p1;

	public OrderItem() {

	}

	public OrderItem(Integer quantity, double price, Product p1) {
		this.quantity = quantity;
		this.price = price;
		this.p1 = p1;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product getP1() {
		return p1;
	}

	public void setP1(Product p1) {
		this.p1 = p1;
	}
	
	public double subTotal() {
		return quantity * price;
	}
	

	public String toString() {
		return p1.getName() 
				+ ", $" 
				+ String.format("%.2f", price) 
				+ ", Quantity: " 
				+ quantity + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}

}
