package lesson001;

import java.util.Scanner;

public class Odev2 {

	public static void main(String[] args) {
		// boy(cm) ağırlık(kg) ve cinsiyet(erkek/kadın) girdisi al BMI hesapla -- BMI=agırlık*10000/(boy^2)
		//bu girdilere göre BMI'yi sınıflandır
		
		Scanner input = new Scanner(System.in);
		System.out.println("Kütlenizi giriniz");
		int agirlik = input.nextInt();
		System.out.println("Cinsiyetinizi giriniz(erkek için 1 /kadin için 2)");
		int cinsiyet = input.nextInt();
		System.out.println("Boyunuzu giriniz");
		int boy = input.nextInt();
		
		float BMI= agirlik*10000/(boy*boy);
		System.out.println("BMI= "+BMI);

		if(cinsiyet==1) {
			if(BMI >30) {
				System.out.println("Obezsiniz.");
			}
			else if(BMI>25) {
				System.out.println("Şişmansınız.");
			}
			else if(BMI>19) {
				System.out.println("Normalsiniz.");
			}
			else {
				System.out.println("Zayıfsınız.");
			}	
		}
		if(cinsiyet==2) {
			if (BMI >30) {
				System.out.println("Obezsiniz.");
			}
			else if(BMI>24) {
				System.out.println("Şişmansınız.");
			}
			else if(BMI>18) {
				System.out.println("Normalsiniz.");
			}
			else {
				System.out.println("Zayıfsınız.");
			}		
		}
				
	}

}
