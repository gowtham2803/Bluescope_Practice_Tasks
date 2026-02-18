//      Find the maximum Element in 2-D array


public class FindMaximum{
    public static void main(String [] args){

        int [][] a = { {1,8,3},
                {4,5,6} };

        int count = 0;

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                if(count<=a[i][j]){
                    count = a[i][j];
                }
            }
        }

        System.out.println("The maximum element is : "+count);

    }
}
