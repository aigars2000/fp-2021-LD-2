package ld2_191RDB097;

import java.util.Scanner;

public class ld2_191RDB097 {

	static long superDigit(long x) {

		return x == 0 ? 0 : (x % 9 == 0) ? 9 : (x % 9);

	}

	public static void main(String argc[]) {
		long x = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Aigars Soloha	191RDB097");
		System.out.print("Enter the number: ");
		x = sc.nextInt();
		sc.close();
		System.out.println("SuperDigit: " + superDigit(x));
	}

}
