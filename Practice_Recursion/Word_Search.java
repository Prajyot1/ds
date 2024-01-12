package Practice_Recursion;

public class Word_Search {
    public static boolean exist(char[][] board, String word) {
        return existH(board,word,0,0 , "");
    }
        public static boolean existH(char[][] board , String word , int i , int j , String ans){
            // base
            if (ans == word) return true;
            if (i >= board.length || j >= board.length || i < 0 | j < 0) return false;
            // go rigth
            char ch = board[i][j];
            boolean b1 = existH(board,word,i,j+1,ch + ans);
            // go down
            boolean b2 = existH(board,word,i+1,j,ch + ans);
            // go left
            boolean b3 = existH(board,word,i,j-1,ch + ans);
            return (b1 || b2 || b3);
        }
        public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String  word = "ABCCED";
            System.out.println(exist(board,word));
    }
}
