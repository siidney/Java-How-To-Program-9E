/*
 *       Filename:  DeckOfCardsTest.java
 *
 *    Description:  7.11 - Card shuffling and dealing
 *
 *        Created:  18/10/15 01:33:44
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class DeckOfCardsTest{
    public static void main(String[] args){
        DeckOfCards myDeckOfCards = new DeckOfCards();

        myDeckOfCards.shuffle();

        for(int i=0; i<=52; i++){
            System.out.printf("%-19s", myDeckOfCards.dealCard());

            // newline every fourth card
            if(i % 4 == 0)
                System.out.println();
        }
    }
}
