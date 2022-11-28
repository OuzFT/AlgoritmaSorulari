package soru3;

public class Aslan extends MemeliHayvan {

	
	
	
	
	
	public Aslan(String ad, int kilosu, int uzunlugu, boolean tehlikeliMi) {
		super(ad, kilosu, uzunlugu, tehlikeliMi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sesCikar() {
		System.out.println("Aslan ses çıkarıyor: ROOOOAAAAARRRRRRR...");	
	}

	@Override
	public void yuru() {
		System.out.println("Aslan yürüyor...");
		
	}

	@Override
	public void bilgileriGoster() {
		System.out.println(toString());
		
	}

	@Override
	public String toString() {
		return "Aslan [ad=" + ad + ", kilosu=" + kilosu + ", uzunlugu=" + uzunlugu + ", tehlikeliMi=" + tehlikeliMi
				+ "]";
	}

}
