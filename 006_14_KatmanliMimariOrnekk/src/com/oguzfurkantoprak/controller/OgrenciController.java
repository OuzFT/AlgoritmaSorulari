package com.oguzfurkantoprak.controller;

import java.util.Scanner;

import com.oguzfurkantoprak.repository.OgrenciRepository;
import com.oguzfurkantoprak.repository.entity.Ogrenci;

public class OgrenciController {

	private OgrenciRepository ogrenciRepository;
	
	public OgrenciController() {
		this.ogrenciRepository = new OgrenciRepository();
	}
	
	
	public void ogrenciEkleme() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Eklenecek öğrencinin adını giriniz: ");
		String adi = scanner.nextLine();
		System.out.println("Eklenecek öğrencinin soyadını giriniz: ");
		String soyadi = scanner.nextLine();
		System.out.println("Eklenecek öğrencinin id'sini giriniz: ");
		int id = scanner.nextInt();
		Ogrenci ogr = new Ogrenci(adi, soyadi, id);
		
		this.ogrenciRepository.save(ogr); // OgrenciController sınıfında öğrenci kaydetme işlemini ogrenciRepository'deki save metodu aracılığıyla yapıyoruz.
		
	}
	
	public void ogrenciListesiniGoster() {
		System.out.println("*************************");
		System.out.println("**** ÖĞRENCİ LİSTESİ ****");
		System.out.println("*************************");
		
		for (Ogrenci ogr : this.ogrenciRepository.findAll()) {
			System.out.println(ogr);
		}
		
	}
	
	public void ogrenciSil() {
		System.out.println("Silinecek öğrencinin id'sini giriniz:");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		this.ogrenciRepository.delete(id);
	}
	
	public void ogrenciGuncelle() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Güncellenecek öğrencinin adını giriniz: ");
		String adi = scanner.nextLine();
		System.out.println("Güncellenecek öğrencinin soyadını giriniz: ");
		String soyadi = scanner.nextLine();
		System.out.println("Güncellenecek öğrencinin id'sini giriniz: ");
		int id = scanner.nextInt();
		Ogrenci ogr = new Ogrenci(adi, soyadi, id);
		
		this.ogrenciRepository.update(ogr);
	}
	
	public void ogrenciBul() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bilgilerini görmek istediğiniz öğrencinin id'sini giriniz: ");
		int id = scanner.nextInt();
		Ogrenci ogrenci = this.ogrenciRepository.findById(id);
		System.out.println("\n\nBilgilerini görmek istediğiniz öğrenci: ");
		System.out.println(ogrenci); //toString olduğu için yazdırır.
				
	}
	

}
