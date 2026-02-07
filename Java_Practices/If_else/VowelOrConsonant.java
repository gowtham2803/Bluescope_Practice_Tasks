//  Write a program to input any alphabet and check whether it is vowel or consonant

import java.util.Scanner;

public class VowelOrConsonant{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the String :");
        char word = s.next().charAt(0);

        if (((word >= 'a' && word <= 'z') || (word >= 'A' && word <= 'Z')) &&
                (word=='a'||word=='e'||word=='i'||word=='o'||word=='u'||
                        word=='A'||word=='E'||word=='I'||word=='O'||word=='U')) {
            System.out.println("The character is an Alphabet and a Vowel");
        }
        if ((word >= 'a' && word <= 'z') || (word >= 'A' && word <= 'Z')) {
            System.out.println("The character is an Alphabet and a Consonant");
        }
        else {
            System.out.println("Not an Alphabet");
        }
    }
}