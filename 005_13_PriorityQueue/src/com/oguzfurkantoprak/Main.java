package com.oguzfurkantoprak;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		/*
		 add/ offer() metodları ---------> Kuyruğa eleman ekler. (Önceden gördüğümüz özellikleri taşırlar.) offer exception atmaz ekleyemezse, add atar
		 clear() ---------> Kuyruğu temizler.
		 contains(Obect o) --------->o objesi kuyruğun içindeyse true , değilse false döner.
		 peek() ---------> Kuyruğun başındaki elemanı döner. Eğer kuyruk boşsa null referans döner.
		 poll() ---------> Kuyruğun başındaki elemanı çıkartır ve değer olarak döner. 
		 Eğer kuyruk boşsa null referansı döner. remove() ise eleman yoksa exxception verir
		 size() ---------> Kuyruğun içindeki eleman sayısını döner.
		 
		 
		 Integer'larda en yüksek öncelik en küçük sayıda, en düşük öncelik en büyük sayıdadır.
		 Stringlerde en yüksek öncelik alfabetik olarak szlükte en önce gelen stringte,
		 en düşük öncelik alfabetik olarak sözlüklte en son gelen stringtedir.
		 First in first out / ilk giren ilk çıkar
		 */
		
		Queue<Integer> queue = new PriorityQueue<Integer>();
		
		queue.offer(5);
		queue.offer(1);
		queue.offer(2);
		queue.offer(155);
		
		System.out.println(queue.peek()); //Kuyruğun başındaki elemanı döner. İlk 5'i eklememize rağmen.
		System.out.println(queue.contains(102));
		System.out.println("\n-------");
		
		//NOT: Queue'nın içinde dönerken/dolaşırken foreach ile dolaşırsanız yanlış sıralama görülür.
		//Aşağıdaki gibi foreach döngüsüyle yazdırırsak sıralamasız yazdırır.
//		for (Integer integer : queue) {
//			System.out.println(integer);
//		}
		
		//Doğrusu:
		//Queue boş olana kadar baştaki elemanı teker teker çıkartarak yazdırırız.
		while(!queue.isEmpty()) {
			System.out.println("Eleman çıkarılıyor: " + queue.poll());
		}
		
		// İÇİNDE KENDİ SINIFLARIMIZ OLAN PRIORITY QUEUE YAPALIM:
		
		Queue<Ogrenci> queue2 = new PriorityQueue<Ogrenci>();
		queue2.offer(new Ogrenci("Ali",107));
		queue2.offer(new Ogrenci("Veli",105));
		queue2.offer(new Ogrenci("Zeynep",101));
		queue2.offer(new Ogrenci("Hasan",109));
		
		while (!queue2.isEmpty()) { // (queue2.isEmpty() == false) aynı şey
			System.out.println("Eleman çıkarılıyor: " + queue2.poll());
		}
		
	}

}
