//    Matrix Sum of Array with 3 Rows and 3 Columns

public class Matrix{
    public static void main(String [] args){

        int [][] a = { {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12} };

//int rows = a.length;
//int column = a[0].length;

        for (int i=0; i<a[i].length; i++){
            int count = 0;
            for (int j=0; j<a.length; j++){
                count += a[j][i];
            }
            System.out.println("Column  "+(i+1)+" value is :  "+count);
        }


    }
}