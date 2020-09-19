import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		
		Scanner reader=new Scanner(System.in);
		
		System.out.println("Skriv ditt namn här");
		String name=reader.nextLine();
		
		System.out.println("inmatat namn är: " + name);
		
		System.out.println("Skriv din ålder här");
		int input=Integer.parseInt(reader.nextLine());
		
		System.out.println("inmatad ålder är: " + input);
		
		reader.close();
		
		
		
		
	}

}
