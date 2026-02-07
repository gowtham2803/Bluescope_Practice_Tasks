// Write a program to check whether a number is even or odd

import java.io.*;
import java.util.Scanner;

public class EvenOdd{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the Number :");
        int num = s.nextInt();

        if(num%2==0){
            System.out.println("The Number is Even :"+num);
        }
        else{
            System.out.println("The Number is Odd :"+num);
        }

    }
}