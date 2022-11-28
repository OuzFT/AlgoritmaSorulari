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
	
	///////////////////////////////////
	//Constructor : Nesnelerin ilk oluşumu sırasında çağırılan metoda denir.
	//Yazılımcı Class içinde hiçbir Constructor tanımlamazsa java o class için otomatik boş bir constructor oluşturur.
	//Ancak:
	//Yazılımcı içine herhangi bir/birden fazla parametre alan bir constructor tanımlarsa,
	//Java otomatik constructor oluşturmaz. Bu durumda boş constructor'a ihtiyaç duyarsanız sizin
	//manuel olarak boş constructor oluşturmanız gerekir.
	
	//sağ click - source - generate constructor using fields tıklayalım:
	public Motor(int motorHacmi, String saseNo, int yakitTuketimi) { // constructor adıyla class adı aynı olmalıdır.
		//this.motorHacmi = motorHacmi;  //aşağıdaki satır gibi yaparsak parametre kontrolü de yaparız.
		this.setMotorHacmi(motorHacmi);
		this.saseNo = saseNo;
		this.yakitTuketimi = yakitTuketimi; // this.setYakitTuketimi(yakitTuketimi); aynı şey!
	}
	
	//parametre alan constructor tanımlayalım:
	public Motor(int motorHacmi) {
		this.motorHacmi = motorHacmi;
	}
	
	//boş constructor tanımlayalım:
	public Motor() {
		
	}
	
	
	////////////////////////////////////////////
	
	public void motorBilgileriniYazdir() {
		
		System.out.println("motor hacmi: "+ this.motorHacmi + "  saseNo: " + saseNo + "....");
		//aynı isimlerde input almadığı için this. yazmasak da olurdu.
	}
	
	public String getAllMotorBilgileri() {
		String s = " motor hacmi: "+ motorHacmi + "  saseNo: " + saseNo + "....";
		return s;
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


	private void setSaseNo(String saseNo) { // sase no setterı private yaptık kimse set edemesin diye.
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
