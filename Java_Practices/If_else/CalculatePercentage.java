//  Write a program to input marks of five subjects. Calculate percentage and grade according to following:

import java.util.Scanner;
public class CalculatePercentage{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the Mark of Physics :");
        int p = s.nextInt();
        System.out.print("Enter the Mark of Chemistry :");
        int c = s.nextInt();
        System.out.print("Enter the Mark of Biology :");
        int b = s.nextInt();
        System.out.print("Enter the Mark of Mathematics :");
        int m = s.nextInt();
        System.out.print("Enter the Mark of Computer :");
        int computer = s.nextInt();
        System.out.println();

        int total = p+c+b+m+c;
        int percentage = total/5;

        if(percentage>=90){
            System.out.println("Grade A");
        }
        else if(percentage>=80){
            System.out.println("Grade B");
        }
        else if(percentage>=70){
            System.out.println("Grade C");
        }
        else if(percentage>=60){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Grade E");
        }

    }
}