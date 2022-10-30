package lesson004;

public class Question37 {

	public static void main(String[] args) {
		// virgülden önceki her kelimeyi aşağı yazdıran program: - substring() kullan!

		String string = "Java,Spring,Postgre,React";
		System.out.println("string uzunluğu: " + string.length());

		int index = 0;

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == ',') {
				System.out.println(string.substring(index, i));
				index = i + 1;
			}

		}

		System.out.println(string.substring(index));
	}

}
