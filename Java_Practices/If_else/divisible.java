// Write a program to check whether a number is divisible by 5 and 11 or not

import java.io.*;
import java.util.Scanner;

public class divisible{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the Number :");
        int num = s.nextInt();

        if(num%5==0){
            System.out.println("Yes,The number is Divisible by 5");
        }
        else if (num%11==0){
            System.out.println("Yes,The number is Divisible by 11");
        }
        else{
            System.out.println("No, The Number is not Divisible by both 5 and 11");
        }

    }
}