package lesson003;

import java.util.Scanner;

public class Question32 {

	public static void main(String[] args) {
		// klavyeden girilen 0-100 arasındaki 5  sayıdan en büyük ve en küçük olanı yazdıran program
		// while kullan
		Scanner scan = new Scanner(System.in);

		int enKucuk = 101;
        int enBuyuk =-1;
        int i =0;
        while(i<5) {
            System.out.println("0 ile 100 arası bir sayı giriniz : ");
            int sayi = scan.nextInt();
            if(sayi>enBuyuk) {
                enBuyuk=sayi;
            }
            if(sayi<enKucuk){
                enKucuk=sayi;
            }    
            i++;
        }
        System.out.println("Max : "+enBuyuk+" Min : "+enKucuk);

	}

}
