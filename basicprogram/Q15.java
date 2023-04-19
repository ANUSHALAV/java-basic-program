package basicprogram;

import java.util.*;

class InvalidAge extends Exception{
	public InvalidAge(String str) {
		super(str);
	}
}
public class Q15 {
	static void validdate(int age) throws InvalidAge{
		if(age<18) {
			throw new InvalidAge("you are not eligible for vote!");
		}
		else {
			System.out.println("you are eligible for vote!");
		}
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the age = ");
		int age=sc.nextInt();
		try {
			validdate(age);
		}
		catch(InvalidAge e) {
			System.out.println(e);
		}
		
	}
}
