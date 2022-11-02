package com.oguzfurkantoprak;

public class SinifStaticDegiskenler {

	
	//bunlara sınıfların üye değişkenleri denir:
	public static final int dunyaninYaricapi = 6371; //km
	public static int x=5;
	
	public static void main(String[] args) {
		// Javada global değişken yoktur.
		//ancak her sınıfın üye değişkenleri vardır.
		//siz bunları public ve  static yaparsanıız  herkes bunları kullanabilir.
		//tıpkı global değişkenler gibidir ama adı global değişken değildir.
		
		SinifStaticDegiskenler.x++;
		
		System.out.println(SinifStaticDegiskenler.dunyaninYaricapi); // teamül: sınıfadı.değişkenadı

	}

}
