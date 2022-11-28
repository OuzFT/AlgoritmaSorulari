package com.oguzfurkantoprak;

import java.util.ArrayList;

public class Main {

	
	public static void kisaSureliUc (IUcabilir kus) {
		
		System.out.println("\n***********\n");
		kus.kanatCirp();
	}
	
	public static void belirtilenSureKadarUc(IUcabilir kus, int saniye) {
		System.out.println("\n***********\n");
		for (int i = 0; i < saniye; i++) {
			kus.kanatCirp();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 1 saniye delay koyar.
		}
	}
	
	
	public static void sevinmeHarreketiYap(IKuyruklu kuyrukluHayvan,int adet) {
		for (int i = 0; i < adet; i++) {
			kuyrukluHayvan.kuyrukSalla();			
		}
	}
	
	public static void main(String[] args) {
		
		IUcabilir beyazPacaliGuvercin = new Guvercin("Beyaz Paçalı", 1, 12);
		beyazPacaliGuvercin.gagala("yem");
		
		IUcabilir minikSerce = new Serce("Minik Serçe", 1, 8);
		minikSerce.gagala("yem");
		
		//Polymorphism with Interfaces:
		Main.kisaSureliUc(beyazPacaliGuvercin);
		Main.kisaSureliUc(minikSerce);
		
		Main.belirtilenSureKadarUc(beyazPacaliGuvercin, 2);
		Main.belirtilenSureKadarUc(minikSerce, 1);
		
		Kedi kedi = new Kedi("Waldo",4,24);
		kedi.nefesAl();
		
		
		//IKuyruklu interface ile işlemler:
		//
		IKuyruklu tekir = new Kedi("Tekir",3,30);
		//tekir.kuyrukSalla();
		Main.sevinmeHarreketiYap(tekir, 3);
		
		// Farklı bir sınıftan polymorphism kullanımı:
		System.out.println("\n\n--------------\n");
		HayvanBakicisi hayvanBakicisi = new HayvanBakicisi();
		hayvanBakicisi.hayvaniOynat(tekir);
		
		//IKuyruklu karabas = new Kopek("Karabaş",8,70);
		Kopek karabas = new Kopek("Karabaş",8,70); // böyle de tanımlasak olur yine çalışır. önemli olan hayvaniOynat metodunun IKuyruklu interfaceini implement eden bir nesne gööndermek şart 
//		hayvanBakicisi.hayvaniOynat(karabas);
		
		ArrayList<IKuyruklu> kuyrukluHayvanListesi = new ArrayList<IKuyruklu>();
		kuyrukluHayvanListesi.add(tekir);
		kuyrukluHayvanListesi.add(karabas);
		hayvanBakicisi.hayvanlariOynat(kuyrukluHayvanListesi);
		
		
	}

}
