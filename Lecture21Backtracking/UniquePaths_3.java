package Lecture21Backtracking;

public class UniquePaths_3 {
    static int ans = 0;
    public static int uniquePathsIII(int[][] grid) {
        int row = 0;
        int col = 0;
        boolean found = false;
        for(int i = 0; i < grid.length; i++){
            for(int j= 0; j < grid[0].length;j++){
                if(grid[i][j] == 1){
                    row = i;
                    col = j;
                    break;
                }
            }// end inner for
            if(found) break;
        }// end outer for
        help(grid,row , col);
        return ans;
    }
    private static void help(int[][] grid , int row , int col){
        //base
        if(row >= grid.length || row < 0 ||
                col >= grid[0].length || col < 0 ||
                grid[row][col] == -1 || grid[row][col] == 5){
            return;
        }
        if(grid[row][col] == 2){
            ans++;
            return;
        }
        grid[row][col] = 5;
        // top
        help(grid , row-1 ,col);
        // right
        help(grid , row ,col+1);
        // bottom
        help(grid , row+1 ,col);
        //left
        help(grid , row ,col-1);

        grid[row][col] = 0;

    }
    public static void main(String[] args) {
        int[][] grid = {{1,0,0,0},{0,0,0,0},{0,0,2,-1}};
        uniquePathsIII(grid);
        System.out.println(ans);
    }
}
