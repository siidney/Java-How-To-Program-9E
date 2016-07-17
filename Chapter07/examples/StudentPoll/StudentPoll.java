/*
 *       Filename:  StudentPoll.java
 *
 *    Description:  7.8 - Poll analysis program
 *
 *        Created:  16/10/15 16:04:53
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class StudentPoll{
    public static void main(String[] args){
        int[] responses = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
        int[] frequency = new int[6];

        for(int answer=0; answer<responses.length; answer++){
            try{
                ++frequency[responses[answer]];
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.printf("\tresponse[%d] = %d\n\n",
                        answer, responses[answer]);
            }
        }
        System.out.printf("%s%10s\n", "Rating", "Frequency");

        for(int rating=1; rating<frequency.length; rating++){
            System.out.printf("%6d%10d\n", rating, frequency[rating]);
        }
    }
}
