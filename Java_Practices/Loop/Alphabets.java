//  Write a program to print all alphabets from a to z

import java.util.Scanner;
public class Alphabets{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        char let;
        for (let = 'a'; let<='z'; let++){
            System.out.println(let);
        }
    }
}
