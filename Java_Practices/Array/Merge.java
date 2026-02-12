//      Merge Two arrays in new array

public class Merge{
    public static void main(String [] args){

        int [] one = {1,2,3,4,5};
        int [] two = {6,7,8,9,10};
        int [] three = new int [one.length+two.length];

        int j = 0;

        for(int i=0; i<one.length; i++){
            three[j] = one[i];
            j++;
        }

        for(int i=0; i<two.length; i++){
            three[j] = two[i];
            j++;
        }

        for(int i=0; i<three.length; i++){
            System.out.println(three[i]);
        }

    }
}