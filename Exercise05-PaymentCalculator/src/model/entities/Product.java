// Entity class representing a product.

package model.entities;

public class Product {

	// Fields.
	private Integer id;
	private Integer quantity;
	private Double value;
	
	// Constructor.
	public Product(Integer id, Integer quantity, Double value) {
		this.id = id;
		this.quantity = quantity;
		this.value = value;
	}

	// Getters and Setters.
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
}
