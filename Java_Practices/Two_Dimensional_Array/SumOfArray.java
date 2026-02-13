//  Sum of 1st array 1st value and 2nd array 2nd value

public class SumOfArray{
    public static void main(String [] args){

        int [][] a = { {1,2,3},
                {4,5,6} };
        int [][] b = { {10,20,30},
                {40,50,60} };

        int [][] c = new int [2][3];

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                c[i][j] = a[i][j]+b[i][j];
            }
        }

        for(int i=0; i<c.length; i++){
            for(int j=0; j<c[i].length; j++){
                System.out.print(c[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
