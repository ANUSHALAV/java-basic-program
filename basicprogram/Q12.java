package basicprogram;

import java.util.*;

public class Q12 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int i[] = { 1, 2, 3, 4, 5 };
		System.out.print("Enter the number(0to4) = ");
		int num = sc.nextInt();
		try {
			System.out.println("\nyour number is = " + i[num]);
			try {
				System.out.print(i[num] + " / 0 = " + (i[num] / 0));
			} catch (ArithmeticException e) {
				System.out.println("\nCan't divided!");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\nArray not found!");
		}
		System.out.println("\nProgram in end!");
		sc.close();
	}
}
