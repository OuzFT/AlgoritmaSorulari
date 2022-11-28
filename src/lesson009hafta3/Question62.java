package lesson009hafta3;

import java.util.Scanner;

public class Question62 {

	//kullanıcının girdiği sayıların asal olup olmadığına bakacağız
	//asalMi metodu oluştur. içerisinde int tipi parammetre al.
	//Metodun dönüş tipi olmayacak void
	//Sayı kullanıcıdan alınacak

	
	
	public static void asalMi(int x) {
		int asalDegil=0;
		for(int i =2; i<x; i++) {
			if(x%i==0)
				asalDegil=1;
		}
		if(asalDegil==1)
			System.out.println("Asal değildir.");
		if(asalDegil==0)
			System.out.println("Asal sayıdır.");
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Sayı giriniz: ");
		int n = input.nextInt();
		asalMi(n);
	
	}

}
