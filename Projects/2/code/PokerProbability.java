/**
 * file: PokerProbability.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Project 2
 * due date: December 12, 2016
 * version: 1.0
 * 
 * For my final project I am using a double array in order to build a deck of cards
 * with four suits and thirteen ranks. From this deck of cards, more arrays are used
 * in order to develop a five card poker hand that will be analyzed. The five card
 * hand is then analyzed and determined whether it contains a flush or a royal flush.
 * Once it is determined what kind of a hand it is, royal flush, regular flush, or 
 * neither, there is a count for the two flush categories that are incremented each
 * time one of these hands occur. The counts for the royal flush and flush categories
 * end after all of the hands have been gone through. These counts represent the number
 * of royal flushes and regular flushes out of all of the hands. The counts are then
 * divided by the total number of hands to give us a calculated probability for receiving
 * a royal flush and a flush. The number of hands, the calculated probabilities, as well as
 * the actual probabilities from the Monte Carlo experiment are then printed to the screen. 
 * This allows the user to compare and notice the difference in the calculated probabilities 
 * from the program and the actual probabilities of receiving those particular hands.
 */

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class PokerProbability {
  //This creates arrays that hold the suits as well as the ranks found on the cards.  
	private static String[] suitArray = { "SPADE", "HEART", "CLUB", "DIAMOND" };
	private static String[] rankArray = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE" };
	private static String[][] deckArray;
	private static String[][] firstHand;
	
	public static void main(String[] args) {
		//This creates the deck of cards.
    deckArray = createDeck(suitArray, rankArray);
		//Creates scanner for user to input 
    Scanner scanner = new Scanner(System.in);
		//prompts the user to input the number of tests they would want to do.
    System.out.print("Please enter a large integer for the number of tests to execute and display probabilities:\n");
		//This calculuates the probabilities and displays it in the console.
    calcProbs(scanner.nextInt()); 
    
	}
  /**
   * createDeck
   *
   * This function creates a deck of cards with four suits and thirteen ranks
   * per suit, making up fifty-two cards to choose from.
   *
   * Parameters:
   *   suits: the first number for each element. This consists of Hearts, Spades, Clubs, and Diamonds.
   *   ranks: the second number for each element. This contains numbers 2-10 and J, Q, K, and A. 
   *
   * Return Value: the deck of cards to use in the program.
   */   
	private static String[][] createDeck(String[] suits, String[] ranks) {
		//This is a two dimensional array which creates the cards with both a suit and rank
    String[][] deck = new String[52][2]; 
		
		int counter = 0; 
		//This first for loop runs through each suit.
		for(int i = 0; i < suits.length; i++) { 
			//The second for loop runs through each rank for each suit.
			for(int j = 0; j < ranks.length; j++) {
				//Assigns suit and rank to the card that is being made.	
				deck[counter][0] = suits[i];
				deck[counter][1] = ranks[j];
				//Keeps track of which card is being created				
				counter++; 
			}
		}
		return deck;
	}
  /**
   * buildHand
   *
   * This function builds each hand that the program will then continue to analyze.
   *
   * Parameters:
   *   deck: the 52 cards of which to choose the particular hand of cards from.
   *   
   * Return Value: the hand of cards to analyze further in the program.
   */   
  private static String[][] buildHand(String[][] deck) {
    String[][] myHand = new String[5][2];
		Random rand = new Random();
		int count = 0;
		
    ArrayList<Integer> used = new ArrayList<Integer>();
		//while loop that randomly selects the 5 cards we need for the poker hand.
    while(count < 5) {
			int temp = rand.nextInt((51 - 0) + 1) + 0; 
			if (count == 0) {
				used.add(temp);
			}
      //This for loop with the if statement makes sure that there are no duplicates in the hand.
			for(int j = 0; j < used.size(); j++) {
				if ((temp != used.get(0) && temp != used.get(1) && temp != used.get(2) && temp != used.get(3) && temp != used.get(4))) {
					used.set(count, temp);
					//Assigns a suit and rank value to each card in the deck
          myHand[count][0] = deck[temp][0]; 
					myHand[count][1] = deck[temp][1]; 
					count++;
				}
			}
			
			
		}
		//Returns the poker hand to the main method.
		return myHand;
	}
  /**
   * calcProbs
   *
   * This function determines which category to increase based off of what kind 
   * of a hand it is. The count to the specific category, flushCount or 
   * royalFlushCount, will increase and keep a tally of how many there are in a 
   * certain number of hands determined by the user. This also calculates the 
   * probabilities of each hand and compares it to the actual probabilities.
   *
   * Parameters:
   *   size: the number of five card hands that are chosen to analyze. 
   *
   * Return Value: number of flushes and royal flushes, as well as their respective
   *   probabilities compared to the actual probabilities.
   */   
	private static void calcProbs(int size) {
		//Starts the count for placing the poker hands into the appropriate categories. 
    int royalFlushCount = 0;
    int flushCount = 0;
    
    for(int i = 0; i < size; i++) { //For however many tests need to be run
			//builds random hand from the deck of cards.
      String[][] randomHand = buildHand(deckArray);
      //What to do if it is a royal flush.
      if(isRoyalFlush(randomHand)) {
        //increases the amount of royal flushes every time there is one in the hand.
        royalFlushCount++;
        //What to do if the card hand is a flush.
      } else if(isFlush(randomHand)) {
        //this increments the flush amount when occurs in hand to get total.
        flushCount++;
      } 
		
		}
    //This prints the outcomes and the associated calculated and actual probabilities to the screen.
    System.out.println("There are " + royalFlushCount + " royal flushes with a probability of " + (royalFlushCount/(double) size) + ".");
    System.out.println("The actual probability of getting a royal flush is 0.000001539.");
    System.out.println("There are " + flushCount + " flushes with a probability of " + (flushCount/(double) size) + ".");
    System.out.println("The actual probability of getting a flush is 0.0019654.");
  }
		
	/**
   * isRoyalFlush
   *
   * This function determines if the hand creates consists of a royal flush.
   *
   * Parameters:
   *   hand: this is analyzed to determine if it is a royal flush. 
   *   
   * Return Value: if it is a royal flush it returns true and as a result adds one to the royalFlushCount.
   */ 
  private static boolean isRoyalFlush(String[][] hand) {    
    if(!isFlush(hand)) {
      return false;
    } else {
      ArrayList<String> royal = new ArrayList<String>();
      royal.add("10");
      royal.add("JACK");
      royal.add("QUEEN");
      royal.add("KING");
      royal.add("ACE");
      for(int i = 0; i < hand.length; i++) {
        if (royal.contains(hand[i][1])) {
          royal.remove(hand[i][1]);
        }
      }
      return royal.size() == 0;
    }
  }
  
  /**
   * isFlush
   *
   * This function determines if the hand creates consists of a flush.
   *
   * Parameters:
   *   hand: this is analyzed to determine if it is a flush. 
   *   
   * Return Value: if it is a flush it returns true and as a result adds one to the flushCount.
   */   
  private static boolean isFlush(String[][] hand) {
    String suit = hand[0][0];
    for(int i = 1; i < hand.length; i++) {
      if(!hand[i][0].equals(suit)) {
        return false;
      }
    }
    return true;
  }

}  

