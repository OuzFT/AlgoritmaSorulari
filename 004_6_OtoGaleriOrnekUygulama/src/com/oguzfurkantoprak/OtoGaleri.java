package com.oguzfurkantoprak;

public class OtoGaleri {
	
	private String galeriAdi;
	private Otomobil[] otomobilDizisi;
	private int galeridekiOtomobilSayisi; // = 0; 0 atamasak da başlangıçta 0'dır.
	
	//hard coded yazım aşağıdaki gibi olurdu: 100 tane otomobil girseydik tek tek yazacak mıydık sanki!?!
//	private Otomobil otomobil1;
//	private Otomobil otomobil2;
//	private Otomobil otomobil3;
//	private Otomobil otomobil4;
	
	//Bunun yerine dinamik kodlama yapalım:
	
	//constructors;
	public OtoGaleri(String galerininAdi, int limit) {
		// String[] = new String[4]; gibi dizi oluşturcaz
		this.otomobilDizisi = new Otomobil[limit]; // {Corsa, Astra, null, null, null} // DİKKAT!!!!!
		this.galeridekiOtomobilSayisi = 0;
		//this.galeriAdi = galerininAdi; veya alttaki satır aynı şey;
		setGaleriAdi(galerininAdi);
	}
	//metodlar:
	public void galeriyeOtomobilEkle (Otomobil otomobil) {
		if (galeridekiOtomobilSayisi < otomobilDizisi.length) 
		{
		otomobilDizisi[galeridekiOtomobilSayisi] = otomobil;
		galeridekiOtomobilSayisi++; // ÖNEMLİ!!
		}
		else
			System.err.println("Galeri kapasitesi full, araç eklenemedi!");
	}
	
	public void galeridekiOtomobilleriListele() {
		
		System.out.println("\n\n"+this.galeriAdi+" galerisindeki otomobiller listesi; " +
				" kapasite: "+ otomobilDizisi.length+
				" Galerideki anlık otomobil sayısı: " + this.galeridekiOtomobilSayisi);
		//System.out.println(otomobilDizisi.length);
		for (int i = 0; i < galeridekiOtomobilSayisi; i++) {
			System.out.println(otomobilDizisi[i].getMarka()+" "+otomobilDizisi[i].getModel());		
		}
	}
	
	
	public Otomobil[] search(String marka) { // ÖNEMLİ! güzel örnek!
		//aranan markaları bulup otomobil arrayi olarak döndüreceğiz.
		int counter = 0;
		for (int i = 0; i < galeridekiOtomobilSayisi; i++) 
		{
			if(this.otomobilDizisi[i].getMarka().equalsIgnoreCase(marka)) // boolean döndürür if
			{ 
				counter++;
			}	
		}
		//counter= aranan marka otomobil sayısı kadardır. Bu sayıyı bildiğimiz için artık array oluşturabiliriz aşağıda
		Otomobil[] aramaSonuclari = new Otomobil[counter];
		
		int sayac = 0;
		for (int i = 0; i < galeridekiOtomobilSayisi; i++) 
		{
			if(this.otomobilDizisi[i].getMarka().equalsIgnoreCase(marka)) // boolean döndürür if
			{ 
				
				aramaSonuclari[sayac] = this.otomobilDizisi[i]; //!!!!!!
				sayac++;
			}	
		}
		return aramaSonuclari;
	}
	
	
	
	
	
	//getters & setters;
	public Otomobil[] getOtomobilDizisi() {
		return otomobilDizisi;
	}

	public int getGaleridekiOtomobilSayisi() {
		return galeridekiOtomobilSayisi;
	}
	
	public String getGaleriAdi() {
		return galeriAdi;
	}

	public void setGaleriAdi(String galeriAdi) {
		this.galeriAdi = galeriAdi;
	}
	
	

}
