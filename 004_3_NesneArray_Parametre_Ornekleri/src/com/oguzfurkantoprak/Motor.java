package com.oguzfurkantoprak;

/*
Nesne yönelimli programlamanın ilk prensibi kapsülleme (encapsulation) olarak adlandırılır.

Bu özellik, dilin nesne kullanıcısından gereksiz uygulama ayrıntılarını saklar.

Oluşturulan bir sınıf (class) içerisinde kullanıcının işlemlerini daha kolay gerçekleştirebilmesi için 
bazı işlemler birleştirilerek tek bir işlem gibi gösterilir. Bu birleştirme işlemine kapsülleme denir.

Erişim belirteçleri (access modifier) sayesinde kapsülleme çok daha kolay yapılmaktadır.

Erişim belirteçleri, oluşturulan sınıf veya sınıf içindeki elemanların erişim seviyelerini belirlemek için kullanılan 
anahtar kelimeler grubuna verilen isimdir.(public, private, protected)

Metotlar ve değişkenler bir anahtar sözcük ile önceden bellirlenen sınırlar dahilinde kullanılabilir. 
Bu anahtar kelimeler şu şekilde sıralanabilir:(public, private, protected)
*/
public class Motor {

	public int motorHacmi;
	public String saseNo;
	public int yakitTuketimi;
	
	public void motorBilgileriniYazdir() {
		
		System.out.println("motor hacmi: saseNo: "+ this.motorHacmi + " : " + saseNo + "....");
	}
	
	
	
}
