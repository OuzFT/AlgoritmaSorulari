package lesson004;

public class Question36 {

	public static void main(String[] args) {
		// virgülden önceki her kelimeyi aşağı yazdıran program:
		
		String string="Java,Spring,Postgre,React";
		System.out.println("string uzunluğu: " + string.length());
		
		for(int i=0;i<string.length();i++) {						
			if(string.charAt(i)==',') {
				System.out.println();
			}
			else
				System.out.print(string.charAt(i));
							
		}
		
	}

}
