// Write a program to print the ASCII values

import java.util.Scanner;
public class ASCII{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the Upto Number :");
        int num = s.nextInt();

        for (int i=1;i<=num;i++){
            System.out.println((char)i);
        }

    }
}
