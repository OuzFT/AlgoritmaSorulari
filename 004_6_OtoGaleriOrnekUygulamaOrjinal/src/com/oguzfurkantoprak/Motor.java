package com.oguzfurkantoprak;

/*
    Nesne yönelimli programlamanın ilk prensibi kapsülleme (encapsulation) olarak adlandırılır.
     
    Bu özellik, kodun nesne kullanıcısından gereksiz uygulama ayrıntılarını saklar.
     
    Oluşturulan bir sınıf (class) içerisinde kullanıcının işlemlerini daha kolay gerçekleştirebilmesi
    için bazı işlemler birleştirilerek tek bir işlem gibi gösterilir. Bu birleştirme işlemine kapsülleme denir.

    Erişim belirteçleri (access modifier) sayesinde kapsülleme çok daha kolay yapılmaktadır.
    Erişim belirteçleri, oluşturulan sınıf veya sınıf içindeki elemanların erişim seviyelerini belirlemek için kullanılan 
    anahtar kelimeler grubuna verilen isimdir (public, private, protected).
     
    Metotlar ve değişkenler bir anahtar sözcük ile önceden bellirlenen sınırlar dahilinde kullanılabilir.
    Bu anahtar kelimeler şu şekilde sıralanabilir : public, private, protected.
*/


public class Motor {
	
	private int motorHacmi;
	private String saseNo;
	private int yakitTuketimi; // lt/100km

	
	
	// Constructor: Nesnelerin ilk oluşumu sırasında çağırılan metoda denir.
	//
	// Yazılımcı Class içinde hiçbir constructor tanımlamazsa Java o class için otomatik boş
	// bir constructor oluşturur.
	// Ancak :
	// Yazılımcı içine pherhangi bir/birden fazla parametre alan bir constructor tanımlarsa 
	// Java otomatik constructor oluşturmaz. Bu durumda boş constructor'a ihtiyaç duyarsanız sizin
	// manuel olarak boş constructor oluşturmanız gerekir.
	//
	
	
	public Motor(int motorHacmi, String saseNo, int yakitTuketimi) {						
		this.setMotorHacmi(motorHacmi);		
		this.setSaseNo(saseNo);
		this.yakitTuketimi = yakitTuketimi; // => this.setYakitTuketimi(yakitTuketimi);
	}
	

	public Motor() {
		
	}

	public void motorBilgileriniYazdir() {
		System.out.println("motorHAcmi:  " + this.motorHacmi + " saseNo: " + saseNo +  
				           " yakitTuk: " + this.yakitTuketimi);
	}
	
	
	public String getAllMotorBilgileri() {
		String s = " motorHAcmi:  " + this.motorHacmi + " saseNo: " + saseNo + " yakitTuk: " + this.yakitTuketimi;
		return s;
	}
	
	
	public void setMotorHacmi(int motorHacmi) {
		if (motorHacmi>=800 && motorHacmi<=10000) {
			this.motorHacmi = motorHacmi;	
		}
		else
		{
			System.out.println("motor hacmi 800-10000 dışında girdiğiniz için 800 olarak ayarlanmıştır!");
			this.motorHacmi = 800;	
		}				
	}
	
	public int getMotorHacmi() {
		return this.motorHacmi;
	}


	public String getSaseNo() {
		return saseNo;
	}


	private void setSaseNo(String saseNo) {
		if (saseNo.length() != 8) {
			System.out.println("Şase no 8 karakter olmalı");
			this.saseNo = "00000000";
		}
		else
			this.saseNo = saseNo;
	}


	public int getYakitTuketimi() {
		return yakitTuketimi;
	}


	public void setYakitTuketimi(int yakitTuketimi) {
		this.yakitTuketimi = yakitTuketimi;
	}
	
	
	
	
}
