package com.oguzfurkantoprak;

public class Kopek extends Hayvan implements IKuyruklu {

	public Kopek(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);		
	}
	
	public void sesCikar() {
		System.out.println("Hav hav hav...");
	}

	@Override// burada olsa da olur olmasa da olur ama Spring'de mutlaka annotasyon kullanılır.
	public void yemekYe() {
		System.out.println("Köpek "+ this.getAd()+" yemek yiyor...");
	}

	@Override
	public void kuyrukSalla() {
		System.out.println(this.getAd() + " köpeği kuyruk sallıyor...");
		
	}

}
