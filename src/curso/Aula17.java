package curso;

import java.util.Scanner;

public class Aula17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);

		String sentence = ler.nextLine();// ate o \n (enter)
		String x, y, z;
		x = ler.next();
		y = ler.next();
		z = ler.next();

		System.out.println(sentence);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		x = ler.next();
		y = ler.next();
		z = ler.next();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		ler.close();
	}

}
