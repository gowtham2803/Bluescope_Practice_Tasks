//      Reverse a array and also reverse string in an array

public class ReverseArrayAndString{
    public static void main(String [] args){

        String [] name = {"Gowtham","Stark","Pepper","Potts"};
        String [] arr = new String [name.length];
        int k = 0;
        String reverse = "";

        for (int i=name.length -1; i>=0; i--){
            String temp = name[i];
            for(int j=temp.length() -1; j>=0; j--){
                reverse = reverse + temp.charAt(j);
            }
            arr[k] = reverse;
            k++;
            reverse = "";

        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}