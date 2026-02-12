//  Delete the particular number in an array

import java.util.Scanner;
public class DeleteNumber
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int [] arr = {1,2,3,4,5};
        int [] newarr = new int [4];

        System.out.print("Enter the num to delete : ");
        int num = s.nextInt();
        int j = 0;

        for (int i=0;i<arr.length;i++){
            if(arr[i]!=num){
                newarr[j] = arr[i];
                j++;
            }
        }
        for(int i=0;i<newarr.length;i++){
            System.out.println(newarr[i]);
        }

    }
}