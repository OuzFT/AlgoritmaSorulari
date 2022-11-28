package lesson010hafta4_oopProduct;

public class ProductManager {

	//İş kodları:
	public static void bilgileriGoster(Product product) { //Statik metod!
		//product.bilgileriGetir();
		//veya uzun uzun yazalım:
		System.out.println("Name: "+ product.getName() + 
				" /ID: "+ product.getProductId()+ 
				" /Price: "+ product.getUnitPrice()+
				" /Stok: "+product.getUnitStock());
	
	}
	
	//Veri tabanına kaydet
	//asus veritabanına kaydedildi consola çıktı versin:
	
	//iş kodları:
	public static void veriTabaninaKaydet(Product product) {
		System.out.println(product.getName()+ " Veri tabanına kaydedildi.");
	}
	
	//sepeteEkle()
	//asus sepete eklendi diye consola çıktı versin
	public void sepeteEkle(Product product) {
		System.out.println(product.getName()+ " Sepete Eklendi.");
	}
	
			//ÖDEV!!!!
			//ürün ismini güncelle metodu yaz main'de çağır // urunuGuncelle(product2, "Hp");
			// Apple --> applem2
	public static void urunuGuncelle(Product product, String yeniIsim) {
		product.setName(yeniIsim);
	}
}
