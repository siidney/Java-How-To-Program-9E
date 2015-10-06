/*
 *       Filename:  EncrypyDecryptTest.java
 *
 *    Description:  4.338 - encrypt and decrypt four digit integers.
 *
 *        Created:  02/10/15 18:52:08
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class EncrypyDecryptTest{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        EncrypyDecrypt ed = new EncrypyDecrypt();

        int value;

        prompt();
        value = sc.nextInt();

        while(ed.validate(value) != true){
            prompt();
            value = sc.nextInt();
        }
        int encrypted = ed.encrypt(value);
        int decrypted = ed.decrypt(encrypted);

        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
    public static void prompt(){
        System.out.print("Enter a four digit integer for encryption: ");
    }
}
