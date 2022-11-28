package lesson010hafta4_oopProduct;


public class Product {

	//member variables(=Attribute=property=field) are below;
	private String productId;
	private int unitPrice;
	private int unitStock;
	private String name;
	
	//constructors are below;
	public Product() {
			
	}

	public Product(String productId, String name) {
		this.productId = productId;
		this.name = name;
	}
	//bilgileri yazdıran metod yazalım:
	
	public void bilgileriGetir() { //Statik değil!
		System.out.println("product id: "+ this.productId + " Unit price: " + unitPrice + " Unit Stock: " + unitStock + " name: "+ name);
		//this. yazmasak da olur, metod, aynı isimde input almadığı için
	}
	
	
	
	//getter and setters are below;
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getUnitStock() {
		return unitStock;
	}

	public void setUnitStock(int unitStock) {
		this.unitStock = unitStock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
