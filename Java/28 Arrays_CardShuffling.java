public class Card {
    private String face;
    private String suit;
    
    public Card(String cardFace, String cardSuit)
    {
        face = cardFace;
        suit = cardSuit;
    }
    
    public String toString()
    {
        return face + " of " + suit;
    }
}


import java.util.Random;


public class DeckOfCards {
    
    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    
    private static Random randomNumbers = new Random();
    
    public DeckOfCards()
    {
        String [] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
                            "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" }; 
        
        deck = new Card[ NUMBER_OF_CARDS ]; // create array of Card objects
        currentCard = 0; // set currentCard so first Card dealt is deck[ 0 ]
        randomNumbers = new Random(); // create random number generator

        // populate deck with Card objects 
        for ( int count = 0; count < deck.length; count++ ) 
            deck[ count ] = new Card( faces[ count % 13 ], suits[ count / 13 ] );
      
    }
    
    public void shuffle()
    {
	// after shuffling, dealing should start at deck[ 0 ] again
	currentCard = 0; // reinitialize currentCard

	// for each Card, pick another random Card and swap them
 	for ( int first = 0; first < deck.length; first++ )
 	{
 		// select a random number between 0 and 51
 		int second = randomNumbers.nextInt( NUMBER_OF_CARDS );

		// swap current Card with randomly selected Card
 		Card temp = deck[ first ]; 
 		deck[ first ] = deck[ second ];
 		deck[ second ] = temp; 
 	} // end for
    } // end method shuffle
    
    public Card dealCard()
    {
        // determine whether Cards remain to be dealt
        if ( currentCard < deck.length )
            return deck[ currentCard++ ]; // return current Card in array
        else
            return null; // return null to indicate that all Cards were dealt
    } // end method dealCard
}


public class Example_Array_CardShuffling {

   
    public static void main(String[] args) {
       
        DeckOfCards myDeckofCards = new DeckOfCards();
        myDeckofCards.shuffle();
        
        //print all 52 cards in the order in which they are dealth
        for(int i = 1; i < 52; i++)
        {
            //deal and display a card
            System.out.printf("%-19s", myDeckofCards.dealCard());
            
            if (i % 4 ==0) //newline after every four cards
                System.out.println();
        }
    }
}
