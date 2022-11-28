package com.oguzfurkantoprak.repository;

import java.util.List;

import com.oguzfurkantoprak.repository.entity.Ogretmen;
import com.oguzfurkantoprak.utility.DataBase;

public class OgretmenRepository {

	public void save(Ogretmen ogretmen)  {
		DataBase.ogretmenListesi.add(ogretmen);
	}
	
	public void update(Ogretmen ogretmen)  {
		for (int i = 0; i < DataBase.ogretmenListesi.size(); i++) {
			if (DataBase.ogretmenListesi.get(i).getTcKimlikNo() == ogretmen.getTcKimlikNo())
			{
				DataBase.ogretmenListesi.get(i).setAd(ogretmen.getAd());
				DataBase.ogretmenListesi.get(i).setSoyad(ogretmen.getSoyad());
			}	
		}
	}
	
	public void delete(int tcKimlikNo)  {
		Ogretmen silinecekOgretmen = null;
		for (Ogretmen ogr : DataBase.ogretmenListesi) {
			if (ogr.getTcKimlikNo() == tcKimlikNo)
			{	
				silinecekOgretmen = ogr;	
				break;
			}	
		}
		if(silinecekOgretmen != null) {
			DataBase.ogretmenListesi.remove(silinecekOgretmen);
		}
	}
	
	public List<Ogretmen> findAll()  {
		return DataBase.ogretmenListesi;
	}
	
	public Ogretmen findById(int tcKimlikNo)  {
		Ogretmen tempOgretmen = null;
		for (Ogretmen ogr : DataBase.ogretmenListesi) {
			if(ogr.getTcKimlikNo() == tcKimlikNo)
			{
				tempOgretmen = ogr;
				break;
			}	
		}
		return tempOgretmen;
	}
	
}
