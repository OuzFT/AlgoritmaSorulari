package com.oguzfurkantoprak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainOgrenciLise {

	public static void main(String[] args) {
		List<OgrenciLise> ogrencilerLise = new ArrayList<OgrenciLise>();
		
		ogrencilerLise.add(new OgrenciLise("Ayşe",1345,80));
		ogrencilerLise.add(new OgrenciLise("Metehan",900, 90));
		ogrencilerLise.add(new OgrenciLise("İrfan",1870,60));

		System.out.println(ogrencilerLise);
		
		//Listeyi not ortalamasına göre sort edelim.
		Collections.sort(ogrencilerLise);
		System.out.println(ogrencilerLise);
		
	}

}
