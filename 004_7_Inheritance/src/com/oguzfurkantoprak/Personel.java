package com.oguzfurkantoprak;

//Ata sınıf veya üst sınıf denir(parent class): 
public class Personel {
	
	private String ad;
	private String soyad;
	private String tcKimlik;
	private int yas;
	private int maas;
	private int kidemBilgisi;
	private long cepTelNo;
	
	//constructor: yapıcı metod.
	public Personel() {
		super();
		System.out.println("Personel sınıfının constructor'ı çağırıldı.");
	}
	
	public Personel(String str) {
		System.out.println("Personel sınıfının 2. constructor'ı çağırıldı.");
	}
	
	
	public long getCepTelNo() {
		return cepTelNo;
	}
	
	public void setCepTelNo(long cepTelNo) {
		this.cepTelNo = cepTelNo;
	}
	
	public int getKidemBilgisi() {
		return kidemBilgisi;
	}
	public void setKidemBilgisi(int kidemBilgisi) {
		this.kidemBilgisi = kidemBilgisi;
	}
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getTcKimlikNo() {
		return tcKimlik;
	}
	public void setTcKimlikNo(String tcKimlikNo) {
		this.tcKimlik = tcKimlikNo;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	public int getMaas() {
		return maas;
	}
	public void setMaas(int maas) {
		this.maas = maas;
	}

	
	
	
}
