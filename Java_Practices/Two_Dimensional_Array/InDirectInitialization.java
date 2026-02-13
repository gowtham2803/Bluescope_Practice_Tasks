//      Print 2-D Array With InDirect Initialization

import java.util.Scanner;
public class InDirectInitialization{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the Row Range : ");
        int row = s.nextInt();
        System.out.print("Enter the Column Range : ");
        int col = s.nextInt();

        int [][] a=new int [row][col];

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                System.out.print("Enter the number to array : ");
                a[i][j]=s.nextInt();
            }
        }

        System.out.println("Print the Result");

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }

    }
}