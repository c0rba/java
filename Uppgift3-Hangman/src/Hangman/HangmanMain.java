package Hangman;

import java.io.IOException;
import java.util.Scanner;

public class HangmanMain {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to hangman!");
		System.out.println();
		System.out.println("In this game you get a word to guess if you guesss wrong 7 times you loose!");
		

		boolean doYouWantToPlay = true;
		while (doYouWantToPlay) {
			
			System.out.println();
			System.out.println("Let's play!\n");
			HangmanBuild game = new HangmanBuild();
			
			
			
			do {
				System.out.println(game.drawPicture() + "\n");
				System.out.println(game.getFormalCurrentGuess() + "\n");
				//System.out.print(game.mysteryWord);
				
				
				System.out.println("Enter your guess here:");
				char guess = (scan.next().toLowerCase()).charAt(0);
				System.out.println();
				
				
				while (game.isGuessedAlready(guess)) {
					System.out.println("You've already guessed that character!");
							guess = (scan.next().toLowerCase()).charAt(0);
				}
				
				
				if (game.playGuess(guess)) {
					System.out.println("You guessed right!");
				}
				else {
					System.out.println("You guessed wrong!");
				}
				
				
			}
			
			
			while (!game.gameOver());
			
			
			
			
			
			System.out.println();
			System.out.println("Do you want to play again? Yes/No?");
			Character response = (scan.next().toUpperCase().charAt(0));
			doYouWantToPlay = (response == 'Y');
		}

scan.close();
	}
}


