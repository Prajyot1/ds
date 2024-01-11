package Lecture_11;

public class RowOrColSum {
    public static void largestSum(int[][] arr) {
        int largestR = -9999;
        int RowIndex = -1;
        // checking rows
        for (int i = 0; i < arr.length; i++) {
            int total = 0;
            for (int j = 0; j < arr[i].length; j++) {
                total += arr[i][j];
            }
            if (total > largestR) {
                largestR = total;
                RowIndex = i;
            }
        }
        // checking cols
        int largestC = -9999;
        int ColIndex =-1;
        for (int i = 0; i < arr[0].length; i++) {
            int total = 0;
            for (int j = 0; j < arr.length; j++) {
                total += arr[j][i];
            }
            if (total > largestC) {
                largestC = total;
                ColIndex = i;
            }
        }
        if (largestR >= largestC)
            System.out.println("Row "+ RowIndex +" "+largestR);
        else
            System.out.println("Col "+ ColIndex + " "+largestC);
    }
    public static void main(String[] args) {
        //int[][] array = {{1,1},{1,1}};
        //int[][] array = {{3,6,9},{1,4,7},{2,8,9}};
        int[][] array = {{1,2},{90,100},{3,40},{-10,200}};
        largestSum(array);
    }
}
