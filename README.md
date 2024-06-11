🤔About the Project:

The game is an automated version of a classic card game where users can play with the computer. 
I used a timer on the game, using the Java util timer’ class to make the game running after each play session.

Back-end techs: core Java, Object-Oriented Programming
----

- Clone: https://github.com/paulBit3/War-Card-Game.git

Features:
----
The game compare the value of each card returned by the two players, and print the final score of each player, the winner' name or prints "DRAW" if the score is tied.

----
The APP
```
package application;

import java.io.*;
import java.util.*;



import classes.Card;

/* 
 * ********************
 * Step 2
 * ********************
 */


import classes.Deck;
import classes.Player;

/*+++                                                +++*
 * 													    *
 *            C A R D  -- G A M E -- W A R              *
 *                                                      *
 */                                                  

public class App {

	public static void main(String[] args) {
		// Testing
		
		/* 
		 * ********************
		 * Step 2
		 * ********************
		 */
		
		
		/*
		 * creating an automated version of the classic card game WAR
		 * 
		 * I used a timer on the game, using the Java.util.temer() class
		 *  so that instead of having user to always run it, it will run automatically
		 * and print result
		 * 
		 * The code also work very well when it is manually run
		 */
		
		//instantiate the timer
		Timer timer = new Timer();
		
		//create a timer and run it
		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				System.out.println("Game progress... ---------\n");
				

				//a) Instantiate a Deck
				Deck deck = new Deck();
				
				//a) Instantiate two Players
				Player p1 = new Player("Player 1");
				Player p2 = new Player("Player 2");
				
				
				//a) call the shuffle method on the deck.
				deck.shuffle();
				
				
				/*b)
				 * iterate 52 times calling the Draw method on the 
				 * other player each iteration using the Deck you instantiated.
				 */
				int numberOfPlayers = 2;
				
				//outer loop
				for(int i = 0; i < 52; i++) {
					//inner loop
					for(int j = 1; j < numberOfPlayers; j++) {
						/*
						 * calling the Draw method
						 * using the Deck we instantiated
						 */
						
						//if i is even => player1
						if(i % 2 == 0) {
							p1.draw(deck);
						} else {
							//otherwise player2
							p2.draw(deck);
						}
					}

				}
				
				
				/*c)
				 * iterate 26 times and call the flip method for each player
				 * 
				 */
				for(int k = 0; k < 26; k++) {
					/*
					 * Compare the value of each card returned 
					 * by the two player’s flip methods
					 */
					
					//return the two player’s flip methods
					Card p1card = p1.flip();
					Card p2card = p2.flip();
					
					//Compare the value of each card
					if(p1card.getValue() > p2card.getValue()) {
						
						/*Call the incrementScore method on the 
						 *player whose card has the higher value. 
						 */
						p1.incrementScore();
						
					} else {
						
						/*Call the incrementScore method on the 
						 *player whose card has the higher value. 
						 */
						
						p2.incrementScore();
					}
					
				}
				
				//Print a message to say which player received a point.
				System.out.println("Player 1, You score " + p1.getScore());
				System.out.println("Player 2, You score " + p2.getScore());
				
				
				/*d, e)
				 * 
				 * After the loop, compare the final score from each player
				 * Print the final score of each player and 
				 * either “Player 1”, “Player 2”, or “Draw”,
				 * depending on which score is higher or if they are both the same.
				 * 
				 */
				if(p1.getScore() > p2.getScore()) {

					System.out.println("Player 1: " + p1.getScore() + " You won!");
					
				} else if(p1.getScore() < p2.getScore()) {
					
					System.out.println("Player 2: " + p2.getScore() + " You won!");
					
				} else {
					
					System.out.println("It's Draw! " + " Player 1 score: " + p1.getScore() + " = " + " Player 2 score: " + p2.getScore());
				}
				
				/* printing result
				 * 
				 * Game progress... ---------
				 * 
				 * Player 1, You score 11
				   Player 2, You score 15
				   Player 2: 15 You won!
				   
				   Player 1, You score 15
				   Player 2, You score 11
				   Player 1: 15 You won!
				   
				   Player 1, You score 13
				   Player 2, You score 13
				   It's Draw!  Player 1 score: 13 =  Player 2 score: 13
				   
				   Next round starting ...
				   
				   Game progress... ---------

				   Player 1, You score 11
				   Player 2, You score 15
				   Player 2: 15 You won!
				 */
				System.out.println();
				
				System.out.println("Next round starting ...\n");
				
			}
			
		}, 1000*5, 1000*5);
		
		
		

	}

```



----
A Deck constructor method:

```
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
```



----

Method to print a Player info
----
```
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
```
