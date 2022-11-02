package Homeworks;

public class Hafta_3_Odev_1_2 {

	public static void main(String[] args) {
		// Odev2

		// bir dizide 13 var ise 13 ve bir sonraki
		// elemanı toplama eklenmeden toplam souncu bulan program
		// Deadline Çarşamba 13:30

		int nums[] = { 1, 13, 13, 13, 2, 5, 13, 1 };
		int toplam = 0;
		boolean addNext = true;
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			if (num != 13 && addNext) {
				toplam += num;
			} else if (num == 13) {
				addNext = false;
			} else {
				addNext = true;
			}
		}
		System.out.println("Toplam : " + toplam);

	}

}
