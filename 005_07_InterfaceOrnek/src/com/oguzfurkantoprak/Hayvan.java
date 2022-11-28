package com.oguzfurkantoprak;

public abstract class Hayvan extends Canli {

	public String ad;
	public int kilosu;
	public int uzunlugu;
	
	// Abstract methodlar implementasyon(kodlama) içermez. Sadece metod tanımı yeterlidir. {} yoktur!
	//
	// Abstract yapılan metodlar mutlaka alt sınıflarda implement edilmelidir. Yani kodlanmalıdır.
	public abstract void sesCikar();
	
	public abstract void yemekYe();
	
	
	public Hayvan(String ad, int kilosu, int uzunlugu) {
		super();
		this.ad = ad;
		this.kilosu = kilosu;
		this.uzunlugu = uzunlugu;
	}


	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public int getKilosu() {
		return kilosu;
	}
	public void setKilosu(int kilosu) {
		this.kilosu = kilosu;
	}
	public int getUzunlugu() {
		return uzunlugu;
	}
	public void setUzunlugu(int uzunlugu) {
		this.uzunlugu = uzunlugu;
	}
	
	
	
}
