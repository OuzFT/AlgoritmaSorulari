package com.oguzfurkantoprak;

public class Kedi extends Hayvan {

	
	public Kedi(String ad, int kilosu, int uzunlugu) 
	{
		super(ad, kilosu, uzunlugu);	
	}
	
	public void sesCikar() 
	{
		System.out.println("Miyavvvv...");
	}

	@Override
	public void yemekYe() {
		System.out.println("Kedi "+ this.getAd()+" süt içiyor...");
		
	}

}
