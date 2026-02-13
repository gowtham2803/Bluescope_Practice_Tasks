// Check whether a character is a vowel or consonant using switch case.

import java.util.Scanner;
public class VowelOrConsonant{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the Letter :");
        char let = s.next().charAt(0);

        switch (let) {

            case 'A' : case 'E' : case 'I' : case 'O' : case 'U' :
                System.out.println("Uppercase Vowels");
                break;
            case 'a' : case 'e' : case 'i' : case 'o' : case 'u' :
                System.out.println("Lowercase Vowels");
                break;
            default :
                if(Character.isLetter(let)){
                    System.out.println("Consonant");
                }
                else{
                    System.out.println("Invalid Entry");
                }
        }

    }
}