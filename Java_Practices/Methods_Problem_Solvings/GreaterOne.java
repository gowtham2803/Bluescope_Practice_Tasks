//Take Two numbers and return the greater one

import java.util.Scanner;
class greater{
    Scanner s=new Scanner(System.in);

    public int nums(){

        System.out.print("Enter the num1 :  ");
        int num1 = s.nextInt();
        System.out.print("Enter the num2 :  ");
        int num2 = s.nextInt();

        if(num1>num2){
            return num1;
        }
        else{
            return num2;
        }
    }
}

public class GreaterOne{
    public static void main(String [] args){

        greater g=new greater();
        int res = g.nums();
        System.out.println("The biggest value is :  "+res);

    }
}