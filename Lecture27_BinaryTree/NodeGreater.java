package Lecture27_BinaryTree;
// find the number of nodes which are greater than X
public class NodeGreater {
    public static int findLargestCount(BinaryTreeNode<Integer> root , int x){
        int count = 0;
        if (root == null)
            return 0;
        if (root.data > x)
            count++;
        count += findLargestCount(root.leftNode , x);
        count += findLargestCount(root.rightNode , x);

        return count;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeNodeUse.takeBinaryTreeInputBetter();
        int k = 0;   // nodes greater than K
        int cout = findLargestCount(root , k);
        System.out.println("No of Nodes Greater Than "+ k +" are :"+ cout);
    }
} // 3 2 5 -1 -1 -1 1 7 10 -1 -1 -1 9 -1 -1
