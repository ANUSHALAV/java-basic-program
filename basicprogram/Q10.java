package basicprogram;

abstract class Main{
	abstract void meth1();
	abstract void meth2();
	void meth3() {
		System.out.println("\nI am inside the meth3 method");
	}
}
public class Q10 extends Main {
	void meth1() {
		System.out.println("\nI am inside the meth1 method");
	}
	void meth2() {
		System.out.println("\nI am inside the meth2 method");
	}
	public static void main(String args[]) {
		Q10 obj1=new Q10();
		obj1.meth1();
		obj1.meth2();
		obj1.meth3();
		
	}
}
