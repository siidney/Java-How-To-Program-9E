/*
 *       Filename:  EncryptDecryptTest.java
 *
 *    Description:  4.33 - Encrypt and decrypt four digit integers test.
 *
 *        Created:  02/10/15 18:52:08
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class EncryptDecryptTest{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        EncryptDecrypt ed = new EncryptDecrypt();

        int value = requestInput("Enter a 4 digit number for encryption: ", sc);

        while(ed.validate(value) != true){
            value = requestInput("Enter a 4 digit number for encryption: ", sc);
        }
        int encrypted = ed.encrypt(value);
        int decrypted = ed.decrypt(encrypted);

        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
    public static int requestInput(String s, Scanner sc){
        System.out.print(s);
        return sc.nextInt();
    }
}
