package model;

public class Product {

	private int id;
	private String name;
	private int price;
	private int quantity;
	private String image;
	private int categories_id;

	public Product() {
	}

	public Product(int id, String name, int price, int quantity, String image, int categories_id) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.image = image;
		this.categories_id = categories_id;
	}
	public Product(String name, int price, int quantity, String image, int categories_id) {
		super();
		
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.image = image;
		this.categories_id = categories_id;
	}

	public int getCategories_id() {
		return categories_id;
	}

	public void setCategories_id(int categories_id) {
		this.categories_id = categories_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
