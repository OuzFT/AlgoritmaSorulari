package lesson009hafta3;

public class Question66 {
	
			//İkinci harfi a olanların ilk değeri ve sadece ilk 3 harfi büyük olarak yazdırılacak --> Çankırı --> ÇAN
			//ikinciHarfeGoreSorgulama metot, dönüş tipi yok, parametre almasına gerek yok
			//Mainde sadece metot çağırılacak
			
	static String[] iller = {"Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın",
            "Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum",
            "Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun",
            "Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
            "Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin",
            "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
            "Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
            "Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük",
            "Kilis", "Osmaniye", "Düzce" };
	
	
	public static void main(String[] args) {

		
		ikinciHarfeGoreSorgulama();
		
	}

	
	private static void ikinciHarfeGoreSorgulama() {
		
		for (int i = 0; i < iller.length; i++) {
//			if(iller[i].charAt(1) == 'a') {
//				System.out.println(iller[i] + "-->" + iller[i].substring(0,3).toUpperCase());
//			}
			
			if(iller[i].substring(1).startsWith("a")) {
				System.out.println(iller[i] + "-->" + iller[i].substring(0,3).toUpperCase());
			}
			
			
		}
		
		
	}
	
	
	
}