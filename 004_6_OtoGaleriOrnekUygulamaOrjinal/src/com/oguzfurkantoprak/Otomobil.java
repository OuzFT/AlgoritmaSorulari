package com.oguzfurkantoprak;

public class Otomobil {

	// Otomobil sınıfından türetilecek her bir nesnenin sahip olabileceği
	// özellikler:
	private String marka;
	private String model;        // String nesnesi de null olarak initialize edilir.
	private int yil;	            // Sayisal veri tipleri 0 olarak initialize edilir.
	private int aracinKm;
	private Motor aracinMotoru;  // Motor nesnesi null olarak default initialize edilir.
	private int depodakiYakit;
	private final int depoHacmi;
		
	
	
	// Method Overloading : Constructor Overloading	
	public Otomobil(int depoHacmi) {
		this.depoHacmi = depoHacmi;
	}
	
		
    // Parametre: Bir metodun parantez içindeki aldığı değişkenlere denir.
	public Otomobil(String marka, String model, int yil, int aracinKm, Motor aracinMotoru, int depoHacmi) {		
		this.marka = marka;
		this.model = model;
		this.yil = yil;
		this.aracinKm = aracinKm;
		this.aracinMotoru = aracinMotoru;
		this.depodakiYakit = 0;
		this.depoHacmi = depoHacmi; 
	}
	
	
	public Otomobil(String marka, String model, int yil, int aracinKm, Motor aracinMotoru, int depoHacmi, int depodakiYakit) {		
		this.marka = marka;
		this.model = model;
		this.yil = yil;
		this.aracinKm = aracinKm;
		this.aracinMotoru = aracinMotoru;
		this.depodakiYakit = depodakiYakit;
		this.depoHacmi = depoHacmi;
	}


	public Otomobil(String marka, String model, int yil, int depoHacmi) {		
		this.marka = marka;
		this.model = model;
		this.yil = yil;
		this.depoHacmi = depoHacmi;
	}

	
	
	public String getAllOtomobilBilgileri() {
		String tumOtomobilBilgileri;
		tumOtomobilBilgileri = "Marka: " + this.marka + " Model: " + this.model + " Yıl: " + this.yil 
								+ " Aracın km: " + this.aracinKm + this.getAracinMotoru().getAllMotorBilgileri()
								+ " Depodaki yakıt: " + this.depodakiYakit;
		return tumOtomobilBilgileri;
	}
	
	
	public void araciSur(int km) {
		int tuketilenYakit = aracinMotoru.getYakitTuketimi() * km / 100;
		
		if (tuketilenYakit <= depodakiYakit) {		
			depodakiYakit = depodakiYakit - tuketilenYakit;  // => this.depodakiYakit = this.depodakiYakit - tuketilenYakit;
			aracinKm = aracinKm + km;
		}
		else {
			System.err.println("Deponuzdaki yakıt ile " + km + " km. mesafe gidemezsiniz");
		}
	}
	
	
	public int getDepodakiYakit() {
		return depodakiYakit;
	}


	public void setDepodakiYakit(int depodakiYakit) {
		if (depodakiYakit > this.depoHacmi)
		{
			this.depodakiYakit = this.depoHacmi;
		}
		else
		{
			this.depodakiYakit = depodakiYakit;
		}
	}

	

	public String getMarka() {
		return this.marka;
	}
	
	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getYil() {
		return this.yil;
	}
	
	public void setYil(int yil) {
		this.yil = yil;
	}
	
	public int getAracinKm() {
		return this.aracinKm;
	}
	
	public void setAracinKm(int aracinKm) {
		this.aracinKm = aracinKm;
	}
	
	public Motor getAracinMotoru() {
		return this.aracinMotoru;
	}
	
	public void setAracinMotoru(Motor aracinMotoru) {
		this.aracinMotoru = aracinMotoru;
	}
	

	
	
	
	
}
