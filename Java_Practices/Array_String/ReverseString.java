//      Reverse a string in an array

public class ReverseString{
    public static void main(String [] args){

        String [] name = {"Gowtham","Stark","Pepper","Potts"};
        String [] arr = new String [name.length];
        int j = 0;

        for (int i=name.length -1; i>=0; i--){
            arr[j] = name[i];
            j++;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
