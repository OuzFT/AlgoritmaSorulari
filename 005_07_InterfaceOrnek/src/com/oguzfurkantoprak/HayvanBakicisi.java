package com.oguzfurkantoprak;

import java.util.ArrayList;

public class HayvanBakicisi {
	
	public void hayvaniOynat (IKuyruklu kuyrukluHayvvan) {
		// IKuyruklu interfaceini implement eden tüm sınıflar için kullanılabilir bu metod
		System.out.println("Hayvan bakıcısı hayvanı oynatıyor...");
		kuyrukluHayvvan.kuyrukSalla();
		kuyrukluHayvvan.kuyrukSalla();
	}

	
	public void hayvanlariOynat (ArrayList<IKuyruklu> kuyrukluHayvanList) { 
		// IKuyruklu interfaceini implement eden tüm sınıfları içine alır bu ArrayList
		//normalde ArrayList tek tip nesne alır. aam interface de alabilir böylece esneklik kazanırız.
		System.out.println("Hayvan bakıcısı hayvanları oynatıyor...");
		for (IKuyruklu kuyrukluHayvan : kuyrukluHayvanList) {
			kuyrukluHayvan.kuyrukSalla();
		}
	}
	
}
