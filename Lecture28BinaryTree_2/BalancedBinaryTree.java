package Lecture28BinaryTree_2;

import Lecture27_BinaryTree.BinaryTreeNode;
import Lecture27_BinaryTree.BinaryTreeNodeUse;


public class BalancedBinaryTree {
    public static int findHeight(BinaryTreeNode<Integer> root){
        if (root == null)
            return 0;
        int Lheight = findHeight(root.leftNode);
        int Rheight =  findHeight(root.rightNode);

        return 1 + Math.max(Lheight, Rheight);
    }
    public static boolean findBalancedTree(BinaryTreeNode<Integer> root){
        if (root == null)
            return true;
        int Lheight = findHeight(root.leftNode);
        int Rheight = findHeight(root.rightNode);
        System.out.println(Lheight + " "+ Rheight);

        if (Math.abs(Lheight - Rheight) > 1)
            return false;

        boolean isLeftBalanced = findBalancedTree(root.leftNode);
        boolean isRightBalanced = findBalancedTree(root.rightNode);

        return isLeftBalanced && isRightBalanced;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeNodeUse.takeBinaryTreeInputBetter();
        boolean ans = findBalancedTree(root);
        System.out.println("Tree is Balanced " + ans);
            int height = findHeight(root);
//        System.out.println(height);
//        BinaryTreeNodeUse.printBinaryBetter(root);
    }


}//   5 2 4 -1 -1 3 -1 -1 3 -1 5 -1 6 -1 -1
// 1 2 -1 -1 3 -1 4 -1 5 -1 -1
// 1 2 3 4 -1 -1 -1 -1 5 -1 6 -1 7 -1 -1