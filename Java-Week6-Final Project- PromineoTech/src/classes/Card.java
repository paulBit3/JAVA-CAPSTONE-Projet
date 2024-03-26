package classes;

import java.io.*;
import java.util.*;




/* 
 * ********************
 * Step 1
 * ********************
 */

/*Card class
 *   
   i. Fields

      1. value (contains a value from 2-14 representing cards 2-Ace)

      2. name (e.g. Ace of Diamonds, or Two of Hearts)

   ii.  Methods

      1. Getters and Setters

      2. describe (prints out information about a card)
 */

public class Card {

	
	//Fields
	
	/*
	 * This class represents a standard playing card. 
	 * and contains a value from 2-14 representing cards 2-Ace
	 */
	
	private String name;
	private int value;
	
	
	
	
	
	
	//The class contains a value from 2-14 representing cards 2-Ace
	/*
	 * We'll create a public method to hold value
	 * and use the switch statement to represent the cards
	 * that method will take two arguments to hold and 
	 * represent value
	 */
	
	//each card has a name, a type and value
	public Card(int val, String type ) {
		//assigning val to value
		value = val;
		
		//switch statement
		switch(value) {
		
		case 2: name = "Two";
			break;
			
		case 3: name = "Three";
			break;
			
		case 4: name = "Four";
			break;
			
		case 5: name = "Five";
			break;
			
		case 6: name = "Six";
			break;
			
		case 7: name = "Seven";
			break;
			
		case 8: name = "Height";
			break;
			
		case 9: name = "Nine";
			break;
			
		case 10: name = "Ten";
			break;
		
		case 11: name = "Jack";
			break;
		
		case 12: name = "Queen";
			break;
		
		case 13: name = "Name";
			break;
		
		case 14: name = "Ace";
			break;
		
		default:
			System.out.println("Invalid Card");
			break;
		}
		
		//assign type of card
		name += "of" + type;
	}
	
	

	
	// methods
	
	
	//prints out information about a card
	public void describe() {
		System.out.printf("Card: %s %d\n" + name, value);
	}
	
	
	
	
	
	
	/*
	 * getters and setters
	 */
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getValue() {
		return value;
	}



	public void setValue(int value) {
		this.value = value;
	}



	

}
