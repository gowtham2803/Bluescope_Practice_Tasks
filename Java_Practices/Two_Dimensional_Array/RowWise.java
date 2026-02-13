//      Row Wise Sum

public class RowWise{
    public static void main(String [] args){

        int [][] a = { {1,2,3},{4,5,6} };
        int row1 = 0;
        int row2 = 0;

        for (int i=0; i<a.length; i++){
            if(i==0){
                for (int j=0; j<a[i].length; j++){
                    row1 = row1 + a[i][j];
                }
            }

            else if(i==1){
                for (int j=0; j<a[i].length; j++){
                    row2 = row2 + a[i][j];
                }
            }

        }

        System.out.println("Row 1 Total Sum of value is :  "+row1);
        System.out.println("Row 2 Total Sum of value is :  "+row2);


    }
}