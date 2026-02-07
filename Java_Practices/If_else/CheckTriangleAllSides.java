//  Write a program to input all sides of a triangle and check whether triangle is valid or not

import java.util.Scanner;
public class CheckTriangleAllSides{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the Scale of Left :");
        int left = s.nextInt();
        System.out.print("Enter the Scale of Right :");
        int right = s.nextInt();
        System.out.print("Enter the Scale of Bottom :");
        int bottom = s.nextInt();

        if((left+right)>bottom){
            if((right+bottom)>left){
                if((left+bottom)>right){
                    System.out.println("Triangle Valid");
                }
                else{
                    System.out.println("Triangle Invalid");
                }
  else{
                    System.out.println("Triangle Invalid");
                }
            }
            else{
                System.out.println("Triangle Invalid");
            }

        }
    }