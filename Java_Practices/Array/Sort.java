//      Sort an array

public class Sort{
    public static void main(String [] args){

        int [] num = {1,3,2,4,5};

        for(int i=0; i<num.length; i++){
            for(int j=i+1; j<num.length; j++){
                if(num[i]>=num[j]){
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }

    }
}
