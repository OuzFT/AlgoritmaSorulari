package com.oguzfurkantoprak;

public class Otomobil {
	
	//Otomobil sınıfından türetilecek her bir nesnenin sahib olacağı ortak nitelikler
	public String marka;
	public String model;
	public int yil;
	public int motorHacmi;
	public int aracinKm;
	
	//nesneye yönelik static olmayan metodlar aşağıda:
	public void bilgileriEkranaYaz() {
		System.out.println("Marka: " + marka + " \nModel: " + model + "\nYil:" + yil + "\nMotor Hacmi: "+ motorHacmi + " \nKM: "+ aracinKm);
	}
	
	
	public void araciSur(int km) {
		aracinKm = aracinKm + km;
	}
	
	
	
	public static void main(String[] args) {
		
		//Otomobil sınıfından üretilmiş 1. nesne: 
		Otomobil otomobil1 = new Otomobil();
		otomobil1.marka = "Audi";
		otomobil1.model = "A3";
		otomobil1.yil = 2011;
		otomobil1.motorHacmi = 1400;
		otomobil1.aracinKm = 0;
		
		otomobil1.bilgileriEkranaYaz();
		
		System.out.println();
		
		Otomobil otomobil2 = new Otomobil();
		otomobil2.marka = "Ford";
		otomobil2.model = "Fiesta";
		otomobil2.yil = 2016;
		otomobil2.motorHacmi = 1400;
		otomobil2.aracinKm = 12000;
		otomobil2.bilgileriEkranaYaz();
		
		//Gelin otomobilleri kullanalım/sürelim:
		otomobil1.aracinKm = 20;
		otomobil2.aracinKm = 12030;
		System.out.println();
		otomobil1.bilgileriEkranaYaz();
		otomobil2.bilgileriEkranaYaz();
		
		System.out.println();
		otomobil2.araciSur(20);
		otomobil2.bilgileriEkranaYaz();
		
	}

}
