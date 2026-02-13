//  Check if array is sorted or not ?

public class SortedOrNot{
    public static void main(String [] args){

        int [] num = {1,2,4,8,15};
        int start = num[0];
        int count = 0;

        for (int i=1; i<num.length; i++){
            if(num[i]>=start){
                start = num[i];
                count++;
            }
        }
        if(num.length - 1 == count){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not  Sorted");
        }

    }
}