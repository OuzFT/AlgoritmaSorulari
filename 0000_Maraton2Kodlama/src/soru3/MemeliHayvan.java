package soru3;

public abstract class MemeliHayvan extends Hayvan {

	public MemeliHayvan(String ad, int kilosu, int uzunlugu, boolean tehlikeliMi) {
		super(ad, kilosu, uzunlugu, tehlikeliMi,HayvanTipi.MEMELI);
		
	}

	public abstract void yuru();
}
