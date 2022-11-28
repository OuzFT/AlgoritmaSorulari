package soru2;

public class CustomStringTR {
	
	private String metin;

	
	//Constructor;
	public CustomStringTR(String metin) {
		super();
		this.metin = metin;
	}
	// Getters & Setters;
	public String getMetin() {
		return metin;
	}

	public void setMetin(String metin) {
		this.metin = metin;
	}
	

	// Methods;
	public int uzunlukBul() {
		int u = this.metin.length();
		return u;
		
	}
	
	public String trimle() {
		String u = this.metin.trim();
		return u;
	}
	
	public String harfleriBuyut() {
		String u = this.metin.toUpperCase();
		return u;
	}
	
	public String harfleriKucult() {
		String u = this.metin.toLowerCase();
		return u;
	}
	
	public String stringeCevir(int x) {
		String u = this.metin.valueOf(x);
		return u;
	}
	
	public boolean aVarMi() {
		boolean a = this.metin.contains("a");
		return a;
	}
	
	public boolean mIleBaslar() {
		boolean a = this.metin.startsWith("a");
		return a;
	}
	public String degistir() {
		String u = this.metin.replace("", "/");
		return u;
	}
	
	public String ilkKelime() {
		String[] kelimeler = this.metin.split(" ");
		String ilk = kelimeler[0];
		return ilk;
	}
	
	public boolean zIleBiter() {
		boolean a = this.metin.endsWith("z");
		return a;
	}
	
	

	//substring() , tolowercase, replace, indexOf, trim, join split; ilk elemanı büyüt,  
}
