package Lecture_11;

public class SpiralMatrixPrint {
    public static void printSpiralMatrix(int [][] array) {
        int Totalelements = array.length * array[0].length;
        int count = 0;
        int rowT = array.length - 1;
        int colT = array[0].length - 1;
        int row = 0;
        int col = 0;

        while (count < Totalelements){
            // go right row  cons      col increment
            for (int i = col; i <= colT; i++) {
                System.out.print(array[row][i]+" ");
                count++;
            }
            row++;
            // go down  row incre     col const
            for (int i = row; i <= rowT ; i++) {
                System.out.print(array[i][colT]+" ");
                count++;
            }
            colT--;
            // go left  row  cont     col decre
            for (int i = colT; i >= col ; i--) {
                System.out.print(array[rowT][i]+" ");
                count++;
            }
            rowT--;
            // go top   i decre    j const
            for (int i = rowT; i >=row ; i--) {
                System.out.print(array[i][col]+" ");
                count++;
            }
            col++;
        }

    }
    public static void main(String[] args) {
//        int[][] array = {{1, 2, 3, 4},{5 ,6 ,7 ,8},{9 ,10 ,11 ,12}, {13, 14, 15, 16}};
//        int[][] array = {{1, 2, 3},{4 ,5 ,6}, {7 ,8 ,9}};
        int[][] array = {{10},{20},{30}};
        printSpiralMatrix(array);
    }
}
