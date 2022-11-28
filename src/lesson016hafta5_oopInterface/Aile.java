package lesson016hafta5_oopInterface;

public class Aile extends User {

	private String anneAdi;
	private String babaAdi;
	private String cocukAdi;
	

	public Aile(String soyad, String anneString, String babaAdi, String cocukAdi) {
		super(soyad);
		this.anneAdi = anneString;
		this.babaAdi = babaAdi;
		this.cocukAdi = cocukAdi;

	}


	public String getAnneAdi() {
		return anneAdi;
	}

	public void setAnneAdi(String anneAdi) {
		this.anneAdi = anneAdi;
	}

	public String getBabaAdi() {
		return babaAdi;
	}

	public void setBabaAdi(String babaAdi) {
		this.babaAdi = babaAdi;
	}

	public String getCocukAdi() {
		return cocukAdi;
	}

	public void setCocukAdi(String cocukAdi) {
		this.cocukAdi = cocukAdi;
	}

}