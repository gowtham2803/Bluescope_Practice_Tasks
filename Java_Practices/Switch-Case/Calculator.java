// Write a program to make a simple calculator using switch case.

import java.util.Scanner;
public class Calculator{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the First number :");
        int num1 = s.nextInt();
        System.out.print("Enter the Second Number :");
        int num2 = s.nextInt();

        System.out.println("Select the One Operator = +,-,*,/");
        char op = s.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Total Sum of values is :"+(num1+num2));
                break;
            case '-':
                System.out.println("Subraction Value is :"+(num1-num2));
                break;
            case '*':
                System.out.println("Subraction Value is :"+(num1*num2));
                break;
            case '/':
                System.out.println("Subraction Value is :"+(num1/num2));
                break;
            default:
                System.out.println("Enter the Valid input");
        }

    }
}
