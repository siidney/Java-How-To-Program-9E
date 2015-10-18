/*
 *       Filename:  DeckOfCards.java
 *
 *    Description:  7.10 - represents a deck of playing cards
 *
 *        Created:  16/10/15 17:01:53
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Random;

public class DeckOfCards{
    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private static final Random randomNumbers = new Random();

    public DeckOfCards(){
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
                          "Seven", "Eight", "Nine", "Ten", "Jack", "Queen",
                          "King"};
        String[] suits = {"Hearts", "Diamond", "Clubs", "Spades"};

        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;

        // populate deck with Card objects
        for(int count=0; count<deck.length; count++){
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        }
    }
    // shuffle deck of Cards with one-pass algorithm
    public void shuffle(){
        currentCard = 0;

        for(int first=0; first<deck.length; first++){
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            // swap current card with randomly selected one
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }
    // deal one card
    public Card dealCard(){
        if(currentCard < deck.length)
            return deck[currentCard++];
        else
            return null;
    }
}
