package soru3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class HayvanatBahcesi {

	private ArrayList<Hayvan> hayvanListesi;
	
	public void hayvanSesCikar(Hayvan hayvan) {
		hayvan.sesCikar();
	}
	public void hayvaninBilgileriniYazdir(String hayvanName) {
		Hayvan hayvan = getHayvanFromName (hayvanName);
		if(hayvan!=null)
			System.out.println(hayvan.toString());
		else
			System.out.println("Bu isimde bir hayvan yok");
	}
	
	
	private Hayvan getHayvanFromName(String hayvanName) {
		List<Hayvan> hayvanList = hayvanListesi.stream().filter(e -> e.ad == hayvanName).collect(Collectors.toList());
		if(hayvanList.size()>0)
			return hayvanList.get(0);
		else 
			return null;
	}
	
	public HayvanatBahcesi() {
		super();
		this.hayvanListesi = new ArrayList<Hayvan>();
	}
	
	public void bahceyeMemeliHayvanEkle(MemeliHayvan hayvan) {
		hayvanListesi.add(hayvan);
		System.out.println(hayvan.toString() + " "+ "bahçeye eklendi");
	}
	
	public void bahceyeSurungenEkle(Surungen hayvan) {
		hayvanListesi.add(hayvan);
		System.out.println(hayvan.toString() + " "+ "bahçeye eklendi");
	}
	
	public void bahceyeHayvanEkle(Hayvan hayvan) {
		if(hayvan instanceof MemeliHayvan) {
			bahceyeMemeliHayvanEkle((MemeliHayvan) hayvan);
		}
		else if(hayvan instanceof Surungen) {
			bahceyeSurungenEkle((Surungen) hayvan);
		}
		else 
			System.out.println("Hayvan tipi bulunamadı.");
		
	}

	public List<Hayvan> getSurungenHayvanListesi() {
		return hayvanListesi.stream().filter(e -> e.tip == HayvanTipi.SURUNGEN).collect(Collectors.toList());
	}

	public List<Hayvan> getMemeliHayvanListesi() {
		return hayvanListesi.stream().filter(e -> e.tip == HayvanTipi.MEMELI).collect(Collectors.toList());
	}

	
}
