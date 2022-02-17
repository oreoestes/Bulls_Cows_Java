/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COP2510.project.UI;
import COP2510.project.business.iGuess;
import java.util.Scanner;

/**
 *
 * @author Oreti
 */
public class projApp {
  public static void main(String[] args){
	String rString = "";
        rString = iGuess.randString(rString);
	Scanner in = new Scanner(System.in);
        Scanner g = new Scanner(System.in);
        
        int bulls = 0;
        int cows = 0;
        
        String choice = "";
        String guess = "";
        System.out.println(rString);
        System.out.println("Welcome to iGuess!\nTo see the rules for the game, type 'rules', if you want to skip the rules, type 'y' to play or 'n' to quit: ");
        choice = in.nextLine();
        if (choice.equalsIgnoreCase("rules")){
           String rules = "";
           System.out.println("\n" + iGuess.Rules(rules));
           System.out.println("\nAre you ready to play? (y/n): ");
           choice = in.nextLine();
        }
        
        while(choice.equalsIgnoreCase("y")){
                
            int count = 1;
            while(count >= 1){
                System.out.println("\nEnter a guess string: ");
                    guess = g.nextLine();
                    bulls = iGuess.computeBulls(guess, rString);
                    cows = iGuess.computeCows(guess, rString);
                if(guess.equals("*****")){
                    System.out.println("\n" + rString + "\nGame paused with answer shown, would you like to continue? (y/n)");
                    in.nextLine();
                    count = count - 1;
                    break;
                }
                else if(guess.equals("x")){
                    System.out.println("Are you sure you want to QUIT? (y/n)");
                    in.nextLine();
                    if(choice.equalsIgnoreCase("y")){
                        count = count - 1;
                    break;
                    }
                }
                System.out.println("\nGuess again" + "\nNumber of guesses: " + count);
                count++;
		System.out.println("Score: " + bulls + "A" + cows + "B");
            }    
            System.out.println("Thanks for playing \nTotal Guesses: " + count + "\nFinal Score: " + bulls + "A" + cows + "B");
            break;
        }
    }
} 

