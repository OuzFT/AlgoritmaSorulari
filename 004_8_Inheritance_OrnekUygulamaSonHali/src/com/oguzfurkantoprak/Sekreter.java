package com.oguzfurkantoprak;

// extend etmek miras almak anlamına gelir.
public class Sekreter extends Personel {
	
	private long tel1SeriNo;
	private long tel2SeriNo;
	
	
	
	public Sekreter(String ad, String soyad, String tcKimlik, int yas, int maas, int kidemBilgisi, long cepTelNo, long tel1SeriNo, long tel2SeriNo) {
		super(ad, soyad, tcKimlik, yas, maas, kidemBilgisi, cepTelNo);
		this.setTel1SeriNo(tel1SeriNo);
		this.setTel2SeriNo(tel2SeriNo);
	}

	// Method Overriding: (Metod Ezmek) Ust sınıfta tanımlanan metodu alt sınıfta
	// tekrar tanımlamak.
	public int getZamKatSayisi() {
		return 2;
	}
		
	public long getTel1SeriNo() {
		return tel1SeriNo;
	}
	public void setTel1SeriNo(long tel1SeriNo) {
		this.tel1SeriNo = tel1SeriNo;
	}
	public long getTel2SeriNo() {
		return tel2SeriNo;
	}
	public void setTel2SeriNo(long tel2SeriNo) {
		this.tel2SeriNo = tel2SeriNo;
	}
	
	
	
	
}
