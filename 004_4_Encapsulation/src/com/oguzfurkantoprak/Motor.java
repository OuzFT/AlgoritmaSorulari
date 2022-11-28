package com.oguzfurkantoprak;

/*
Nesne yönelimli programlamanın ilk prensibi kapsülleme (encapsulation) olarak adlandırılır.

Bu özellik, kodun nesne kullanıcısından gereksiz uygulama ayrıntılarını saklar.

Oluşturulan bir sınıf (class) içerisinde kullanıcının işlemlerini daha kolay gerçekleştirebilmesi için 
bazı işlemler birleştirilerek tek bir işlem gibi gösterilir. Bu birleştirme işlemine kapsülleme denir.

Erişim belirteçleri (access modifier) sayesinde kapsülleme çok daha kolay yapılmaktadır.

Erişim belirteçleri, oluşturulan sınıf veya sınıf içindeki elemanların erişim seviyelerini belirlemek için kullanılan 
anahtar kelimeler grubuna verilen isimdir.(public, private, protected)

Metotlar ve değişkenler bir anahtar sözcük ile önceden bellirlenen sınırlar dahilinde kullanılabilir. 
Bu anahtar kelimeler şu şekilde sıralanabilir:(public, private, protected)
*/
public class Motor {

	private int motorHacmi;
	public String saseNo;
	public int yakitTuketimi;
	
	
	public void motorBilgileriniYazdir() {
		
		System.out.println("motor hacmi: saseNo: "+ this.motorHacmi + " : " + saseNo + "....");
		//aynı isimlerde input almadığı için this. yazmasak da olurdu.
	}
	
	
	public void setMotorHacmi(int motorHacmi) {
		if(motorHacmi>=800 && motorHacmi<=10000) {
		this.motorHacmi = motorHacmi;
		}
		else {
			System.out.println("motor hacmi 800-10000 dışında girdiğiniz için 800 olarak ayarlanmıştır.");
			this.motorHacmi = 800;// this yazmazsak ambiguity//belirsizlik oluyor.
		}
		
	}
	// sağ click source generate (getters setter):
	
	public int getMotorHacmi() {
		return this.motorHacmi;
	}


	public String getSaseNo() {
		return saseNo;
	}


	public void setSaseNo(String saseNo) {
		if(saseNo.length() != 8) {
			System.out.println("Şase no 8 karakter olmalı");
			this.saseNo = "00000000";
		}	
		this.saseNo = saseNo;
	}


	public int getYakitTuketimi() {
		return yakitTuketimi;
	}


	public void setYakitTuketimi(int yakitTuketimi) {
		this.yakitTuketimi = yakitTuketimi;
	}
	
	
	
}
