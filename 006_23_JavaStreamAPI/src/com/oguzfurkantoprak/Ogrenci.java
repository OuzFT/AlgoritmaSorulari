package com.oguzfurkantoprak;

import java.util.Random;

public class Ogrenci {

	private String ad;
	private int id;

	
	
	public Ogrenci(String ad, int id) {
		super();
		this.ad = ad;
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

	
	@Override
	public String toString() {
		return "Ogrenci [ad=" + ad + ", id=" + id + "]";
	}


	public void printSinavNotu() {
		Random r = new Random();
		System.out.println("Ogrenci: " + this.ad + " sınav notu: " + r.nextInt(100)); // DİKKAT!!!
	}
	
	
	
	
	
	
	
}
