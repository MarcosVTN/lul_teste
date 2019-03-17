package curso;

public class Aula11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// aula sobre tipos primitivos no java
		byte x = 10;
		boolean teste;
		int soma = x + 99;
		char verd = 'V';
		char fals = 'F';
//		float lol = 3.222f;
//		long lol1 = 4000L;
		String nome = "Marcos";

		System.out.println(soma);
		System.out.println(nome);

		if (soma == 20) {
			teste = true;

		} else {
			teste = false;

		}
		if (teste == true) {
			System.out.println(verd);
		} else {
			System.out.println(fals);
		}
	}

}
