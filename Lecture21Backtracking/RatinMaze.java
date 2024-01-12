package Lecture21Backtracking;
import java.util.Scanner;

public class RatinMaze {
    public static final Scanner sc = new Scanner(System.in);
    public static int[][] takeMaze(){
        int n = 3;
        int[][] maze = new int[n][3];
        System.out.println("Enter The maze :");
        for (int[] x: maze) {
            for (int y : x) {
                sc.nextInt();
            }// inner loop end
        } // outer loop end
        return maze;
    }// function end
    public static void printPath(int[][] path){
        for (int[] x: path) {
            for (int y: x) {
                System.out.print(y+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static boolean checkCell(int[][] maze , int Row , int Col , int[][] path) {
        // check IF cell is invalid
        int n = maze.length - 1;
        int m = maze[0].length- 1;
        if(Row < 0 || Row > n || Col < 0 || Col > m || maze[Row][Col]==0 || path[Row][Col] == 1)
            return false; // cell invalid

        // add in path since valid
        path[Row][Col]=1;

        // check if arrived at destination
        if (Row==n && Col==m){
            printPath(path);
            return true;  // destination arrived
        }

        // check next direction
        // check top
        if(checkCell(maze ,Row - 1 , Col ,path)){
            return true;
        }
        // check Right
        if(checkCell(maze ,Row  , Col + 1 ,path)){
            return true;
        }
        // check Down
        if(checkCell(maze ,Row + 1 , Col ,path)){
            return true;
        }
        // check Left
        if(checkCell(maze ,Row  , Col - 1 ,path)){
            return true;
        }
    return false;
    }
    public static boolean routeAval(int[][] maze)  {
        int n = maze.length;
        int[][] path = new int[n][n];

        return checkCell(maze , 0,0,path);
    }
    public static void main(String[] args) {
        //int [][] maze = takeMaze();
        //int[][] maze = {{1,0,1},{1,0,1},{1,1,1}};
        int[][] maze = {{1,1,0},{1,0,0},{1,1,1}};

        boolean ans = routeAval(maze);
        System.out.println(ans);
    }
}
