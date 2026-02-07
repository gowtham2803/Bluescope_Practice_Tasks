//  Write a program to input angles of a triangle and check whether triangle is valid or not

import java.util.Scanner;
public class CheckTriangle{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the Scale of Left :");
        int left = s.nextInt();
        System.out.print("Enter the Scale of Right :");
        int right = s.nextInt();
        System.out.print("Enter the Scale of Bottom :");
        int bottom = s.nextInt();

        int sum = left + right + bottom;
        if (sum == 180 && left>0 && right > 0 && bottom > 0){
            System.out.println("This Triangle is Valid");
        }
        else{
            System.out.println("This Triangle is Invalid");
        }

    }
}