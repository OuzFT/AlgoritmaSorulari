package lesson001;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// girilen vize ve final notlarından öğrencinin geçip geçmememe durumunu sorgulayan program	
		//vize %40 final %60
		// 50 geçer not

		
		Scanner Input = new Scanner(System.in);
		System.out.println("vize notu giriniz: ");
		float vizeNotu = Input.nextFloat();
		
		System.out.println("final notu giriniz: ");
		float finalNotu = Input.nextFloat();
		
		float ortalama = vizeNotu * 0.4f + finalNotu * 0.6f;
		
		System.out.println("ortalama notunuz: "+ ortalama);
		
		if (ortalama>=50) {
			System.out.println("dersi geçtiniz");	
		}
		else
			System.out.println("kaldınız");
	}

}
