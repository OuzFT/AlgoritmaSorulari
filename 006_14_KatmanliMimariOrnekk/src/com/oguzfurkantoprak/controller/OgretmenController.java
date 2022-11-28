package com.oguzfurkantoprak.controller;

import java.util.Scanner;

import com.oguzfurkantoprak.repository.OgrenciRepository;
import com.oguzfurkantoprak.repository.OgretmenRepository;
import com.oguzfurkantoprak.repository.entity.Ogrenci;
import com.oguzfurkantoprak.repository.entity.Ogretmen;

public class OgretmenController {

private OgretmenRepository ogretmenRepository;
	
	public OgretmenController() {
		this.ogretmenRepository = new OgretmenRepository();
	}
	
	
	public void ogretmenEkleme() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Eklenecek öğretmenin adını giriniz: ");
		String adi = scanner.nextLine();
		System.out.println("Eklenecek öğretmenin soyadını giriniz: ");
		String soyadi = scanner.nextLine();
		System.out.println("Eklenecek öğretmenin id'sini giriniz: ");
		int tcKimlikNo = scanner.nextInt();
		Ogretmen ogr = new Ogretmen(adi, soyadi, tcKimlikNo);
		
		this.ogretmenRepository.save(ogr); // OgrenciController sınıfında öğrenci kaydetme işlemini ogrenciRepository'deki save metodu aracılığıyla yapıyoruz.
		
	}
	
	public void ogretmenListesiniGoster() {
		System.out.println("*************************");
		System.out.println("*** ÖĞRETMEN LİSTESİ ****");
		System.out.println("*************************");
		
		for (Ogretmen ogr : this.ogretmenRepository.findAll()) {
			System.out.println(ogr);
		}
		
	}
	
	public void ogretmenSil() {
		System.out.println("Silinecek öğretmenin id'sini giriniz:");
		Scanner scanner = new Scanner(System.in);
		int tcKimlikNo = scanner.nextInt();
		this.ogretmenRepository.delete(tcKimlikNo);
	}
	
	public void ogretmenGuncelle() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Güncellenecek öğretmenin adını giriniz: ");
		String adi = scanner.nextLine();
		System.out.println("Güncellenecek öğretmenin soyadını giriniz: ");
		String soyadi = scanner.nextLine();
		System.out.println("Güncellenecek öğretmenin TC'sini giriniz: ");
		int id = scanner.nextInt();
		Ogretmen ogr = new Ogretmen(adi, soyadi, id);
		
		this.ogretmenRepository.update(ogr);
	}
	
	public void ogretmenBul() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bilgilerini görmek istediğiniz öğretmenin id'sini giriniz: ");
		int id = scanner.nextInt();
		Ogretmen ogretmen = this.ogretmenRepository.findById(id);
		System.out.println("\n\nBilgilerini görmek istediğiniz öğretmen: ");
		System.out.println(ogretmen); //toString olduğu için yazdırır.
				
	}
	
}
