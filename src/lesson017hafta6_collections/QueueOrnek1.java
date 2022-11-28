package lesson017hafta6_collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOrnek1 {
	public static void main(String[] args) {

//		add/ offer() metodları ---------> Kuyruğa eleman ekler. (Önceden gördüğümüz özellikleri taşırlar.) offer exception atmaz ekleyemezse, add atar
//		 clear() ---------> Kuyruğu temizler.
//		 contains(Obect o) --------->o objesi kuyruğun içindeyse true , değilse false döner.
//		 peek() ---------> Kuyruğun başındaki elemanı döner. Eğer kuyruk boşsa null referans döner.
//		 poll() ---------> Kuyruğun başındaki elemanı çıkartır ve değer olarak döner. 
//		 Eğer kuyruk boşsa null referansı döner. remove() ise eleman yoksa exxception verir
//		 size() ---------> Kuyruğun içindeki eleman sayısını döner.
		Queue<String> kuyruk = new LinkedList<>(); // LinkedList ve PriorityQueue Queue interface'ini implement edebilir.
		kuyruk.offer("hasan");
		//kuyruk.offer("mert");
		//kuyruk.offer("mehmet");
		//kuyruk.offer("ahmet");
		
		// 
		//System.out.println(kuyruk.remove());
		//System.out.println(kuyruk.remove());
		
		System.out.println(kuyruk.poll());
		System.out.println(kuyruk.poll());
		
		/*
		System.out.println(kuyruk);
		while(!kuyruk.isEmpty()) {
			System.out.println(kuyruk.poll());
		}
		System.out.println(kuyruk);
		
		*/
		
		// İlk giren ilk çıkar (FIFO)
		//bitane String kuyruk oluşturalım
		//kuyrugun içine isimler atalım
		//kuyruktaki elemanları yazdıralım
		
		//kuyruk boşalana kadar elemanları çıkarıp çıkarılan elemanı yazdıralım
	}
}