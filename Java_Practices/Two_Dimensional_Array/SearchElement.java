//      Search an Element in an array

import java.util.Scanner;
public class SearchElement{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        int [][] a = { {1,2,3},
                {4,5,6} };

        System.out.print("Enter the Element :  ");
        int num = s.nextInt();
        int count = 0;

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                if(num==a[i][j]){
                    System.out.println("Yes, found at index a[" + i + "][" + j + "]");
                    count++;
                    break;
                }
            }
        }
        if(count!=0){
        }
        else{
            System.out.println("No");
        }

    }
}