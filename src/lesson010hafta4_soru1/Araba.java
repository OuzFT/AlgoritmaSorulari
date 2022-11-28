package lesson010hafta4_soru1;

public class Araba {

	public String marka;
	public String model;
	public String renk;
	public String motorTipi;
	public String motorGucu;
	public String motorHacmi;
	public int uretimYili;
	public int yas;

	public static int arabaYasi(Araba araba) {

		return araba.yas = 2022 - araba.uretimYili;
	}

	
	// Mertin çözümü
	public int arabaYasi(int model) { // neden static değil bu?
		int guncelYil = 2022;
		return guncelYil - uretimYili;
	}

	public void arabaBilgileri(String[] araba) {
		for (String item : araba) {
			System.out.println(araba);
		}
	}

	public static void arabaBilgileri(Araba araba) {
		System.out.println("Marka: " + araba.marka);
		System.out.println("Model: " + araba.model);
		System.out.println("Renk: " + araba.renk);
		System.out.println("Üretim Yılı: " + araba.uretimYili);
		System.out.println("Yas: " + araba.yas);
		System.out.println("Motor hacmi: " + araba.motorHacmi);
		System.out.println("Motor tipi: " + araba.motorTipi);
		System.out.println("Motor gücü: " + araba.motorGucu);
	}

}
