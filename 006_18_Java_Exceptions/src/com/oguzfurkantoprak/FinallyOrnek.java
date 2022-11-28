package com.oguzfurkantoprak;

public class FinallyOrnek {

	public static void main(String[] args) {
		// Exception alan ve finally çalışan bir örnek
		try {
			int x = 4 / 0;
		} catch (Exception e) {
			System.out.println("Exception alındı!");
		} finally { // finally bloğu catch bloklarından sonra yazılır ve try blok içinde hata olsa
					// da olmasa da finally içinde ne yazarsan yaz çalışır.
			System.out.println("Finally kod bloğu içine ne yazarsan yaz hep çalışır!..");
		}

		System.out.println("devam...");

		// Exception almayan ve finally çalışan bir örnek
		try {
			String s = "test";
			System.out.println(s.length());
		} catch (Exception e) {
			System.out.println("Exception aldık");
		} finally {
			System.out.println("Finally kod bloğu içine ne yazarsan yaz hep çalışır!..");
		}

		// ÖRNEK:
		// Exception alsın ancak exception'ı yakalamayalım.
		// Finally yine çalışır.
		System.out.println("**********");
//		try {
//			int x = 4 / 0;
//		} catch (NullPointerException e) { // NullPointerException catchine yakalanmaz çünkü hatamız ArithmeticException
//											// türünde
//			System.out.println("Exception alındı!");
//		} finally { // finally bloğu catch bloklarından sonra yazılır ve try blok içinde hata olsa
//					// da olmasa da finally içinde ne yazarsan yaz çalışır.
//			System.out.println("Finally kod bloğu içine ne yazarsan yaz hep çalışır!..");
//		}

		// ÖRNEK-2:
		System.out.println("**********");
		try {
			int x = 4 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Exception alındı!");
		} finally {
			System.out.println("Finally kod bloğu içine ne yazarsan yaz hep çalışır!..");
		}
		
		// Dosya kapama, veritabanı bağlantısı kapama, açık bir network socketini kapama gibi işlemler
		// genellikle finally kod bloğu içinde yapılır.
		// vuze torrent sadece java ile yazılmış

	}

}
