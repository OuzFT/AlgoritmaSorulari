package com.oguzfurkantoprak;

public class Ogrenci implements Comparable<Ogrenci> {

	private String ad;
	private int id;
	
	
	
	@Override
	public String toString() {
		return "Ogrenci [ad=" + ad + ", id=" + id + "]";
	}

	
	public Ogrenci(String ad, int id) {
		super();
		this.ad = ad;
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int compareTo(Ogrenci ogrenci) { // DİKKAT!!! Bunu yazarak compare edebiliriz. Comparable interface'ini implement edip compareTo mmetodunu override ediyoruz.
		//Şuanki ogrencimizle parametre olarak gelen ogrenci nesnesini karşılaştırmamız lazım.
		if(this.id < ogrenci.id) {  // ">" ,"<" yer değiştirirse statementlar içinde, sıralamayı ters yapar
			return -1;
		}
		else if (this.id > ogrenci.id) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	
	
	
}
