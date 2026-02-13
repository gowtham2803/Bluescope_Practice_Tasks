//  Find Diagonal of an array *primary *Secondary *total


public class Diagonal{
    public static void main(String [] args){

        int [][] a = { {1,2,3},
                {4,5,6},
                {7,8,9} };
        int len = a.length;
        int primary = 0;
        int secondary = 0;

        for(int i=0; i<a.length; i++){
            primary += a[i][i];
            secondary += a[i][len - 1 - i];
        }

        System.out.println("Primary is  : "+primary);
        System.out.println("Primary is  : "+secondary);
        System.out.println("Primary is  : "+(primary+secondary)-5);

    }
}