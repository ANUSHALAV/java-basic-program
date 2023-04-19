package basicprogram;

class Student2{
	String name,city;
	int age;
	void getdata(String name,String city,int age) {
		this.name=name;
		this.city=city;
		this.age=age;
	}
	void printdata() {
		System.out.print("\nName = "+name+"\nCity = "+city+"\nAge = "+age);
		System.out.println("");
	}
}
public class Q7 {
	public static void main(String args[]) {
		Student2 s1=new Student2();
		Student2 s2=new Student2();
		s1.getdata("shalu gairola","rishikesh",21);
		s2.getdata("anjali","rishikesh",20);
		s1.printdata();
		s2.printdata();
		
	}

}
