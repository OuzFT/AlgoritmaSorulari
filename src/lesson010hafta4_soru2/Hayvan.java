package lesson010hafta4_soru2;

public class Hayvan {
	
	public String ad;
	public String tur;
	public String familya;
	public int ayakSayisi;

	private String tuyRengi = "Turuncu"; //bu turuncu olcak diyoruz değişmeyecekse bu aslanın tüy rengi hep turuncudur.
											//private bi değişkene ulaşamıyorsak bile (ki ılaşmak için yöntemler var)
											//kimse erişmesin kimse kafasına göre kullanmasın dersek başlangıç değeri belirleyebiliriz.

	
	public void bilgileriGoster() {
			System.out.println("Ad: " + ad + " Tür: " + tur + " Tüy Rengi: " + tuyRengi);
		}
	
}