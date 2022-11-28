package soru3;

public class Maymun extends MemeliHayvan {

	public Maymun(String ad, int kilosu, int uzunlugu, boolean tehlikeliMi) {
		super(ad, kilosu, uzunlugu, tehlikeliMi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sesCikar() {
		System.out.println("Maymun ses çıkarıyor: UH AH AH AHAH...");	
		
	}

	@Override
	public void yuru() {
		System.out.println("Maymun yürüyor...");
		
	}

	@Override
	public void bilgileriGoster() {
		System.out.println(toString());
		
	}

	@Override
	public String toString() {
		return "Maymun [ad=" + ad + ", kilosu=" + kilosu + ", uzunlugu=" + uzunlugu + ", tehlikeliMi=" + tehlikeliMi
				+ "]";
	}
	
	
	
}

