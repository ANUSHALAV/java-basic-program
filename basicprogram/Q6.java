package basicprogram;

class Student{
	String name,city;
	int age;
	Student(String name,String city,int age){
		this.name=name;
		this.city=city;
		this.age=age;
	}
	void printData() {
		System.out.print("\nName = "+name+"\nCity = "+city+"\nAge = "+age);
		System.out.println("");
	}
}
public class Q6 {
	public static void main(String args[]) {
		Student s1=new Student("shalu gairola","rishikesh",21);
		Student s2=new Student("anjana","rishikesh",20);
		s1.printData();
		s2.printData();
		
	}
}
