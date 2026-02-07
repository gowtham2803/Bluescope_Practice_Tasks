// 3. Write a program to check whether a number is negative, positive or zero

import java.io.*;
import java.util.Scanner;

public class CheckNumber{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the Number :");
        int num = s.nextInt();

        if(num>0){
            System.out.println("The Number is Positive :"+num);
        }
        else if(num<0){
            System.out.println("The Number is Negative :"+num);
        }
        else{
            System.out.println("The Number is Zero");
        }

    }
}