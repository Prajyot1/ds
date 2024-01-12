package Lecture28BinaryTree_2;

import Lecture27_BinaryTree.BinaryTreeNode;
import Lecture27_BinaryTree.BinaryTreeNodeUse;

public class RemoveLeafNode {
    public static BinaryTreeNode<Integer> removeLeaf(BinaryTreeNode<Integer> root){
        if (root == null) return null;
        if (root.leftNode == null && root.rightNode == null) return null;
        root.leftNode = removeLeaf(root.leftNode);
        root.rightNode = removeLeaf(root.rightNode);
    return root;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeNodeUse.takeBinaryTreeInputBetter();
        root = removeLeaf(root);
//        if (root == null) System.out.println("Null");
        BinaryTreeNodeUse.printBinaryBetter(root);
        // 10 20 5 -1 -1 3 -1 -1 30 40 50 8 -1 -1 -1 -1 -1
        // 10 -1 -1
        // 10 20 -1 -1 30 -1 -1
    }
}
