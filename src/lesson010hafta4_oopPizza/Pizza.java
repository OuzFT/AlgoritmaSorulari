package lesson010hafta4_oopPizza;

public class Pizza {
	
	private int price;
	private boolean pizzaTipiNormalMi;
	private int vegiFiyat = 300;
	private int normalFiyat = 200;
	
	public Pizza(boolean pizzaTipi) {
		// constructor ismi ile class ismi aynı olmalı o yüzden PascalCase/ normalde metodlar camelCase ile yazılır
		this.pizzaTipiNormalMi = pizzaTipi;
		if (pizzaTipiNormalMi) {
			this.price = vegiFiyat;
		}else
			this.price = normalFiyat;	
	}

	public void sosEkle() {
		this.price = price + 50;
		
	}
	
	public void peynirEkle() {
		this.price = price + 100;
		
	}
	
	public void eveSiparis() {
		this.price = price + 20;
		
	}
	
	public void fisAl() {
		System.out.println("Toplam sipariş tutarı:" + price);
	}
	
	
	//getters setters;
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isPizzaTipiNormalMi() {
		return pizzaTipiNormalMi;
	}

	public void setPizzaTipiNormalMi(boolean pizzaTipiNormalMi) {
		this.pizzaTipiNormalMi = pizzaTipiNormalMi;
	}
	
	
	
	
	
}
