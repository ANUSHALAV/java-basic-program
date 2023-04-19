package basicprogram;

class MyClass{
	public MyClass(int id,String name){
		System.out.print("\nId = "+id+"\nName = "+name);
		System.out.println("");
	}
}

public class Q8{
	public static void main(String args[]) {
		MyClass obj1=new MyClass(1,"shalu gairola");
		MyClass obj2=new MyClass(2,"sneha");
	}
}
