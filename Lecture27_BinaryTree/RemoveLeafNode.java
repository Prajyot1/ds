package Lecture27_BinaryTree;

public class RemoveLeafNode {
    public static BinaryTreeNode<Integer> removeLeaf(BinaryTreeNode<Integer> root){
        if (root == null)
            return null;
        if (root.leftNode== null & root.rightNode== null){
            return null;
        }
        root.leftNode = removeLeaf(root.leftNode);
        root.rightNode = removeLeaf(root.rightNode);
        return root;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeNodeUse.takeBinaryTreeInputBetter();
        BinaryTreeNode<Integer> nRoot = removeLeaf(root);
        BinaryTreeNodeUse.printBinaryBetter(nRoot);
    }
}// data     10 20 60 -1 70 -1 -1 80 -1 -1 30 100 -1 -1 200 -1 -1
