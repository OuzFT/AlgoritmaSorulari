package com.oguzfurkantoprak;

public class Muhendis extends Personel {

	private String uzmanlikAlani;

	public Muhendis(String ad, String soyad, String tcKimlik, int yas, int maas, int kidemBilgisi, long cepTelNo,
			String uzmanlikAlani) {
		super(ad, soyad, tcKimlik, yas, maas, kidemBilgisi, cepTelNo);
		this.uzmanlikAlani = uzmanlikAlani;
	}

	// Method Overriding: (Metod Ezmek) Ust sınıfta tanımlanan metodu alt sınıfta
	// tekrar tanımlamak.
	public int getZamKatSayisi() {
		return 3;
	}

	public String getUzmanlikAlani() {
		return uzmanlikAlani;
	}

	public void setUzmanlikAlani(String uzmanlikAlani) {
		this.uzmanlikAlani = uzmanlikAlani;
	}

}
