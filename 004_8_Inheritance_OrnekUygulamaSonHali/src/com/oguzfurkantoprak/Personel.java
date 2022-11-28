package com.oguzfurkantoprak;

// Ata sınıf veya Üst Sınıf (parent class):
public class Personel {
	
	private String ad;
	private String soyad;
	private String tcKimlik;
	private int yas;
	private int maas;
	private int kidemBilgisi;
	private long cepTelNo;
	private int zamKatSayisi;
	
	
	// Constructor : Yapıcı Metod
	public Personel() {		
	}
	
	
	public Personel(String ad, String soyad, String tcKimlik, int yas, int maas, int kidemBilgisi, long cepTelNo) 
	{
		this.setAd(ad);
		this.setSoyad(soyad);
		this.setTcKimlikNo(tcKimlik);
		this.setYas(yas);
		this.setMaas(maas);
		this.setKidemBilgisi(kidemBilgisi);
		this.setCepTelNo(cepTelNo);
	}
		
	
	public int getZamKatSayisi() {
		return 1;
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
