Factorial number total printing

import java.util.Scanner;
public class Factorial{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the Factorial Number : ");
        int num = s.nextInt();
        int total = 1;

        for(int i =1; i<=num; i++){
            total = total * i;
        }
        System.out.println("Factorial of"+" "+num+" "+"is"+" "+total);

    }
}
