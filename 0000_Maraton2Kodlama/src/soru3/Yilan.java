package soru3;

public class Yilan extends Surungen{

	public Yilan(String ad, int kilosu, int uzunlugu, boolean tehlikeliMi) {
		super(ad, kilosu, uzunlugu, tehlikeliMi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sesCikar() {
		System.out.println("Yilan ses çıkarıyor: tıssssss...");
		
	}

	@Override
	public void surun() {
		System.out.println("Yilan sürünüyor...");
		
	}

	@Override
	public void bilgileriGoster() {
		System.out.println(toString());
		
	}

	@Override
	public String toString() {
		return "Yilan [ad=" + ad + ", kilosu=" + kilosu + ", uzunlugu=" + uzunlugu + ", tehlikeliMi=" + tehlikeliMi
				+ "]";
	}
	
	

}
