package com.oguzfurkantoprak;

public class Otomobil {
	
	//Otomobil sınıfından türetilecek her bir nesnenin sahip olacağı ortak nitelikler
	private String marka;
	private String model; //String nesnesi de null olarak initialize edilir.
	private int yil; //sayisal veri tipleri 0 olarak init edilir.
	private int aracinKm;
	private Motor aracinMotoru; // motor nesnesi default null olarak init edilir.
	// Motor classını otomobil classının içinde kullandık üyesi olarak
	private int depodakiYakit;
	private final int depoHacmi; // constructorlarda final değerleri atamak gerekir!!!!!!!!!! 
	//Static olsaydı tüm otomobiller için aynı olurdu. nonstatic yaptık
	
	
	
	
	//constructors;
	public Otomobil(int depoHacmi) {//boş bir constructor oluşturduk.
	//	super(); //super(); inheritance'a gelince görücez bunu. Object.class'tan türetir bunu. F3e basıp gör
		this.depoHacmi=depoHacmi;
	}
	
	//method overloading özelinde constructor overloading yapalım
	public Otomobil(String marka, String model, int yil, int aracinKm, Motor aracinMotoru, int depoHacmi) { 
		//bu constructorı oluşturcaksak araca bir motor bağlanmmalıdır.
		this.marka = marka;
		this.model = model;
		this.yil = yil;
		this.aracinKm = aracinKm;
		this.aracinMotoru = aracinMotoru; // burada aracinMotoru'nu otomobil nesnesine bağlıyoruz
		this.depodakiYakit = 0;
		this.depoHacmi = depoHacmi;
	}

	public Otomobil(String marka, String model, int yil, int aracinKm, Motor aracinMotoru,int depoHacmi, int depodakiYakit ) { 
		//bu constructorı oluşturcaksak araca bir motor bağlanmmalıdır.
		this.marka = marka;
		this.model = model;
		this.yil = yil;
		this.aracinKm = aracinKm;
		this.aracinMotoru = aracinMotoru; // burada aracinMotoru'nu otomobil nesnesine bağlıyoruz
		this.depodakiYakit = depodakiYakit;
		this.depoHacmi = depoHacmi;
	}
	
	
	//metodlarımız;
	public String getAllOtomobilBilgileri() {
		String tumOtomobilBilgileri;
		tumOtomobilBilgileri = "Marka: " + this.marka + " Model: " + this.model + " Yıl: " + this.yil +
				" Aracın km: " + this.aracinKm + this.getAracinMotoru().getAllMotorBilgileri() + " Depodaki yakıt: "
				+ this.depodakiYakit;
		return tumOtomobilBilgileri;
	}
	

	public void araciSur(int km) {
		int tuketilenYakit = aracinMotoru.getYakitTuketimi() * km/100;
		//System.out.println(km+ " km yol gittiniz ve " + tuketilenYakit+"lt. kadar yakıt tükettiniz. ");
		if(tuketilenYakit<= depodakiYakit) {
			depodakiYakit = depodakiYakit - tuketilenYakit;
			this.aracinKm = aracinKm + km;
		}
		else {
			System.out.println("Deponuzdaki yakıt ile "+ km + " km kadar mesafe gidemezsiniz!");
		}
		
		
	}


	
	//getter ve setterlar aşağıda:
	public String getMarka() {
		return marka;
		
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getYil() {
		return yil;
	}
	
	public void setYil(int yil) {
		this.yil = yil;
	}
	
	public int getAracinKm() {
		return aracinKm;
	}
	
	public void setAracinKm(int aracinKm) {
		this.aracinKm = aracinKm;
	}
	
	public Motor getAracinMotoru() {
		return aracinMotoru;
	}
	
	public void setAracinMotoru(Motor aracinMotoru) {
		this.aracinMotoru = aracinMotoru;
	}

	public int getDepodakiYakit() {
		return depodakiYakit;
	}

	public void setDepodakiYakit(int depodakiYakit) {
		if(depodakiYakit>this.depoHacmi) {
			this.depodakiYakit = this.depoHacmi;
		}	
		else
			this.depodakiYakit = depodakiYakit;
			
	}
	
	
	
}
