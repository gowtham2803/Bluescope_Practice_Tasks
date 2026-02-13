//      Column Wise Sum

public class ColumnWise{
    public static void main(String [] args){

        int [][] a = { {1,2,3},
                {4,5,6} };

        int rows = a.length;
        int column = a[0].length;

        for (int i=0; i<column; i++){
            int count = 0;
            for (int j=0; j<rows; j++){
                count += a[j][i];
            }
            System.out.println("Column"+(i+1)+" value is :  "+count);
        }


    }
}