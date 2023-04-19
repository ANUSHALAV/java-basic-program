package basicprogram;

public class Q16 implements Runnable {
	public void run() {
		int j=1;
		while(j<=15) {
			System.out.println(j+" Hey");
			j++;
		}
	}
	public static void main(String args[]) {
		Q16 obj=new Q16();
		Thread th=new Thread(obj);
		th.start();
		int i=1;
		while(i<=5) {
			System.out.println(i+" Hello");
			i++;
		}
		
	}
}
