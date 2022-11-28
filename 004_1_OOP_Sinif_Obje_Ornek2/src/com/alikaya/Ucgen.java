package com.alikaya;

public class Ucgen {

	public int kenar1;
	public int kenar2;
	public int kenar3;
	
	public int ucgenCevresi() {
		return (kenar1+kenar2+kenar3);
	}
	
	//Alinin kendi paketleri içinden erişilebilen bir üye metod. Statik olmadığı için nesneye özgü
	//Üçgenin tüm kenarlarını uzatmaMiktarı kadar uzatıyor:
	protected void kenarlariUzat(int uzatmaMiktari) {
		kenar1 += uzatmaMiktari;
		kenar2 += uzatmaMiktari;
		kenar3 += uzatmaMiktari;
	}
	
}
