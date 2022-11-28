package com.oguzfurkantoprak;

public class IdariMemur extends Personel {

	private String gorevi;
	private long telSeriNo;

	public IdariMemur(String ad, String soyad, String tcKimlik, int yas, int maas, int kidemBilgisi, long cepTelNo,
			String gorevi, long telSeriNo) {
		super(ad, soyad, tcKimlik, yas, maas, kidemBilgisi, cepTelNo);
		this.gorevi = gorevi;
		this.telSeriNo = telSeriNo;
	}

	// Method Overriding: (Metod Ezmek) Ust sınıfta tanımlanan metodu alt sınıfta
	// tekrar tanımlamak.
	public int getZamKatSayisi() {
		return 2;
	}

	public String getGorevi() {
		return gorevi;
	}

	public void setGorevi(String gorevi) {
		this.gorevi = gorevi;
	}

	public long getTelSeriNo() {
		return telSeriNo;
	}

	public void setTelSeriNo(long telSeriNo) {
		this.telSeriNo = telSeriNo;
	}

}
