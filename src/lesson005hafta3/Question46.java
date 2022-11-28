package lesson005hafta3;

public class Question46 {

	public static void main(String[] args) {
		// dizi içerisinde 2 ve 4'ün kaç kere geçtiğini
		// hangisinin daha fazla olduğunu bulan program

		// --> 4 lerin sayısı daha fazla (.. adet)

		int[] array = { 1, 3, 4, 4, 4, 4, 2, 2, 9, 8, 8 };

		int ikiler = 0;
		int dortler = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 2) {
				ikiler++;
			} else if (array[i] == 4) {
				dortler++;
			}
		}
		if (ikiler > dortler) {
			System.out.println("2 ler 4lerden fazla, " + ikiler + " adet iki var");
		} else if (dortler > ikiler) {
			System.out.println("4 ler 2 lerden fazla, " + dortler + " adet dört var");
		} else {
			System.out.println("ikisi de eşit");
		}

	}

}