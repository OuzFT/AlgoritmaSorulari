package Homeworks;

import java.util.Scanner;

public class Odev2soru2 {

	public static void main(String[] args) {
		/*
		// Swtich case ile 
		//input --> mehmet
		//input--> hangisi işlemi yapmak istiyosunuz
		
		System.out.println("1- Kelimeleri Büyük Harf Yap");
	    System.out.println("2- kelimenin harflerini Küçük yap");
	    System.out.println("3- kelimenin harflerinin arasına ? koy");
	    //mehmet m?h?m?e?t
	    System.out.println("4- kelimenin başındaki ve sonundaki boşlukları silin");
	    //     mehmet   
	    System.out.println("5- kelimenin içindeki bütün a harflerini ? ile değiştirin");
	    //replace replaceAll("a", ?")
	    System.out.println("6- kelimenin ilk üç indexinin alıp sonuna ... koyun");
	    // mehmet
	    //meh...
	    //substring()
	    */
	    Scanner scanner = new Scanner (System.in);
		System.out.println("Bir kelime giriniz");
		String kelime = scanner.nextLine();
		
		System.out.println("Kelimede hangi işlemleri uygulamak istersiniz?");
		System.out.println("1- Kelimeleri Büyük Harf Yap");
		System.out.println("2- kelimenin harflerini Küçük yap");
		System.out.println("3- kelimenin harflerinin arasına ? koy");
		System.out.println("4- kelimenin başındaki ve sonundaki boşlukları silin");
		System.out.println("5- kelimenin içindeki bütün a harflerini ? ile değiştirin");
		System.out.println("6- kelimenin ilk üç indexinin alıp sonuna ... koyun");
		
		int secim = scanner.nextInt();
		
		switch(secim) {
		case 1:
			System.out.println(kelime.toUpperCase());
			break;
			
		case 2:	
			System.out.println(kelime.toLowerCase());
			break;
		
		case 3:
			for(int i=0;i<kelime.length();i++) {
				if(i<kelime.length()-1)
					System.out.print(kelime.charAt(i)+"?");
				else  										// i==kelime.length()-1 olması durumunda (sona ? koymamak için)
					System.out.print(kelime.charAt(i));		
			}
			break;
			
		case 4:
			System.out.println(kelime.trim());			
			break;
			
		case 5:
			System.out.println(kelime.replaceAll("a", "?"));
			break;
			
		case 6:
			System.out.println(kelime.substring(0,3) + "...");
		
		}

	}

}
