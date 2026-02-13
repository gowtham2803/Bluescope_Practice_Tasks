//  Find the largerst and smallest number in array

public class LargerstSmallest{
    public static void main(String [] args){

        int [] num = {1,2,3,4,5};

        int small = num[0];
        int large = num[0];

        for(int i=1; i<num.length; i++){
            if(num[i]<small){
                small = num[i];
            }
        }

        for(int i=1; i<num.length; i++){
            if(num[i]>large){
                large = num[i];
            }
        }

        System.out.println("The Smallest number in the array is = :"+small);
        System.out.println("The Largest number in the array is = :"+large);

    }
}
