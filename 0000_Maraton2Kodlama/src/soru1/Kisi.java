package soru1;

public class Kisi {

	private String adSoyad;
	private String sehir;
	private String no;

	
	//Constructors;
	public Kisi(String adSoyad, String no) {
		super();
		this.adSoyad = adSoyad;
		this.no = no;
	}

	public Kisi(String adSoyad, String sehir, String no) {
		super();
		this.adSoyad = adSoyad;
		this.sehir = sehir;
		this.no = no;
	}

	//
	
	//toString;
	@Override
	public String toString() {
		return "Kisi [adSoyad=" + adSoyad + ", no=" + no + "]";
	}
	
	//
	
	//Getters & Setters;	
	public String getAdSoyad() {
		return adSoyad;
	}
	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}
	public String getSehir() {
		return sehir;
	}
	public void setSehir(String sehir) {
		this.sehir = sehir;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	
}
