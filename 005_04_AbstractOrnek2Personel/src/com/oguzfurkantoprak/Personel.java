package com.oguzfurkantoprak;

//FINAL SINIFTAN MİRAS ALINAMAZ!
//Sınıfımız eğer şu şekilde olsaydı bu sınıftan miras alınamazdı:
// public final class Personel {
public abstract class Personel {
	
	private String ad;
	private String soyad;
	private String tcKimlik;
	private int yas;
	private int maas;
	private int kidemBilgisi;
	private long cepTelNo;
	private int zamKatSayisi;
	
	
	// Constructor: Yapıcı Metod
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
		
	//Önemli Not:
	//Abstract metodlar mutlaka abstract sınıfların içinde kullanılır/tanımlanır.
	//ama abstract bir sınıfta abstract olmayan bir metod tanımlanabilir!!
	public abstract int getZamKatSayisi();// abstract metod olduğu için implementasyon olmamalı!!!
	// Bir abstract sınıftan extend edildiği zaman 
	//o abstract sınıf içindeki tüm abstract metodları çhild sınıflardaki override edilen metodlarda 
	//implement etmek zorundayız!!!

	
	
	// FINAL METODLAR OVERRIDE EDİLEMEZ!
	public final String personelKimlikBilgileriniGetir() {
		String personelKimlikBilgileri = "ad: " + this.ad + " Soyad: " + this.soyad+ " TC kimlik no:" + getTcKimlikNo();
		return personelKimlikBilgileri;
	}
	// Ata sınıftaki bir metodu final yaparsak bunu child sınıflarda ezemeyiz(override edemeyiz)!!!
	
	
	
	//getters & setters;
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
