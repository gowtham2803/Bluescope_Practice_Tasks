//  Search a number in the array

import java.util.Scanner;
public class SearchNumber
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int [] arr = {1,2,3,4,5};

        System.out.println("Enter the number to search ");
        int num = s.nextInt();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                System.out.println("yes, The number is here in array");
                System.out.println("The Index value is :"+i);

            }
        }
    }
}
