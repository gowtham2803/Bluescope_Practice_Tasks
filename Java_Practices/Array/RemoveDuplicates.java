//      Remove duplicates in an array

public class RemoveDuplicates{
    public static void main(String [] args){

        int [] num = {1,2,3,3,4,5,6};
        int [] arr = new int [6];
        int k =0;

        for(int i=0; i<num.length; i++){
            String duplicate = "no";
            for(int j=0; j<arr.length; j++){
                if(num[i]==arr[j]){
                    duplicate = "yes";
                    break;
                }
            }
            if(duplicate == "no"){
                arr[k] = num[i];
                k++;
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}