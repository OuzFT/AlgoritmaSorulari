package lesson010hafta4_oopProduct;

public class Main {

	public static void main(String[] args) {
		// id, price, stock, name olan bir product sınıf yazalım
		//id string tutulacak
		//bilgileri getir metodu ile yazdıralım
		//products arrayi oluşturalım:
		//oluşturduğumuz productları bu arrayin içine atalım. ve bu arrayi yazdıralım
		
		//farklı pakette bir sınıf oluşturcaz
		//o sınıfın içinde random id üreticez:
		//mainde id set edicez.
		
		Product product1 = new Product();
		
		//set metodları ile değerleri atayalım:
		product1.setName("Asus");
		product1.setProductId("112345");
		product1.setUnitStock(100);
		product1.setUnitPrice(3000);
		//
		//get metodu ile set edilen değerlere ulaşalım:
		System.out.println(product1.getName());
		//
		//Bilgileri yazdıralım:
		product1.bilgileriGetir();
		
		Product product2 = new Product();
		product2.setName("Apple");
		product2.setProductId("123567");
		product2.setUnitStock(50);
		product2.setUnitPrice(5000);
		//
		product2.bilgileriGetir();
		
		//array oluşturalım: " String[] array = new String[diziBoyutu]; " gibi bir array ama Product kullanıcaz
		Product[] products = new Product[2];
		//array üyelerine atama yapalım:
		products[0] = product1;
		products[1] = product2;
		
		//elle tek tek yazdıralım arrayi:
		System.out.println("-------------------");
		products[0].bilgileriGetir();
		products[1].bilgileriGetir();
		
		//for ile yazdıralım array'i:
		System.out.println("-------------------");
		for (int i = 0; i < products.length; i++) {
			products[i].bilgileriGetir();
		}
		
		//foreach ile yazdıralım array'i: ???????????? tekrar et!!!!
		System.out.println("-------------------");
		for (Product index : products) {
			System.out.println("For each: "+index.getName());
			
		}

		//sadece name yazdırmak istersek:
		System.out.println("-------------------");
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i].getName()); // product1.getname ve product2.getname yapar.
		}
		System.out.println("-------------------");
		
		
		//
		//GenerateRandomId classındaki metod ile random sayıyı alıp product id olarak set edelim: DİKKAT!!!!! ÖNEMLİ
		
		String x = lesson010hafta4_oopProductUtil.GenerateRandomId.RandomNumberGenerator(); 
		// paketismi.classismi.metodismi yazmalıyız farklı paketteki static bir metodu çağırmak için
		
		product1.setProductId(x);
		System.out.println("Product1 ID: "+ product1.getProductId());
		
		System.out.println("-------------------");
		//
		ProductManager.bilgileriGoster(product1); // metod static olduğu için direk sınıf üzerinden erişilebilir.
		
		System.out.println("-------------------");
		ProductManager.veriTabaninaKaydet(product2); // metod static olduğu için direk sınıf üzerinden erişilebilir.
		
		//DİKKAT!
		// ProductManager.sepeteEkle(product2); // metod static olmadığı için hata verir
		//Static olmayanlarıAşağıdaki gibi çağırabiliriz. ÖNEMLİ!!!!!!!
		ProductManager manager = new ProductManager(); // Burayı ekleriz
		manager.sepeteEkle(product2);
		//Çok static metod belleği şişirir. Her bir statik metod heap'te yer kaplar.
		//Non-Static kullanmamızın sebebi de heapte çok yer kaplamamak.
		
		System.out.println("Önceki isim "+product1.getName());
		manager.urunuGuncelle(product1, "HP");//urunuGuncelle metodu static olmasaydı böyle yapardık
		System.out.println("değişen isim "+product1.getName());
		ProductManager.urunuGuncelle(product1, "Casper"); // urunuGuncelle metodu static olsaydı böyle yapardık
		System.out.println("değişen isim "+product1.getName());
		
	}
	
}
