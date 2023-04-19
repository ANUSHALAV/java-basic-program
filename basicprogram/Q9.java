package basicprogram;

class MainClass{
	MainClass(){
		System.out.println("\nI am no argument constructer");
	}
	MainClass(String name,int age){
		System.out.print("\nName = "+name+"\nAge = "+age);
		System.out.println("");
	}
	void prindata() {
		System.out.println("\nI am simple method without any argument");
	}
	void printdata(String name,int age) {
		System.out.println("\nName = "+name+"\nAge = "+age);
	}
	void printdata(String name,String city,int age) {
		System.out.println("\nName = "+name+"\nCity = "+city+"\nAge = "+age);
	}
}
public class Q9 {
	public static void main(String args[]) {
		MainClass mc1=new MainClass();
		MainClass mc2=new MainClass("shalu gairola",20);
		mc1.prindata();
		mc2.printdata("anjali",20);
		mc1.printdata("sneha","rishikesh",20);
		
	}
}
