//      Find the Second Smallest and Second Largest


public class SecondSmallestAndLargest	{
    public static void main(String [] args){

        int [] num = {1,2,3,4,5};

        int small = num[0];
        int large = num[0];
        int second_small = num[1];
        int second_large = num[1];

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

        for (int i=0; i<num.length; i++){
            if(small<num[i] && second_small>=num[i]){
                second_small = num[i];
            }
        }

        for (int i=0; i<num.length; i++){
            if (large>num[i] && second_large<=num[i]){
                second_large = num[i];
            }
        }

        System.out.println("The Second_Smallest number in the array is = :"+second_small);
        System.out.println("The Second_Largest number in the array is = :"+second_large);

    }
}