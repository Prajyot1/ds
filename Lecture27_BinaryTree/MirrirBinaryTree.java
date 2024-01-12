package Lecture27_BinaryTree;

public class MirrirBinaryTree {
    public static void mirrorTree(BinaryTreeNode<Integer> root){
        if (root == null)
            return;

        mirrorTree(root.rightNode);
        mirrorTree(root.leftNode);
        BinaryTreeNode<Integer> temp = root.leftNode;
        root.leftNode = root.rightNode;
        root.rightNode = temp;
//        return root;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeNodeUse.takeBinaryTreeInputBetter();
//        BinaryTreeNode<Integer> nRoot = mirrorTree(root);
        mirrorTree(root);
        BinaryTreeNodeUse.printBinaryBetter(root);
    }
}
//  10 20 30 -1 -1 40 -1 -1 50 -1 -1