package com.oguzfurkantoprak;

public class Otomobil {
	
	//Otomobil sınıfından türetilecek her bir nesnenin sahib olacağı ortak nitelikler
	public String marka;
	public String model; //String nesnesi de null olarak initialize edilir.
	public int yil; //sayisal veri tipleri 0 olarak init edilir.
	public int aracinKm;
	public Motor aracinMotoru; // motor nesnesi default null olarak init edilir.
	

	
	
	
	public Otomobil() {//boş bir constructor oluşturduk.
	//	super(); //super(); inheritance'a gelince görücez bunu. Object.class'tan türetir bunu. F3e basıp gör
		
	}
	
	//method overloading özelinde constructor overloading yapalım
	public Otomobil(String marka, String model, int yil, int aracinKm, Motor aracinMotoru) { 
		//bu constructorı oluşturcaksak araca bir motor bağlanmmalıdır.
		this.marka = marka;
		this.model = model;
		this.yil = yil;
		this.aracinKm = aracinKm;
		this.aracinMotoru = aracinMotoru; // burada aracinMotoru'nu otomobil nesnesine bağlıyoruz
	}





	//getter ve setterlar aşağıda:
	public String getMarka() {
		return marka;
		
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getYil() {
		return yil;
	}
	
	public void setYil(int yil) {
		this.yil = yil;
	}
	
	public int getAracinKm() {
		return aracinKm;
	}
	
	public void setAracinKm(int aracinKm) {
		this.aracinKm = aracinKm;
	}
	
	public Motor getAracinMotoru() {
		return aracinMotoru;
	}
	
	public void setAracinMotoru(Motor aracinMotoru) {
		this.aracinMotoru = aracinMotoru;
	}
	
	
	
}
