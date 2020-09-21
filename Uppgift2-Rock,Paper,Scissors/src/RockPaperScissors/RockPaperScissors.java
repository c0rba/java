package RockPaperScissors;

import java.util.Scanner;

public class RockPaperScissors {

//----------------------------------------------------------------------------------------------------------------
	
	public static void main(String[] args) {
		
		//rock beats scissors
		//paper beats rock
		//scissors beats paper
		
		Scanner console = new Scanner(System.in);
		
		String choice = console.nextLine();
		
		System.out.println(choice);
		
		if (isValid(choice)) {
			//do stuff with game
			int aIchoice = (int)(Math.random()*3);
			int personChoice = getVal(choice);
			System.out.println("You picked: " + choice);
			System.out.println("The computer picked: " + getAiChoice(aIchoice));
			System.out.println("You " + didPersonWin(personChoice, aIchoice));
			
			//0 = rock
			//1 = paper
			//2 = scissors
			
		}
		
		else {
			System.out.println("Wrong input");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
//----------------------------------------------------------------------------------------------------------------
	
	public static String getAiChoice(int ai) {
		
		if (ai == 0) {
			return "Rock";
		}
		
		if (ai==1) {
			return "Paper";
		}
		
		if (ai==2) {
			return "Scissor";
		}
		
		return "AI malfunction";
		
	}
	
//----------------------------------------------------------------------------------------------------------------
	
	public static String didPersonWin(int playerChoice, int pcChoice) {
		
		//tie, lose, win
		//0 = rock
		//1 = paper
		//2 = scissors
		
		if (playerChoice == 0) {
			if (pcChoice != 1) {
				if (pcChoice != 0) {
					return "Win!";
				}
				return "Tie!";
			}
			return "Loose!";
		}
		
		
		
		if (playerChoice == 1) {
			if (pcChoice != 0) {
				if (pcChoice != 1) {
					return "Win!";
				}
				return "Tie!";
			}
			return "Loose!";
		}
		
		
		
		if (playerChoice == 2) {
			if (pcChoice != 0) {
				if(pcChoice != 2) {
					return "Win!";
				}
				return "Tie!";
			}
			return "Loose!";
		}
		
		return "System fault";
		
	}
	
//----------------------------------------------------------------------------------------------------------------
	
	public static boolean isValid(String string) {
		
		if (string.equalsIgnoreCase("rock")) {
			return true;
		}
		
		if (string.equalsIgnoreCase("paper")) {
			return true;
		}
		
		if (string.equalsIgnoreCase("scissors")) {
			return true;
		}
		
		return false;
	}
	
//----------------------------------------------------------------------------------------------------------------
	
	
	public static int getVal(String string) {
		
		if (string.equalsIgnoreCase("rock")) {
			return 0;
		}
		
		if (string.equalsIgnoreCase("paper")) {
			return 1;
		}
		
		else {
			return 2;
		}
	}
	
//----------------------------------------------------------------------------------------------------------------

}
