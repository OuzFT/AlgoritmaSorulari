package lesson010hafta4_oopPizza;

public class PizzaTercihleri {

	//İş kodlarını ayrı classta yazmak daha doğrudur.
	//S.O.L.I.D
	//S=> Single Responsibility
	//Her class ve her metod sadece bir iş yapmalı.
	
	//OOP 4 ayağı var:
	// Encapsulation; Abstraction; Inheritance; Polymorphism
	//Encapsulation: İsstediğimiz verilerin kullanımını kısıtlayan bir 
	public void sosEkle2(Pizza pizza) {
		pizza.setPrice(pizza.getPrice()+50);
	}

	public void peynirEkle2(Pizza pizza) {
		pizza.setPrice(pizza.getPrice()+100);
	}
	
	public void eveSiparis2(Pizza pizza) {
		pizza.setPrice(pizza.getPrice()+20);
	}
	
	public void fisAl2(Pizza pizza) {
		System.out.println("Toplam tutar: " + pizza.getPrice());
	}
	
	public void sosCikar(Pizza pizza) {
		pizza.setPrice(pizza.getPrice()-50);
	}
	
	public void peynirCikar(Pizza pizza) {
		pizza.setPrice(pizza.getPrice()-100);
	}
}

