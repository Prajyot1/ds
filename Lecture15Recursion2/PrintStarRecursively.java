package Lecture15Recursion2;

public class PrintStarRecursively {
    public static void printStar(int row , int col){
        if (row == 0) return;
        if (col == row){
            System.out.println();
            printStar(row-1, 0);
        }
        if(col < row){
            System.out.print("* ");
            printStar(row,col+1);
        }
    }
    public static void printStarInverse(int row , int col){
        if (row == 0) return;

        if(col < row){
            printStar(row,col+1);
            System.out.print("* ");
        }
        else {
            printStar(row-1, 0);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // pritn start
        int row = 4 ;
//        printStar(row , 0);
        printStarInverse(row,0);
    }
}
