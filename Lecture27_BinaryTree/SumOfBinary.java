package Lecture27_BinaryTree;

public class SumOfBinary {
    public static int findSum(BinaryTreeNode<Integer> root){
        // base
        if (root == null) return 0;
        int left = findSum(root.leftNode);
        int right = findSum(root.rightNode);
        return root.data + left + right;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeNodeUse.takeBinaryTreeInputBetter();
        int ans = findSum(root);
        System.out.println("Binary tree sum is "+ ans);
    }
}
