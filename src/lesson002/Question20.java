package lesson002;

public class Question20 {

	public static void main(String[] args) {
		// 1den 100e kadar olan sayılardan çiftlerin toplamının teklerin toplamına oranını yazdır
		
		int tektoplam=0; 
		int cifttoplam=0;
		
		for(int i=1;i<=100;i++) {
			
			if(i%2==0) {
				cifttoplam+=i;
			}else {
				tektoplam+=i;				
			}			
		}		
		
		double oran= 1D * cifttoplam/tektoplam; // 2 int'in bölümünüü int kabul edeceği için başa 1D* ekledik
		System.out.println(oran);			
	}
}
