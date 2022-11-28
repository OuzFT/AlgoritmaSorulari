package com.oguzfurkantoprak;

public class Muhendis extends Personel {

	private String uzmanlikAlani;

	public Muhendis() {
		super(); // üst sınıfın constructor'ıdır.
	}
	
	public String getUzmanlikAlani() {
		return uzmanlikAlani;
	}
	public void setUzmanlikAlani(String uzmanlikAlani) {
		this.uzmanlikAlani = uzmanlikAlani;
	}
	
	
}
