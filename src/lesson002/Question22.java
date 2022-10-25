package lesson002;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		// girilen sayıya kadar çift olanları yazdıran program
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayı giriniz");		
		int n = input.nextInt();
		
		for(int i=1;i<=n;i++)  {
			if(i%2==0)
				System.out.println(i);	
		}		
	}

}
