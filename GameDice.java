/****************************************************************************
 *
 * Created by:Younes Elfeitori
 * Created on: Oct 2018
 * This program is a simulation of a game of dice
 *
 ****************************************************************************/

import java.util.Random;
import java.util.Scanner;

public class  GameDice{

	public static void main(String[] args) {
		int tries = 1;
		
		System.out.println("Welcome toa game of Dice!");
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		
		int random = new Random().nextInt(6) + 1;
		System.out.println("Pick a random number from 1 to 6.");
		
		do{
			int user = scanner.nextInt();
			if(random == user) {
				System.out.println("You got it !");
				System.out.println("It took you "  + tries + " tries. ");
				break;
			}
			else if(user > 6) {
				System.out.println("Invalid input! You can only input numbers from 1 to 6!");
			}
			else{
				System.out.println("Try Again! !");
				tries++;
			}
			
		}while(true);
		
		scanner.close();

	}

}
