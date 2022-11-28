package com.oguzfurkantoprak;

public enum UcusTipi {
	
	//İçine değer yazarak enum oluşturacaksak constructor oluşturulmalıdır. hata verir.
	EKONOMIK(100,"eko uçuş"),
	OZEL(200,"ozel uçuş"),
	VIP(300,"vip uçuş");
	
	int tip;
	String metin;
	
	
	UcusTipi(int tip, String metin) {
		this.tip = tip;
		this.metin = metin;
	}
	
	public int getTip()
	{
		return tip;
	}
	
	public String getMetin()
	{
		return metin;
	}
	
}
