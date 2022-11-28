package soru3;

public abstract class Surungen extends Hayvan {

	public Surungen(String ad, int kilosu, int uzunlugu, boolean tehlikeliMi) {
		super(ad, kilosu, uzunlugu, tehlikeliMi,HayvanTipi.SURUNGEN);
		
	}

	public abstract void surun();
	
	
}
