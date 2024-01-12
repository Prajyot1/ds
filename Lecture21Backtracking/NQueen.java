package Lecture21Backtracking;

public class NQueen {
    public static void placeQueen(int[][] board,int row , int col, int n ){
        // check if all queen placed
        if(row == n){
            return;
        }
        //check col
        boolean colFree = true;
        for (int i = 0; i < n ; i++) {
            if(board[i][col] == 1){
                colFree = false;
                break;
            }
        }
        // check row

        }
        // place queen



    public static void placeQueenUtility(int[][] array){
        int n = array.length;
        int Qplaced =0;
        placeQueen(array,0,0,n);
    }
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        placeQueenUtility(array);
    }
}
