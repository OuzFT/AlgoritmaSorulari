package lesson010hafta4_soru2;

public class Main {

//	Javadaki erişim belirleyiciler nelerdir ve nasıl kullanılırlar?
//			-private, public, protected, default
//			
//			private --> Yalnızca aynı class içerisindeki özelliklere ulaşılabilir. Sınıflar private olmaz
//			public --> Aynı proje içerisindeki her yerden erişim
//			protected --> Aynı paket içerisindeki classlardan erişilebilir.
//			default --> Aynı paket içerisindeki classlardan erişilebilir.
			// normal class'lar sadece  public veya default olabilir.
	
	
//			hayvan sınıfı => adı, türü, familyası, ayak sayısı, tüy rengi özellikleri olsun.
//			--> ad herkes ulaşabilsin
//			--> tür yalnızca kendi familyası ulaşabilsin
//			--> familyasına herkes ulaşabilsin
//			--> ayakSayisi herkes ulaşabilsin
//			--> tüyRengini sadece hayvan ulaşabilsin
//			
//			bilgileriGoster --> hayvanlara ait bilgiler

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hayvan hayvan1 = new Hayvan();
		
		hayvan1.ad = "Aslan";
		hayvan1.tur = "Kedigiller";
		
		hayvan1.bilgileriGoster(); //tüy rengi null geliyor private olduğu için

	}

}
