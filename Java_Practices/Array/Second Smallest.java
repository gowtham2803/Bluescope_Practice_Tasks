//    Find Second Smallest nummber

public class SecondSmallest{
    public static void main(String[] args) {
        int [] num = {20,56,555,45,3};
        int small = num[0];
        int secondsmall = num[1];

        for(int i = 1; i<num.length; i++){
            if(num[i] < small){
                small = num[i];
            }
        }
        for(int i =0; i<num.length; i++){
            if (num[i] > small && num[i] < secondsmall){
                secondsmall = num[i];
            }
        }
        System.out.println("The Second Smallest number is : "+secondsmall);
    }
}