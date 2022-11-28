package com.alikaya;

public class ParalelKenar {

	//member variables (üye değişkenler)
	// public: Tüm paketlerden erişilebilir ve kullanılabilir.
	// private : Sadece bulunduğu sınıf /program içinmden erişilebilir.
	// protected: Sadece aynı paketteki sınıflardan erişim olabilir, farklı paketlerden erişilemez.
	// default(hiçbir şey yazmazsak): protected gibi davranır.
	
	public int kenarKisa; // public yazmazsam paket içine açık olur ama farklı paketlerde görünmez(default olarak protected olduğu için)
	public int kenarUzun;
	
	// private metodlara aynı paket içindeki sınıflar dahi erişemez:
	private String isim;
	
	
	public static void main(String[] args) {
		// oluşturulan nesneler heap'te tutulur. İlkel veri tipleri ise stack'te tutulur. Bunlar Ram'dedir.
		ParalelKenar p = new ParalelKenar();
		p.kenarKisa = 2;
		p.kenarUzun = 3;
		p.isim = "paralelKenar I";
		
	}
	
	
}
