/*
 *       Filename:  Card.java
 *
 *    Description:  7.9 - Class card represents a playing card
 *
 *        Created:  16/10/15 16:59:48
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class Card{
    private String face;
    private String suit;

    // constructor
    public Card(String face, String suit){
        // initialise
        this.face = face;
        this.suit = suit;
    }
    public String toString(){
        return face + " of " + suit;
    }
}
