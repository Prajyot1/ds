package Lecture_11;

import java.util.Scanner;

public class Array2d {
    public static int[][] input2DArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of rows ");
        int rows = sc.nextInt();
        System.out.println("Enter No of cols ");
        int cols = sc.nextInt();
        int[][] array = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter Element at "+i+" row and "+j+" col");
                array[i][j]=sc.nextInt();
            }
        }
        return array;
    }
    public static void print2DArray(int[][] array ){
        int rows = array.length;
        int cols = array[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] array = input2DArray();
        print2DArray(array);
    }
}
