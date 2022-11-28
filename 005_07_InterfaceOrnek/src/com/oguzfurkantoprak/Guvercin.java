package com.oguzfurkantoprak;

public class Guvercin extends Hayvan implements IUcabilir {

	public Guvercin(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
	}
	
	public void sesCikar()
	{
		System.out.println("Cik cik cik...");
	}

	@Override
	public void yemekYe() {
		System.out.println("Kuş " + this.getAd() + " yem yiyor...");
		
	}

	@Override
	public void kanatCirp() {
		System.out.println(this.getAd()+ " "+ " güvercini kanat çırpıyor (saniyede 5 kez)");
		
	}

	@Override
	public void kanatlariTemizle() {
		System.out.println(this.getAd()+ " güvercini kanatlarını temizliyor..");
		
	}

	@Override
	public void gagala(String nesne) {
		System.out.println(this.getAd()+ " güvercini " + nesne + " gagalıyor!");
		
	}

}
