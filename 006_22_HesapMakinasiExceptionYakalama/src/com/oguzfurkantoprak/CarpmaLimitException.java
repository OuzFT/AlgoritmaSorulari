package com.oguzfurkantoprak;

public class CarpmaLimitException extends Exception{

	//source => Override/implement methods => printStackTrace // istediğimiz metodu buradan override edebiliriz üst sınıftan
	@Override
	public void printStackTrace() {
		System.out.println("2 sayı da çok büyük, lütfen daha küçük sayılar giriniz!!");
	}

	// constructor atamayalım bıu sefer kendi parametresiz default constructorı çağırılır.
	
}
