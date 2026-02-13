//      Matrix Multiplication

public class MatrixMultiplication{
    public static void main(String [] args){

        int [][] a = { {1,2,3},
                {4,5,6} };

        int [][] b = { {7,8},
                {9,10},
                {11,12} };

        int rowsa = a.length;
        int colsa = a[0].length;
        int rowsb = b.length;
        int colsb = b[0].length;

        int [][] c = new int [rowsa][colsb];

        for(int i=0; i<rowsa; i++){
            for(int j=0; j<colsb; j++){
                c[i][j] = 0;
                for(int k=0; k<colsa; k++){
                    c[i][j] += a[i][k]*b[k][j];
                }
            }
        }

        System.out.println("Result Matrix");

        for(int i=0; i<rowsa; i++){
            for(int j=0; j<colsb; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
}
