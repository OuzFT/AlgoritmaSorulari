package lesson003;

import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {
        // girilen sayının kaçıncı basamakta 
        //hangi sayılar olduğunu veren program
        //1 ler basamağı x
        //10 lar basamağı y ...

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi=scanner.nextInt();
        
        int basamak;
        int i=1;
        
        while(sayi!=0) {
            basamak=sayi%10;
            sayi=sayi/10;
            System.out.println(i + " ler basamağı :" + basamak);
            i=i*10;

        }
 
    }
 
}