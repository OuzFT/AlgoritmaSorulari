package com.oguzfurkantoprak;

public class Serce extends Hayvan implements IUcabilir {

	
	
	public Serce(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
	}
	
	
	@Override
	public void kanatCirp() {
		System.out.println(this.getAd()+ " "+ " sercesi kanat çırpıyor (saniyede 10 kez)");

	}

	@Override
	public void kanatlariTemizle() {
		System.out.println(this.getAd()+ " serçesi kanatlarını temizliyor..");

	}

	@Override
	public void gagala(String nesne) {
		System.out.println(this.getAd()+ " sercesi " + nesne + " gagalıyor!");

	}

	@Override
	public void sesCikar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void yemekYe() {
		// TODO Auto-generated method stub

	}

}
