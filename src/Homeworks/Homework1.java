package Homeworks;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		//*************************************************
		//ODEV1-
		// Girilen kilo değerinin diğer gezegenlerdeki karşılığını hesaplayıp yazdır
		//1- Kilo değerini girdiğimizde bütün gezegenlerdeki değeri hesaplayıp yazdıran
		//Ağırlık= kütle*yerçekimi
		//örnek input--kilo girin -70 / output--ayda 80,marsta 95, saturnde 88.... vs
		//2- bu sefer hem kilo hem gezegen girdisi alıyoruz girilen gezegen değerine göre ekrana yazdırıyor
		//1-ay, 2-saturn.....
		//input--kg girin(75)
		//input--gezegen adı girin(mars)
		//output--marstaki kilonuz 85
		
		//ODEV2-
		//BMI hesaplama
		
		//ODEV3-
		//girilen 2 sayı ile 4 işlem yazdırma
		//*************************************************
		
		float gMerkur=3.7f;
		float gVenus=8.87f;
		float gDunya=9.81f;
		float gAy=1.62f;
		float gMars=3.77f;
		float gJupiter=23.3f;
		float gSaturn=9.2f;
		float gUranus=8.69f;
		float gNeptun=11f;
		float gPluton=0.06f;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Kütlenizi giriniz");
		float kutle = input.nextInt();
		
		//1.ödev 1.sorunun cozumu!
		System.out.println("Merkürde ağırlığınız: "+ (gMerkur*kutle)+" Newton");
		System.out.println("Venüste ağırlığınız: "+ (gVenus*kutle)+" Newton");
		System.out.println("Dünyada ağırlığınız: "+ (gDunya*kutle)+" Newton");
		System.out.println("Ayda ağırlığınız: "+ (gAy*kutle)+" Newton");
		System.out.println("Marsta ağırlığınız: "+ (gMars*kutle)+" Newton");
		System.out.println("Jüpiterde ağırlığınız: "+ (gJupiter*kutle)+" Newton");
		System.out.println("Uranüste ağırlığınız: "+ (gUranus*kutle)+" Newton");
		System.out.println("Neptünde ağırlığınız: "+ (gNeptun*kutle)+" Newton");
		System.out.println("Plütonda ağırlığınız: "+ (gPluton*kutle)+" Newton");
		
		//1.ödev 2.sorunun cozumu!
		System.out.println("************************************");
		System.out.println("Ağırlığınızı giriniz, size hangi gezegende olduğunuzu yazayım!");
		float agirlik = input.nextInt();
		if(agirlik/kutle==gMerkur)
			System.out.println("Merkür'desiniz.");
		else if(agirlik/kutle==gVenus)
			System.out.println("Venüs'tesiniz.");
		else if(agirlik/kutle==gDunya)
			System.out.println("Dünya'dasınız.");
		else if(agirlik/kutle==gAy)
			System.out.println("Ay'dasınız.");
		else if(agirlik/kutle==gMars)
			System.out.println("Mars'tasınız");
		else if(agirlik/kutle==gJupiter)
			System.out.println("Jupiter'desiniz.");
		else if(agirlik/kutle==gUranus)
			System.out.println("Uranüs'tesiniz.");
		else if(agirlik/kutle==gNeptun)
			System.out.println("Neptün'desiniz.");
		else if(1F*agirlik/kutle==gPluton)
			System.out.println("Plüton'dasınız.");
		else
			System.out.println("Bilinmeyen bir gezegendesiniz");

	}

}
