package lesson011hafta5_oopEmployee;

public class Main {

	// Maaş, Vergi, Bonus, Maaşı artımı hesaplayan bir program
	
			//Sınıfın attributeleri
			//name, salary, workHours(Çalıştığı saat), hireYear(İşe Giriş Yılı)
			//tax(vergi), bonus(mesai ücreti)
			//salaryRaise(Maaş artırımı)
			
			//tax methodu--> eğer çalışanın maaşı 2000 tl den az ise
			// vergi uygulanmayacak, fazla ise maaşının %5 i kadar vergisi olacak
			
			//bonus metodu--> eğer haftada 40 saatten fazla çalıştıysa
			// çalıştığı saat başına 30 tl maaşa bonus uygulanacak
			// ve ne kadar bonus aldığı hesaplanacak
			
			//raiseSalary--> işe girdiği yıla göre maaş artışı yapılacak
			//şuanki yıl 2022, 10 yıldan az ise %5, 10- 20 yıl arasında %10
			//20 yıldan fazla ise %15 zam yapılcak
			
			//employye bilgilerini goster method
			/*
			Adı : Ahmet
			Maaşı : 3000.0
			Çalışma Saati : 65.0
			Başlangıç Yılı : 1995
			Vergi : 90.0
			Bonus : 750.0
			Maaş Artışı : 450.0
			Vergi ve Bonuslar ile birlikte maaş : 3660.0
			Toplam maaş : 4110.0
			*/
	public static void main(String[] args) {

		EmployerManager employerManager = new EmployerManager();

		Employee employee1 = new Employee("mete", 5000, 65, 2010);
		employerManager.calculateTax(employee1);
		employerManager.calculateBonus(employee1);
		employerManager.calculateRaiseSalary(employee1);
		employerManager.showInfo(employee1);

	}
}