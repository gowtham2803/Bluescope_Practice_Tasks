//Calculate Average of number passed as arguments

import java.util.Scanner;
class average{
    Scanner s=new Scanner(System.in);

    public int num1;
    public int num2;

    public int nums(int x,int y){

        int num1 = x;
        int num2 = y;

        int sum = num1 + num2;
        int avg = sum / 2;

        return avg;

    }
}

public class Average{
    public static void main(String [] args){

        average a=new average();
        int res = a.nums(10,20);
        System.out.println("The average is :  "+res);

    }
}