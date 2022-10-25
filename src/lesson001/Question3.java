package lesson001;

public class Question3 {

	public static void main(String[] args) {
		// verilen 2 sayıdan hangisinin büyük olduğunu bulan program

		int sayi1=11;
		int sayi2=12;
		
		if (sayi1 > sayi2) {
			System.out.println("en büyük sayı:" + sayi1);
	}
		else if (sayi1==sayi2) {
			
			System.out.println("sayılar eşittir");
		}
		else 
			System.out.println("en büyük sayı:" + sayi2);
 }
}