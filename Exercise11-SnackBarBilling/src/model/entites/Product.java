// Entity class representing a product.

package model.entites;

public class Product {

	// Fields.
	private Integer id;
	private String name;
	private Integer quantity;
	private Double price;
	
	// Constructor.
	public Product(Integer id, String name, Double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	// Getters and Setters.
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
}
