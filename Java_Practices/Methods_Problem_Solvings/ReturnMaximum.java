//Take an array and Return the maximum element

class maximum {

    int [] arr = {1,2,3,4,5};
    int maxval = 0;
    public void max(){

        for(int i=0; i<arr.length; i++){
            if(arr[i]>maxval){
                maxval = arr[i];
            }
        }
        System.out.println("The maximum value is : "+maxval);

    }
}

public class ReturnMaximum{
    public static void main(String [] args){
        maximum m1=new maximum();
        m1.max();
    }
}