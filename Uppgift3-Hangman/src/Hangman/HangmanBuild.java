package Hangman;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.io.IOException;

public class HangmanBuild {
		
		String mysteryWord;
		StringBuilder currentGuess;
		ArrayList<Character> previousGuesses = new ArrayList<>();
		
		int maxTries = 7;
		int currentTry = 0;
		
		ArrayList<String> wordList = new ArrayList<>();
		private static FileReader fileReader;
		private static BufferedReader bufferedFileReader;
		
		public HangmanBuild() throws IOException {
			initializeStreams();
			mysteryWord = pickWord();
			currentGuess = initializeCurrentGuess();
		}
		
		public void initializeStreams() throws IOException {
			try {
				File inFile = new File("WordList.txt");
				fileReader = new FileReader(inFile);
				bufferedFileReader = new BufferedReader(fileReader);
				String currentLine = bufferedFileReader.readLine();
				while (currentLine != null) {
					wordList.add(currentLine);
					currentLine = bufferedFileReader.readLine();
				}
				
				bufferedFileReader.close();
				fileReader.close();
				
			}
			catch(IOException e) {
				System.out.println("could not init streams");
			}
		}
		
		public String pickWord() {
		Random random = new Random();
		int wordIndex = Math.abs(random.nextInt()) % wordList.size();
		return wordList.get(wordIndex);	
		}
		
		public StringBuilder initializeCurrentGuess() {
			StringBuilder current = new StringBuilder();
			for (int i = 0; i < mysteryWord.length() * 2; i++) {
				if (i % 2 == 0) {
					current.append("_");
				}
				else {
					current.append(" ");
				}
			}
			
			return current;
			
		}
		
		
		public String getFormalCurrentGuess() {
			return "Current Guess: " + currentGuess.toString();
		}
		
		
		public boolean gameOver() {
			if (Win()) {
				System.out.println();
				System.out.println("The word is: "+ mysteryWord +"\nCongratulations you won!");
				return true;
			}
			else if (Loose()) {
				System.out.println();
				System.out.println("You lost!\n" + "The word was: " + mysteryWord + "!");
				return true;
			}
			return false;			
		}
		
		
		public boolean Win() {
			String guess = getCondensedCurrentGuess();
			return guess.equals(mysteryWord);
		}
		
		
		public boolean Loose() {
			return currentTry >= maxTries;
		}
		
		
		public String getCondensedCurrentGuess() {
			String guess = currentGuess.toString();
			return guess.replace(" ",  "");
		}
		
		
		public boolean isGuessedAlready(char guess) {
			return previousGuesses.contains(guess);
		}
		
		
		public boolean playGuess(char guess) {
			boolean isItAgoodGuess = false;
			previousGuesses.add(guess);
			for (int i = 0; i < mysteryWord.length(); i++) {
				if (mysteryWord.charAt(i) == guess) {
					currentGuess.setCharAt(i * 2,  guess);
					isItAgoodGuess = true;
				}
			}
			
			if (!isItAgoodGuess) {
				currentTry++;
			}
			
			return isItAgoodGuess;
			
		}
		
		public String drawPicture() {
			switch(currentTry) {
			case 0: return StringDraw();
			case 1: return addHead();
			case 2: return addBody();
			case 3: return addLeftArm();
			case 4: return addRightArm();
			case 5: return addLeftLeg();
			default: return addRightLeg();
			}
		}

		
		private String StringDraw() {
			return " __________\n"+
			       " |        |\n"+
			       " |         \n" +
			       " |         \n"+
			       " |         \n" +
			       " |         \n" +
			       " |\n" +
			       "/|\\ \n";
		}

		
		private String addHead() {
			return " __________\n"+
			       " |        |\n"+
			       " |        O\n" +
			       " |         \n"+
			       " |         \n" +
			       " |         \n" +
			       " |\n" +
			       "/|\\ \n";
		}

		
		private String addBody() {
			return  " __________\n"+
				    " |        |\n"+
					" |        O\n" +
					" |        |\n"+
					" |        |\n" +
					" |         \n" +
					" |\n" +
					"/|\\ \n";
		}

		
		private String addLeftArm() {
			return  " __________\n"+
				    " |        |\n"+
					" |        O\n" +
					" |       /|\n"+
					" |        |\n" +
					" |         \n" +
					" |\n" +
					"/|\\ \n";
		}

		
		private String addRightArm() {
			return 	" __________ \n"+
					" |        | \n"+
					" |        O\n" +
					" |       /|\\ \n"+
					" |        | \n" +
					" |          \n" +
					" |\n" +
					"/|\\ \n";
		}

		
		private String addLeftLeg() {
			return  " __________    \n"+
					" |        |    \n"+
					" |        O    \n" +
					" |       /|\\ \n"+
					" |        |    \n" +
					" |       /     \n" +
					" |\n" +
					"/|\\ \n";
		}

		
		private String addRightLeg() {
			return  " __________    \n"+
					" |        |    \n"+
					" |        O    \n" +
					" |       /|\\ \n"+
					" |        |    \n" +
					" |       / \\  \n" +
					" |\n" +
					"/|\\ \n";
		}


		
	}
