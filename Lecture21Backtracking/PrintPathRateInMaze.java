package Lecture21Backtracking;

import static Lecture21Backtracking.RatinMaze.printPath;

public class PrintPathRateInMaze {
    public static void findDirection(int row ,int col ,int[][] maze , int[][] path){
        if( row < 0 || col < 0 || row > 2 || col > 2 || maze[row][col] == 0 || path[row][col] == 1 )
            return;

        // adding cell to the route
        path[row][col] = 1;


        //if dstination reached
        if (row == 2 && col == 2){
            printPath(path);
            path[row][col]=0;
            return;
        }
        // checking top
        findDirection(row ,col-1 ,maze ,path);

        // checking right
        findDirection(row + 1,col ,maze ,path);

        // checking down
        findDirection(row ,col+1 ,maze ,path);

        // checking left
        findDirection(row -1 ,col ,maze ,path);
        path[row][col] = 0;
    }
    public static void findPath(int[][] array){
        int n = array.length;
        int[][] path = new int[n][n];

        findDirection(0,0,array,path);
    }
    public static void main(String[] args) {
//        int[][] array = {{1,0,1},{1,0,1},{1,1,1}};
        int[][] array = {{1,0,1},{1,1,1},{1,1,1}};

        findPath(array);
    }
}
