package com.oguzfurkantoprak;

// Unchecked exception sınıflarından birinden türeteceğiz
// Inheritance:
// Exception sınıfı => Runtime Exception Sınıfı(unchecked exception) => ArithmeticException sınıfı (unchecked exception) => AsiriHizException sınıfı
// ArithmeticException'dan türediği için unchecked'dir.
public class AsiriHizException extends ArithmeticException {
	
	//source => constructor from superclass:
	public AsiriHizException(String message) {
		super(message);
	}

	//source => Override/implement methods => printStackTrace // istediğimiz metodu bununla override edebiliriz üst sınıftan
	@Override
	public void printStackTrace() {
		System.out.println("Bu bir aşırı hız Unchecked Exception'dır. Yüksek hız tespit edildi.");
	}

	
	
	
}
