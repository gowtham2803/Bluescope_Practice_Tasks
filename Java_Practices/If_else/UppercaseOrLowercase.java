//  Write a program to check whether a character is uppercase or lowercase alphabet

import java.util.Scanner;
public class UppercaseOrLowercase{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the letter/number/special character :");
        char ch = s.next().charAt(0);

        if(ch>='A' && ch<='Z'){
            System.out.println("This is Uppercase");
        }
        else{
            System.out.println("This is lowercase");
        }

    }
}