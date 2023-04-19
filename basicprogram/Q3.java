package basicprogram;

public class Q3 {
	public static void main(String args[]) {
		String str="shalu gairola";
		String str1="SHALU GAIROLA";	
		String str2="   shalu gairola     ";
		System.out.println("\nString length = "+str.length());
		System.out.println("\nConvert upper case = "+str.toUpperCase());
		System.out.println("\nConvert Lower Case = "+str1.toLowerCase());
		System.out.println("\nReplce shalu into anjali = "+str.replace("shalu", "anjali"));
		System.out.println("\nAll space cancal = "+str2.trim());
		System.out.println("\nFind the index of the string \'r\' = "+str.indexOf("r"));
		System.out.println("\nString print index number 5 = "+str.substring(5));
}
}
