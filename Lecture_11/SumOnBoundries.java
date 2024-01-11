package Lecture_11;

public class SumOnBoundries {
    public static void sumOnBoundaries(int[][] array){
        int sum=0;
        int colsize = array.length ;
        int rowSize = array[0].length;

        // top array boundary
        for (int i = 0; i < colsize; i++) {
                sum+=array[0][i];
            }
        // bottom array boundry
        for (int i = 0; i < colsize ; i++) {
            sum += array[rowSize-1][i];
        }
        // left Boundary
        for (int i = 1; i < colsize-1; i++) {
            sum += array[i][0];
        }
        // right Boundry
        for (int i = 1; i < rowSize -1; i++) {
            sum += array[i][rowSize-1];
        }
        System.out.println("Sum Of Boundry "+sum);

        // sum of diagonals except boundary element
        // first if odd rows
        if(rowSize % 2 == 1) {
            for (int i = 1; i < rowSize - 1; i++) {
                sum += array[i][i];
            }
            // second
            for (int i = 1; i < colsize - 1; i++) {
                for (int j = rowSize - 2; j > 0; j--) {
                    sum += array[i][j];
                }
            }
        }
        else {
            for (int i = 1; i < rowSize - 1; i++) {
                sum += array[i][i];
            }
            for (int i = 1; i < rowSize -1; i++) {
                for (int j = rowSize - 2; j > 0 ; j--) {
                    if ((i+j)==rowSize-1){
                        sum += array[i][j];
                    }
                }
            }
        }
        System.out.println("sum Of total :" + sum);
    }

    public static void main(String[] args) {
        //int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] array = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        //int[][] array = {{1,2,3,10},{4,5,6,11},{7,8,9,12},{13,14,15,16}};
        sumOnBoundaries(array);
    }
}
