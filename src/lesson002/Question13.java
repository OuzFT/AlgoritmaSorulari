package lesson002;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		// telefon ve maile bir kod gelecek
		//kullanıcıdan bu kodları alcaz
		//bunkları kıyaslayıp ikisi de uyumluysa kaydoldunuz
		//tel kodu doğru email kodu yanlışsa--- email kodu yanlış /vice versa
		//ikisi de yanlışsa kodları yanlış girdiniz yazdır.
		// int mailKod = 555;
		// int telKod= 321;

		int mailKod = 555;
		int telKod= 321;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Email kodunu giriniz");
		int sayi1 = input.nextInt();
		
		System.out.println("Telefon kodunu giriniz");
		int sayi2 = input.nextInt();
		
		if (sayi1==mailKod && sayi2==telKod) 
			System.out.println("kaydoldunuz");
		
		else if (sayi1!=mailKod && sayi2==telKod)
			System.out.println("e-mail kodu hatalı");
		
		else if (sayi1==mailKod && sayi2!=telKod)
			System.out.println("tel kodu hatalı");
		
		else
			System.out.println("2 kod da hatalı");
	}
		
		
	}

