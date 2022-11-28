package com.oguzfurkantoprak;

import java.util.ArrayList;

public class Sinif {

	private String sinifAdi;
	private String lokasyon;
	private ArrayList<Ogrenci> ogrencilerArrayList;
	
	
	public void sinifaOgrenciEkle(Ogrenci ogrenci) {
		this.ogrencilerArrayList.add(ogrenci);	
	}
	
	public void sinifaOgrenciEkle(String ad, String soyad, int okulNo, int notOrtalamasi) {
		if(ad.length()<2 || soyad.length()<2)
			System.out.println("Ad veya soyad 2 karakterden küçük olamaz. Öğrenci Sınıfa  eklenemedi.");
		else
			this.ogrencilerArrayList.add(new Ogrenci(ad,soyad,okulNo,notOrtalamasi));	// yeni öğrenci nesnesi oluşturur arraylistin içine ekler.
	}
	
	public void siniftakiOgrencilerinListesiniYazdir() {
		System.out.println("\n\n **********    "+ this.sinifAdi+ " sınıfındaki öğrenci listesi: ********* \n");
		for (Ogrenci ogrenci : ogrencilerArrayList) {
			System.out.println("Öğrenci Adı: "+ ogrenci.getAd()+" Öğrenci Soyadı: "+ogrenci.getSoyad()
			+ " Öğrenci no: "+ ogrenci.getOkulNo()+ " Öğrenci not ortalaması: "+ ogrenci.getNotOrtalamasi());
		}
	}
	
	
	//ArrayList<Ogrenci> alan constructor'ı sildik, gerek yok
	

	public Sinif(String sinifAdi, String lokasyon) {
		super();
		this.sinifAdi = sinifAdi;
		this.lokasyon = lokasyon;
		this.ogrencilerArrayList = new ArrayList<Ogrenci>(); // DİKKAT!!
	}

	
	
	

	public String getSinifAdi() {
		return sinifAdi;
	}


	public void setSinifAdi(String sinifAdi) {
		this.sinifAdi = sinifAdi;
	}


	public String getLokasyon() {
		return lokasyon;
	}


	public void setLokasyon(String lokasyon) {
		this.lokasyon = lokasyon;
	}


	public ArrayList<Ogrenci> getOgrencilerArrayList() {
		return ogrencilerArrayList;
	}


	private void setOgrencilerArrayList(ArrayList<Ogrenci> ogrencilerArrayList) { //set edilsin istemiyoruz o yüzden private yaptık
		this.ogrencilerArrayList = ogrencilerArrayList;
	}
	
	
	
	
}
