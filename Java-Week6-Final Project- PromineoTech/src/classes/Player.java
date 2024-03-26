package classes;

import java.io.*;
import java.util.*;


/* 
 * ********************
 * Step 1
 * ********************
 */


/*Player class
 * 
 * 
 * i. Fields

      1. hand (List of Card)

      2. score (set to 0 in the constructor)

      3. name

	ii. Methods

        1. describe (prints out information about the player and calls the describe method for each card in the Hand List)

        2. flip (removes and returns the top card of the Hand)

        3. draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)

        4. incrementScore (adds 1 to the Player’s score field)
 * 
 */

public class Player {
	

	
	//Fields
	
	//This class has a list of Card field
	private List<Card> hand = new ArrayList<Card>();
	
	//this variable 
	private int score;
	private String name;
	
	
	
	//constructor
	public Player() {
		//initialize score
		score = 0;
	}
	
	public Player(String name) {
		this.name = name;
		this.score = 0;
	}
	

	
	
	//public methods
	
	
	/*
	 * prints out information about the player and calls 
	 * the describe method for each card in the Hand List
	 */
	public void describe() {
		//printing player info
		System.out.println("Player: " + name
				+"\n"
				);
		
		//printing card info in hand list
		for(Card c : this.hand) {
			c.describe();
		}
	}
	
	
	//flip (removes and returns the top card of the Hand)
	public Card flip() {
		//removing the top card of the Hand
		Card c = hand.remove(0);
		
		//returns the card
		return c;
		
	}
	
	
	
	
	
	/*
	 * draw (takes a Deck as an argument and calls the draw method 
	 * on the deck, adding the returned Card to the hand field)
	 */
	
	public void draw(Deck d) {
		//adding the returned card to the hand field
		hand.add(d.draw());
		
	}
	
	
	
	
	
	//incrementScore (adds 1 to the Player’s score field)
	public void incrementScore() {
		score += 1;	
	}
	
	
	
	
	/*
	 * getters and setters
	 */
	
	
	public List<Card> getHand() {
		return hand;
	}
	
	
	
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	
	
	
	public int getScore() {
		return score;
	}
	
	
	
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
	public String getName() {
		return name;
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}

}
