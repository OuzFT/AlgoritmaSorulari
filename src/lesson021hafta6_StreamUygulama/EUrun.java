package lesson021hafta6_StreamUygulama;

public enum EUrun {
	
	Cips(20), Kola(15), Şeker(60), Yağ(200), Un(50), Ekmek(5), Çay(60), Yumurta(14), Yoğurt(22), Süt(12),ELma(30);
	
	double fiyat;

	//constructor:
	EUrun(double fiyat) {
		this.fiyat = fiyat;
	}
	
	//getters & setters:
	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

}