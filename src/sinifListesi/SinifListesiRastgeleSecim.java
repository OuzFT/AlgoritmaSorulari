package sinifListesi;

import java.util.Random;

public class SinifListesiRastgeleSecim {

	
	public static void main(String[] args) {
		// sınıf listesinden rastgele seçim yapan metod yaz:

		String[] sinif = {
                "İrfan Mert Namsal",
                "Oguz Furkan TOPRAK",
                "Fatih Çetin",
                "Melihcan ÖZTÜRK",
                "MUSTAFA CAN MAVİLİ",
                "Oğuz TAŞGIN",
                "Buse Çankaya",
                "Sevcan Aslan",
                "Metehan Ölçer",
                "Merve Adler",
                "Mert Taser",
                "Abdulkadir Dilmen",
                "Muhamed Furkan Türkmen",
                "Furkan Çitilci",
                "Ali Öğütçen"
        };
		
		Random random = new Random(); // Random tipinde random nesnesi oluşturduk // Random() ile constructor çağırılıyor
		int sayi = random.nextInt(sinif.length);
		
		System.out.println("Şanslı kişi: "+ sinif[sayi]);

	}

}
