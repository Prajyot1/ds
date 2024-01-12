package Lecture27_BinaryTree;

public class HeightOfTree {
    public static int findHeight(BinaryTreeNode<Integer> root){
        if (root == null)
            return 0;
        int leftHeight = findHeight(root.leftNode);
        int rightHeight = findHeight(root.rightNode);

        int height = Math.max(leftHeight,rightHeight);

        return (1 + height);
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeNodeUse.takeBinaryTreeInputBetter();
        int ans = findHeight(root);
        System.out.println("Height of the tree is "+ ans);
    }
}//     3 2 5 -1 -1 -1 1 7 10 -1 -1 -1 9 -1 -1
