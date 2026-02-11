//  Write a program to print reverse alphabets from Z to A

import java.util.Scanner;
public class ReverseAlphabets{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        char ch='z';

        while(ch>='a'){
            System.out.println(ch);
            ch--;
        }

    }
}
