//  Write a program to input any character and check whether it is alphabet, digit or special character.

import java.util.Scanner;
public class AlphabetDigitOrSpecialCharacter{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the letter/number/special character :");
        char ch = s.next().charAt(0);

        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.println("This is Alphabet");
        }
        else if((ch>='0' && ch<='9') || ch<='0'){
            System.out.println("This is Number");
        }
        else{
            System.out.println("This is Special Character");
        }

    }
}