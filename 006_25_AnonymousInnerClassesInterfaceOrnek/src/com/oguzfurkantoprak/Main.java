package com.oguzfurkantoprak;

// Anonymous innerclasslar Interface'ler kullanarak da oluşturulabilir.

public class Main {

	public static void main(String[] args) {
		
		// Interface'den anonymous innerclass oluşturalım
		// Normalde Interface'lerden nesne oluşturulamaz ama bu şekilde olur.
		IUcabilir ucanKaz = new IUcabilir() {
			
			@Override
			public void uc() {
				System.out.println("KEz uçuyor - saniyede 3 kez kanat çırpıyor...");
				
			}
		};

		
		
	}

}
