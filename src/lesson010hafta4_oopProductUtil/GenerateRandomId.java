package lesson010hafta4_oopProductUtil;

import java.util.Random;

public class GenerateRandomId {

	
	
	public static String RandomNumberGenerator() {
		Random random = new Random();
		int randomSayi =  random.nextInt(100);
		String randomSayiStr = String.valueOf(randomSayi);
		return randomSayiStr;
	}
	
}
