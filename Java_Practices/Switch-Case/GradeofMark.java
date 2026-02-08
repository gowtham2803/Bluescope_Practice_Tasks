// Write a program to print grade based on marks using switch case.

import java.util.Scanner;
public class GradeofMark{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the Mark (0-100) :");
        int mark=s.nextInt();

        switch (mark / 10) {

            case 10 :
            case 9 : System.out.println("Grade A"); break;
            case 8 : System.out.println("Grade B"); break;
            case 7 : System.out.println("Grade C"); break;
            case 6 : System.out.println("Grade D"); break;
            case 5 : System.out.println("Grade E"); break;
            default : System.out.println("Fail");
        }

    }
}
