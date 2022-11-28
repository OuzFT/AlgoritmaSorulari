package soru2;

public class Main {

	public static void main(String[] args) {
		
		CustomStringTR customStr = new CustomStringTR("Merhaba benim adım Oğuz");
		
		System.out.println(customStr.uzunlukBul() + "");  
		System.out.println(customStr.trimle());
		System.out.println(customStr.harfleriBuyut());
		System.out.println(customStr.harfleriKucult());
		System.out.println(customStr.stringeCevir(331233)); // int'i stringe çevirir
		System.out.println(customStr.aVarMi());
		System.out.println(customStr.mIleBaslar());
		System.out.println(customStr.degistir());
		System.out.println(customStr.ilkKelime());
		System.out.println(customStr.zIleBiter());
		
	}

}
