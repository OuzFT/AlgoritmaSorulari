package soru3;

public abstract class Hayvan {

	public String ad;
	public int kilosu;
	public int uzunlugu;
	public boolean tehlikeliMi;
	public HayvanTipi tip;
	
	public abstract void sesCikar();
	public abstract void bilgileriGoster();
	
	
	public Hayvan(String ad, int kilosu, int uzunlugu, boolean tehlikeliMi, HayvanTipi tip) {
		super();
		this.ad = ad;
		this.kilosu = kilosu;
		this.uzunlugu = uzunlugu;
		this.tehlikeliMi = tehlikeliMi;
		this.tip = tip;
	}
	
	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getKilosu() {
		return kilosu;
	}

	public void setKilosu(int kilosu) {
		this.kilosu = kilosu;
	}

	public int getUzunlugu() {
		return uzunlugu;
	}

	public void setUzunlugu(int uzunlugu) {
		this.uzunlugu = uzunlugu;
	}

	public boolean isTehlikeliMi() {
		return tehlikeliMi;
	}

	public void setTehlikeliMi(boolean tehlikeliMi) {
		this.tehlikeliMi = tehlikeliMi;
	}

	@Override
	public String toString() {
		return "Hayvan [ad=" + ad + ", kilosu=" + kilosu + ", uzunlugu=" + uzunlugu + ", tehlikeliMi=" + tehlikeliMi
				+ "]";
	}
	
	
	
	
}
