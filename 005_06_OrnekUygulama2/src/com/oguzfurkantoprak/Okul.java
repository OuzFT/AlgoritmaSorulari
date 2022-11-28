package com.oguzfurkantoprak;

import java.util.ArrayList;

public class Okul {
	
	private String okulAdi;
	private String okulAdresi;
	private ArrayList<Sinif> siniflarArrayList;
	
	
	
	//ArrayList<Sinif> alan constructor'ı sildik, gerek yok.
	//ArrayListi aşağıdaki constructor'da oluşturalım. // this.siniflarArrayList = new ArrayList<Sinif>();

	public Okul(String okulAdi, String okulAdresi) {
		super();
		this.okulAdi = okulAdi;
		this.okulAdresi = okulAdresi;
		this.siniflarArrayList = new ArrayList<Sinif>();
		
	}
	
	
	//for ile okuldaki öğrencileri yazdıran metodu yazalım:
	public void okuldakiOgrencileriYazdır() { // DİKKAT!!!
		System.out.println("\n\n -----------    "+ this.okulAdi+ "'ndaki öğrenciler listesi: ------------ \n");
		for (int i = 0; i < this.siniflarArrayList.size(); i++) {
			for (int j = 0; j < this.siniflarArrayList.get(i).getOgrencilerArrayList().size(); j++) 
			{			
				System.out.println("Adı: "+this.siniflarArrayList.get(i).getOgrencilerArrayList().get(j).getAd()+
						" /Soyad: "+this.siniflarArrayList.get(i).getOgrencilerArrayList().get(j).getSoyad()+
						" /Ogrenci No: "+ this.siniflarArrayList.get(i).getOgrencilerArrayList().get(j).getOkulNo());
			}
		}
	}
	
	//for-each ile okuldaki öğrencileri yazdıran metodu yazalım: DİKKAT!!!! Burası biraz karışık..!?
	public void okuldakiOgrencileriYazdırForEach() {
		System.out.println("\n\n -----------    "+ this.okulAdi+ "'ndaki öğrenciler listesi: ------------ \n");
		for (Sinif sinif : siniflarArrayList) {
			for (Ogrenci ogrenci : sinif.getOgrencilerArrayList()) {
				System.out.println(ogrenci.getAd()+"\t"+ogrenci.getSoyad());
			}
		}
	}
	
	
	
	
	
	//Okula sınıf ekleme metodu yazalım:
	public void sinifEkle(Sinif sinif) {
		this.siniflarArrayList.add(sinif);
	}
	
	
	public void siniflariYazdir() {
		System.out.println("\n\n **********    "+ this.okulAdi+ "'ndaki sınıflar listesi: ********* \n");
		for (Sinif sinif : siniflarArrayList) {
			System.out.println("Sınıf adı: "+sinif.getSinifAdi()+"  Lokasyon: "+sinif.getLokasyon());
		}
	}
	
	
	public String getOkulAdi() {
		return okulAdi;
	}

	public void setOkulAdi(String okulAdi) {
		this.okulAdi = okulAdi;
	}

	public String getOkulAdresi() {
		return okulAdresi;
	}

	public void setOkulAdresi(String okulAdresi) {
		this.okulAdresi = okulAdresi;
	}

	public ArrayList<Sinif> getSiniflarArrayList() {
		return siniflarArrayList;
	}

	private void setSiniflarArrayList(ArrayList<Sinif> siniflarArrayList) { //set edilsin istemiyoruz o yüzden private yaptık
		this.siniflarArrayList = siniflarArrayList;
	}
	
	

}
