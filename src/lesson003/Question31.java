package lesson003;

import java.util.Scanner;

public class Question31 {

	public static void main(String[] args) {
		// girilen sayının mükemmel sayı olup olmadığını bulan program
		// 6=1+2+3 mük sayıdır
		//28
		/* çözüm1:
		Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");
        int sayi = scan.nextInt();
        int toplam =0;
        for(int i =1;i<sayi;i++) {
            if(sayi % i ==0) {
                toplam +=i;
            }
            else {
                
            }
        }
        System.out.println(toplam);
        if(toplam ==sayi) {
            System.out.println(sayi+" mükemmel sayıdır");
        }
        else {
            System.out.println(sayi+" mükemmel sayı değildir.");
        }
        */
		
		 Scanner scanner = new Scanner(System.in);



	       System.out.print("Bir sayı giriniz= ");
	        int sayi = scanner.nextInt();
	        
	        int toplam = 0;
	        int k = 1;
	        
	        while (k<sayi) {
	            if(sayi % k ==0) {
	                toplam = toplam + k;
	                k++;
	            } else {
	                k++;
	            }
	        }
	                if (sayi == toplam) {
	                    System.out.println("Mükemmel sayıdır.");
	                }else {
	                    System.out.println("Mükemmel sayı değildir.");
	                }
	                         	                
	}

}
