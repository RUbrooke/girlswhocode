import java.util.Random;
import java.util.Scanner;

public class Intership {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String userInput;
        String computerInput = " ";
        String winner = " "; 
        Random computerChoice = new Random();
        int computerChoiceNumber = computerChoice.nextInt(2);
            if (computerChoiceNumber == 0){
                computerChoiceNumber = 4; //set the length to 4 to compare to rock
                computerInput = "rock";
            }
            else if (computerChoiceNumber == 1){
                computerChoiceNumber = 5; //set the length to 5 to compare to paper
                computerInput = "paper";
            }
            else if (computerChoiceNumber == 2){
                computerChoiceNumber = 6; //set the length to 6 to compare to paper
                computerInput = "scissor";
            }
            
            System.out.println("Please type one of the following: rock, paper, or scissor."); 
            userInput = scan.nextLine();
            userInput = userInput.toLowerCase();
            System.out.println("You have selected: " + userInput + "\nThe computer selcted: " + computerInput);
            
            int userInputLength = userInput.length();
            /*
            rock(4) beats scissor(6)
            paper(5) beats rock(4)
            scissor(6) beats paper(5)

            scissor(6) looses to rock(4)
            rock(4) looses to paper (5)
            paper(5) looses to scissor(6)
            */
            if (userInputLength == 4 && computerChoiceNumber == 6){
                winner = "User";
            }
            else if (userInputLength == 5 && computerChoiceNumber == 4){
                winner = "User";
            }
            else if (userInputLength == 6 && computerChoiceNumber == 5){
                winner = "User";
            }      
            else if (userInputLength == 6 && computerChoiceNumber == 4){
                winner = "Computer";
            }  
            else if (userInputLength == 4 && computerChoiceNumber == 5){
                winner = "Computer";
            }
            else if (userInputLength == 5 && computerChoiceNumber == 6){
                winner = "Computer";
            }
            else{
                winner = "It's a tie";
            }
                System.out.println("The winner is: " + winner);
 
    }
}
