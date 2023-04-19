package basicprogram;

public class Q5 {
	public static void main(String args[]) {
		System.out.print("\nYour given number is = ");
		for(String x:args) {
			System.out.print(x+",");
		}
		int sum=0;
		for(int i=0;i<args.length;i++) {
			sum=sum+(Integer.parseInt(args[i]));
		}
		System.out.println("\n\nAddition = "+sum);
		float f=sum/(args.length);
		System.out.println("\nDivision = "+f);
	}
}
