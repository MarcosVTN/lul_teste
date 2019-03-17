package curso;

import java.util.Scanner;

public class Aula17_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = 0;
		char ch = 0;
		String name ;
	//	char letter;
	//	int digit = 0;
		
		Scanner sc = new Scanner(System.in);
		
		n1 = sc.nextInt();
		sc.hasNextLine();
		name = sc.nextLine();
		ch = sc.next().charAt(0);
		
		System.out.println(n1);
		System.out.println(name);
		System.out.println(ch);
		
		
		
		
		sc.close();
	}

}
