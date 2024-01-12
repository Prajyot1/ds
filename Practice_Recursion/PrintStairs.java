package Practice_Recursion;
// person is going from up to down print his path
// he can take 1 , 2 , 3 steps at one time
public class PrintStairs {
    public static void printStairsPath(int num , String path){
        // base
        if (num < 0) return;
        if (num == 0){
            System.out.println(path);
            return;
        }

        printStairsPath(num-1 , 1 + path);
        printStairsPath(num-2 , 2 + path);
        printStairsPath(num-3, 3 + path);

    }
    public static void main(String[] args) {
        int noOfStairs = 5;
        printStairsPath(noOfStairs, "");
    }
}
