package Lecture_11;
public class rowSum {

    public static void print1DArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static int[] sumOfRows2dArray(int [][] array){
        int[] sum = new int[array.length];
        int count = 0 ;
        for (int i = 0; i < array.length; i++) {
            int total =0 ;
            for (int j = 0; j < array[0].length; j++) {
                total+=array[i][j];
            }
            sum[count]= total;
            count++;
        }
        return sum;
    }
    public static void main(String[] args) {
        //int[][] array = {{1,2},{3,4},{5,6},{7,8}};
        //int[][] array = {{4,5,3,2,6},{7,5,3,8,9}};
        int[][] array = {{1,2,3,4},{9,8,7,6},{3,4,5,6},{-1,1,-10,5}};
        int[] sunOfRows =  sumOfRows2dArray(array);
        print1DArray(sunOfRows);
    }
}
