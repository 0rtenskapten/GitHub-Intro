package metoder;

import java.util.Scanner;

public class uppgift1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int minsta = myLibrary.min(a, b);

		System.out.println("Minsta talet är: " + minsta);

			sc.close(); 
	}

}