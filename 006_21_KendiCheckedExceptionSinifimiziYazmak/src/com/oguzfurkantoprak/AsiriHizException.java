package com.oguzfurkantoprak;

import java.io.IOException;

// checked exception sınıflarından birinden türeteceğiz
// Inheritance:
// Exception sınıfı => IOException Sınıfı(checked exception) => AsiriHizException sınıfı
// IOException Sınıf'ından türediği için checked'dir.
public class AsiriHizException extends IOException {

	//source => constructor from superclass:
	public AsiriHizException(String message) {
		super(message);
	}

	//source => Override/implement methods => printStackTrace // istediğimiz metodu buradan override edebiliriz üst sınıftan
	@Override
	public void printStackTrace() {
		System.out.println("Bu bir aşırı hız Checked Exception'dır. Yüksek hız tespit edildi.");
	}
	
	
	

	
	
	
}
