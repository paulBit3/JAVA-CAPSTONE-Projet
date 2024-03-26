package classes;

import java.io.*;
import java.util.*;


/* 
 * ********************
 * Step 1
 * ********************
 */

/*Deck class

	i.  Fields

    	1. cards (List of Card)

    ii.  Methods
    	1.   shuffle (randomizes the order of the cards)

    	2.   draw (removes and returns the top card of the Cards field)

    	3.   In the constructor, when a new Deck is instantiated, 
    	the Cards field should be populated with the standard 52 cards.*/

public class Deck {

	
	//Fields
 
	 /** This class has a list of Card field
	 * we can also give a name to the card
	 */
	
	private List<Card> cards = new ArrayList<Card>();
	
	
	
	
	
	
	// methods
	
	
	
	/*We suggest one Deck, with 52 Cards, and 2 Players
	  In the constructor, when a new Deck is instantiated, 
	  the Cards field should be populated with the standard 52 cards
	*/
	
	
	//the constructor, when a new Deck is instantiated
	
	public Deck() {

		//we know each card has a name and value
		
		//let create a List to return a type of  card
		List<String> type = Arrays.asList("Diamonds", "Clubs", "Hearts", "Spades");
		
		//outer looping through the value 2-14
		for(int i=2; i<= 14; i++) {
			
			//inner looping the card type
			for(String str: type) {
				
				//creating a new card
				cards.add(new Card(i, str));
			}
		}
		
	}
	
	//prints out information about a card
	public void describe() {
		//printing cards
		for(Card c : this.cards) {
			c.describe();
		}
	}
	
	/*Deck shuffle() method
	 * 
	 * This method randomizes the order of the cards 
	 * It runs in linear time
	 * 
	 */
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
	
	/*Deck draw() method
	 * 
	 * this method remove a card
	 * and returns the top card of the Cards field
	 * 
	 */
	
	
	public Card draw() {
		//removing the top card of the deck
		Card c = this.cards.remove(0);
		
		//returns the card
		return c;
	}
	
	
	
	
	
	/*
	 * getters and setters
	 */
	public List<Card> getCards() {
		return this.cards;
	}
	
	
	
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}


}
