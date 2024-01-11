package Lecture_11;
public class Wave {
    public static void printColStraight(int [][] arr ,int row){
        int colSize = arr.length;
        for (int i = 0; i < colSize; i++) {
            System.out.print(arr[i][row]+" ");
        }
    }
    public static void printColReverse(int [][] arr , int row) {
        int colSize = arr.length;
        for (int i = colSize - 1; i >= 0; i--) {
            System.out.print(arr[i][row] + " ");
        }
    }
        public  static  void printWave(int[][]arr) {
        int rowSize = arr[0].length;
            for (int i = 0; i < rowSize;) {
                printColStraight(arr , i);
                i++;
                if (i < rowSize){
                printColReverse(arr , i);
                i++;}
            }
    }

    public static void wavePrint(int[][] arr){
        int col = 0;
        for (int i = 0; i < arr[0].length ; i++) {
            if (i%2 == 0){
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j][i]+" ");
                }
            }  //can be taken else
            if (i%2==1){
                for (int j = arr.length-1; j >= 0 ; j--) {
                    System.out.print(arr[j][i]+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
       // int[][] array = {{1 , 2 , 3 , 4},{5 , 6 , 7 , 8},{9 ,10 ,11, 12}};
      int [][] array = {{1, 2, 3},{4 ,5 ,6}, {7 ,8 ,9}, {10 ,11, 12},{13 ,14 ,15}};
     // int[][] array = {{10 ,20 ,30},{40 ,50, 60}, {70 ,80, 90}};
      wavePrint(array);
    }
}
