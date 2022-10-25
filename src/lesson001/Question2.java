package lesson001;

public class Question2 {

	public static void main(String[] args) {
		// Verilen ürünün satış fiyatının içinde %18 kdv ve %15 kar olduğu biliniyor
		//verilen ürünn ham fiyatını bulan program
		//değişkan isimnleri --> camelCase
		//sınıf isimleri --> PascalCase
		
		int satisFiyati = 100;
		float vergisizFiyat = satisFiyati/ 1.18f;
		float hamFiyat = vergisizFiyat/ 1.15f;
		

				System.out.println("Ham Fiyat: "+ hamFiyat);

	}

}
