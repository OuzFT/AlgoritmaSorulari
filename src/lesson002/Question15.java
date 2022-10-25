package lesson002;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		// 1den girilen sayıya kadar  olan sayıları yazdır sonra toplamını yazdır
		
		Scanner input = new Scanner(System.in);
		System.out.println("sayı giriniz");		
		int n = input.nextInt();
		int toplam=0;
		for(int i=1;i<=n;i++) {
			System.out.println("sayı: "+ i);
			toplam=toplam+i;
						
		}
			
		System.out.println("toplam: "+ toplam);

	}

}
