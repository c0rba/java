package Password;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		
		String password = "Hejsan";
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter password here!");
		
		while (true) {
			String pass = scanner.nextLine();
			
			if (pass.equals("Quit")) {
				System.out.println("Get out!");
				
				break;
			}
			
			else if (pass.equals(password)) {
				System.out.println("You entered correct password!");
				break;
			}
			
			else {
				System.out.println("You entered wrong password!");
				
				Pass(password);
			}
		}

	}

	
	
	static void Pass(String pass) {
	 
		String s = pass;
		System.out.println("Hint: ");
		
		for (int i = 0; i < s.length(); i++) {
			char c =s.charAt(i);
			
			if (c >= 'a' && c <= 'm')
				c += 15;
			
			else if (c >= 'A' && c <='M')
				c +=13;
			
			else if (c >= 'n' && c <='z')
				c -= 8;
			
			else if (c >= 'N' && c <= 'Z')
				c -= 7;
			
			System.out.print(c);
			
		}
		
		
		System.out.println();
		
	}
}
