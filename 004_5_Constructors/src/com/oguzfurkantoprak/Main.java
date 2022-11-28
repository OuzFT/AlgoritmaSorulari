package com.oguzfurkantoprak;

public class Main {

	public static void main(String[] args) {
		
		Motor motor = new Motor(); // boş constructor kullandı
		motor.setMotorHacmi(1400);
		//motor.setSaseNo("12345678"); //saseno setter'ını private yaptık o yüzden hata verir.
		motor.setYakitTuketimi(7);
		
		Motor motor2 = new Motor(1000);
		//motor2.setSaseNo("12345678");
		motor2.setYakitTuketimi(5);
		
		Motor motor3 = new Motor(-100,"qqqqqqqq" , 7); // parametreleri alan constructor kullandı.
		// constructorlar dönüş tipi olmayan metodlardır
		
		motor.motorBilgileriniYazdir();
		motor2.motorBilgileriniYazdir();
		motor3.motorBilgileriniYazdir();
		
		//motor3.setSaseNo("QQQQQQQW");
		motor3.motorBilgileriniYazdir();
		
		Motor m = new Motor();
		System.out.println(m.saseNo); // null yazdırır.
		
		//--------------
		
		Otomobil oto = new Otomobil();
		oto.setYil(2021);
		// System.out.println("yılı: "+ oto.getYil()+ " Motor.sase: "+ oto.getAracinMotoru().getSaseNo()); => hata alırız
																							//çünkü motor nesnesi bağlanmadı.
		
		System.out.println("yılı: "+ oto.getYil()+ " Aracın km: "+ oto.getAracinKm()+ " Markası: "+ oto.getMarka());
		//markayı null yazdırır!
		
		
		oto.aracinMotoru = motor3; // aracinMotoru field'ı public olunca böyle bağlardık
		oto.setAracinMotoru(motor3);//aracinMotoru field'ı private olsaydı böyle bağlardık
		
		//Örnek full constructor:
		//
		Otomobil oto2 = new Otomobil("Marcedes","CLS", 2020,80000, motor3); //motor3ü oto2'ye bağladık
		System.out.println("Yıl: "+ oto2.getYil() + " ... " + oto2.getAracinMotoru().getAllMotorBilgileri());
		//veya motor bilgilerini ayrı yazdırabiliriz..
		oto2.getAracinMotoru().motorBilgileriniYazdir();
	
		Otomobil oto3 = new Otomobil("Audi","Q3", 2021, 20000, new Motor(1400,"AE345678",9));
		//Otomobil constructor'ı Otomobil return eder. Motor constructor metodu ise Motor nesnesi return eder
		System.out.println("Yıl: "+ oto3.getYil() + " ... " + oto3.getAracinMotoru().getAllMotorBilgileri());
		
	}

}
