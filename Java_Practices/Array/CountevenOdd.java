//  Count even and odd number in an array


public class CountevenOdd{
    public static void main(String [] args){

        int [] num = {1,2,2,3,4,5,6,7,8,9,10};
        int even = 0;
        int odd = 0;
        for(int i=0; i<num.length; i++){
            if(num[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }

        System.out.println("Total Even Numbers :"+even);
        System.out.println("Total Odd Numbers :"+odd);

    }
}
