package lesson010hafta4_oopPizza;

public class Main {

	public static void main(String[] args) {
		// Pizza sipariş uygulaması 
		//attribute'ler price ve vejeteryan mı normal mi?
		//pizza vejejtaryen mi normal mi
		// vej ise fiyat 300 tl normal ise 200tl constructorda belirlicez
		
		//metodlar:
		//sos ekle metodu: 50 tl;
		//peynir ekle: 100 tl
		//eve sipariş ver: 20 tl
		//fiş al: toplam pizza fiyatını gösterecek
		//sos çıkar:
		//peynir çıkar:
		//pizzalar diye array oluştur
		//oluşturduğumuz pizza nesnelerini bu arrayin içine atıcaz.
		//arrayde 400 tlden fazla olan pizzaları konsola bastırcaz
		
		Pizza pizza1 = new Pizza(true);
		Pizza pizza2 = new Pizza(true);
		Pizza pizza3 = new Pizza(false);
		Pizza pizza4 = new Pizza(false);
		//System.out.println(pizza1.getPrice());
		
		Pizza[] pizzalar = new Pizza[4];
		pizzalar[0] = pizza1;
		pizzalar[1] = pizza2;
		pizzalar[2] = pizza3;
		pizzalar[3] = pizza4;
		
//		pizza1.sosEkle();
//		pizza1.peynirEkle();
//		pizza1.eveSiparis();
//		pizza1.fisAl();
		//
		
		//farklı classta açtığımız metodları çağırmak için o classtan nesne oluşturmalıyız
		PizzaTercihleri pizzaTercihleri = new PizzaTercihleri();
		pizzaTercihleri.peynirEkle2(pizza1);
		pizzaTercihleri.peynirEkle2(pizza1);
		pizzaTercihleri.sosEkle2(pizza1);
		pizzaTercihleri.sosEkle2(pizza1);
		pizzaTercihleri.fisAl2(pizza1);
		
		// bu metodlar static olsaydı direk classadı.metod adı şeklinde çağırabilirdik.
		
		for (int i = 0; i < pizzalar.length; i++) {
			if(pizzalar[i].getPrice() > 400) {
				System.out.println("bu pizzanın fiyatı "+ pizzalar[i].getPrice());
			}
		}
		
	}

}
