package basicprogram;

import java.util.*;
public class Q2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num=sc.nextInt();
		if(num==2) {
			System.out.println("Prime number");
		}
		else if(num%2!=0) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not Prime numaber");
		}
		sc.close();
		
	}
}
