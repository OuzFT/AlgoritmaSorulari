package com.oguzfurkantoprak;

public class Main {

	public static void main(String[] args) {
		
		Otomobil otomobil1 = new Otomobil();
		otomobil1.marka = "TOGG";
		otomobil1.model = "V1";
		otomobil1.aracinKm = 0;
		otomobil1.yil = 2022;
		
		Motor motor1 = new Motor();
		motor1.motorHacmi = 1500;
		motor1.saseNo = "QWF3435323";
		motor1.yakitTuketimi = 10;
		
		otomobil1.aracinMotoru = motor1; // nesne içinde nesne oluşturduk
										// otomobil1 nesnesinin aracinMoturu özelliğini/üyesini motor1 nesnesine bağladık.
										
		//otomobil1in bilgilerini yazdıralım.
		System.out.println(otomobil1.marka+ " " + otomobil1.model+ " "+ otomobil1.yil + "....");
		
		//motor1in bilgilerini yazdıralım.
		System.out.println("motor hacmi: saseNo: "+ motor1.motorHacmi +" : "+ motor1.saseNo + "....");
		System.out.println("motor hacmi: saseNo: "+ otomobil1.aracinMotoru.motorHacmi + otomobil1.aracinMotoru.saseNo + "....");
		
		System.out.println(motor1);// aşağıdaki satır ile aynı adreste
		System.out.println(otomobil1.aracinMotoru); // aracın motor nesnesi
		
		//2. otomobili üretelim:
		
		Otomobil otomobil2= new Otomobil();
		otomobil2.marka = "BMW";
		motor1 = new Motor();
		motor1.motorHacmi = 1400;
		motor1.saseNo = "GHE3431563";
		motor1.yakitTuketimi = 9;
		
		//----
		
		Motor motorTest;
		motorTest = otomobil1.aracinMotoru;
		System.out.println(motorTest.saseNo);
		motorTest = otomobil2.aracinMotoru;
		System.out.println(motorTest.saseNo);
		
		//-----
		
		System.out.println("-----------------------------");
		otomobil1.aracinMotoru.motorBilgileriniYazdir();
		otomobil2.aracinMotoru.motorBilgileriniYazdir();
		
		
		
		
		
	}

}
