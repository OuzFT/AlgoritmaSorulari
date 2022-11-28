package soru3;

public class Kertenkele extends Surungen{

	public Kertenkele(String ad, int kilosu, int uzunlugu, boolean tehlikeliMi) {
		super(ad, kilosu, uzunlugu, tehlikeliMi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sesCikar() {
		System.out.println("Kertenkele ses çıkarıyor: ......");
		
	}

	@Override
	public void surun() {
		System.out.println("Kertenkele sürünüyor...");
		
	}

	@Override
	public void bilgileriGoster() {
		System.out.println(toString());
		
	}

	@Override
	public String toString() {
		return "Kertenkele [ad=" + ad + ", kilosu=" + kilosu + ", uzunlugu=" + uzunlugu + ", tehlikeliMi=" + tehlikeliMi
				+ "]";
	}
	
	
	
}
