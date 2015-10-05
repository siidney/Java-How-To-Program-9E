/*
 *       Filename:  EncrypyDecrypt.java
 *
 *    Description:  4.38 - Encrypt and decrypt four digit integers.
 *
 *        Created:  02/10/15 18:46:42
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class EncrypyDecrypt{
    // ensure number is of length 4
    public boolean validate(int value){
        String aString = Integer.toString(value);

        if(aString.length() == 4)
            return true;
        else
            return false;
    }
    // 1. Replace each digit with the result of adding 7 to it and getting the
    //    remainder after dividing the new value by 10
    public int encrypt(int value){
        int arrValue[] = new int[4];

        // countdown so as to not reverse the original order
        for(int i=3; i>=0; i--){
            arrValue[i] = value % 10;
            value /= 10;
        }

        arrValue = swapDigits(arrValue);

        for(int i=0; i<4; i++){
            arrValue[i] = (arrValue[i] + 7) % 10;
        }

       return toInt(arrValue);
    }
    public int decrypt(int value){
        int arrValue[] = new int[4];

        // countdown so as to not reverse the original order
        for(int i=3; i>=0; i--){
            arrValue[i] = value % 10;
            value /= 10;
        }

        arrValue = swapDigits(arrValue);

        for(int i=0; i<4; i++){
            arrValue[i] = (arrValue[i] * 10) + 7;
            System.out.println(arrValue[i]);
        }

        return toInt(arrValue);
    }
    // 2. swap the first and third, second and fourth digits
    private int[] swapDigits(int[] arrValue){
        // swap first with third
        int tempValue = arrValue[0];
        arrValue[0] = arrValue[2];
        arrValue[2] = tempValue;

        // swap second with fourth
        tempValue = arrValue[1];
        arrValue[1] = arrValue[3];
        arrValue[3] = tempValue;

        return arrValue;
    }
    // 3. print result
    private int toInt(int[] arrValue){
        // convert int[] to int
        StringBuilder temp = new StringBuilder();

        for(int i=0; i<arrValue.length; i++){
            temp.append(arrValue[i]);
        }

        return Integer.parseInt(temp.toString());
    }
}
