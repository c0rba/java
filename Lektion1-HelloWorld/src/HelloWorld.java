
public class HelloWorld {

	public static void main(String[] args) {
		
		//-----------------------------------------------------------------------------------------------------------------
		
		//int är tal.
		
		int number=13;
		
		System.out.println(number);
		
		number=number+7;
		
		System.out.println(number+"\n");
		
		//-----------------------------------------------------------------------------------------------------------------
		
		//string är text
		
		String text="Filip";
		
		System.out.println(text);
		
		text=text+"!";
		
		System.out.println(text+"\n");
		
		//-----------------------------------------------------------------------------------------------------------------
		
		//double är decimal tal
		
		double decimal=4.5;
		
		System.out.println(decimal);
		
		decimal=decimal+7.5;
		
		System.out.println(decimal);
		
		//-----------------------------------------------------------------------------------------------------------------
		
		//Att göra en double till en int tar bort decimalen.
		
		int x=(int) decimal;
		
		System.out.println(x+"\n");
		
		//-----------------------------------------------------------------------------------------------------------------
		
		// om man inte skriver ut decimalen i double så blir det samma resultat som int, ett helt tal, fast med .0 decimal
		
		int numberDown=4/3;
		
		System.out.println(numberDown);
		
		double notCorrect=4/3;
		
		System.out.println(notCorrect);
		
		double numberDownB=4.0/3.0;
		
		System.out.println(numberDownB+"\n");
		
		//-----------------------------------------------------------------------------------------------------------------
		 
		String greeting="Hi there";
		
		String name="Fille";
		
		String scentence=greeting+" "+name+" ";
		
		System.out.println(scentence);
		
		
		
		//-----------------------------------------------------------------------------------------------------------------
		
		//boolean är ett sant eller ett falskt värde
		
		boolean isTrue=true;
		
		boolean isFalse=false;
		
		//-----------------------------------------------------------------------------------------------------------------
		
		System.out.println("\nHello World".toUpperCase());
		
		System.out.println();
	
		System.out.println("HELLO wOrLd\n".toLowerCase());
		
		System.out.println("Hello World");
		
		System.out.print("Hello World!");
		
		System.out.print("Hello!");
		
		//-----------------------------------------------------------------------------------------------------------------
		
	}

}
