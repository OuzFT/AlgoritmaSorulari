package hafta5_oop_odev;

public class Main2222 {

	public static void main(String[] args) {
		String array[]= {"5","j","2","a","3","v","a"};
		int toplam=0;
		String value="";
	for (int i = 0; i < array.length; i++) {
		
		try {
		int x=Integer.parseInt(array[i]);
		toplam+=x;
		} catch (Exception e) {
			value+=array[i];
		}finally {
			toplam+=1;
     value="";
		}
	}
		
		
		System.out.print(toplam);	
 System.out.print(value.replace("a", "e"));

	}

}
