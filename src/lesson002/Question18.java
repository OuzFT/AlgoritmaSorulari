package lesson002;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		// girilen sayının hangi beden olduğunu syleyen program
		/* small -29
		 * medium- 42
		 * large-44
		 * XL- 48
		 * default- belirsiz
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("29-42-44-48 sayılarından birini giriniz");		
		int n = input.nextInt();
		
		switch (n) {
		case 29:
			System.out.println("small");
			break;
		case 42:
			System.out.println("medium");
			break;
		case 44:
			System.out.println("large");
			break;	
		case 48:
			System.out.println("XL");
			break;	
			
		default:
			System.out.println("belirsiz beden girdiniz");
			break;
		}

	}

}
