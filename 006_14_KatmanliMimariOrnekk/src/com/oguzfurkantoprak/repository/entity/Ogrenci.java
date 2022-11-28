package com.oguzfurkantoprak.repository.entity;

public class Ogrenci {

	private String ad;
	private int id;
	private String soyad;
	
	
	public Ogrenci(String ad, String soyad, int id) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.id = id;
	}


	public String getAd() {
		return ad;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSoyad() {
		return soyad;
	}


	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}


	@Override
	public String toString() {
		return "Ogrenci [ad=" + ad + ", id=" + id + ", soyad=" + soyad + "]";
	}


	
	
	
	
	
	
	
}
