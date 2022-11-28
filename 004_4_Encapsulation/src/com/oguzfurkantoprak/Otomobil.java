package com.oguzfurkantoprak;

public class Otomobil {
	
	//Otomobil sınıfından türetilecek her bir nesnenin sahib olacağı ortak nitelikler
	public String marka;
	public String model; //String nesnesi de null olarak initialize edilir.
	public int yil; //sayisal veri tipleri 0 olarak init edilir.
	public int aracinKm;
	public Motor aracinMotoru; // motor nesnesi default null olarak init edilir.
	

	
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
