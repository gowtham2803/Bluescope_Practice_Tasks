// Write a program to check whether a character is alphabet or not

import java.io.*;
import java.util.Scanner;

public class Alphabet{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the Word :");
        char word =s.next().charAt(0);

        if((word>='a' && word<='z') || (word>='A' && word<='Z')){
            System.out.println("Yes,This is Alphabet");
        }
        else{
            System.out.println("No,This is Not Alphabet");
        }

    }
}