package Lecture28BinaryTree_2;

import Lecture27_BinaryTree.BinaryTreeNode;
import Lecture27_BinaryTree.BinaryTreeNodeUse;

public class MirrorBinaryTree {
    public static BinaryTreeNode<Integer> buildMirror(BinaryTreeNode<Integer> root){
        if (root == null) return null;
        BinaryTreeNode<Integer> temp = root.leftNode;
        root.leftNode = buildMirror(root.rightNode);
        root.rightNode = buildMirror(temp);
        return root;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeNodeUse.takeBinaryTreeInputBetter();
        root = buildMirror(root);
        BinaryTreeNodeUse.printBinaryBetter(root);
        // 1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 7 -1 -1
    }
}
