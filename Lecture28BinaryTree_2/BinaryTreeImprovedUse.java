package Lecture28BinaryTree_2;

import Lecture27_BinaryTree.BinaryTreeNode;
import Lecture27_BinaryTree.BinaryTreeNodeUse;

public class BinaryTreeImprovedUse {

    public static BinaryTreeImproved isBalanced(BinaryTreeNode<Integer> root){
        if (root == null){
            BinaryTreeImproved node = new BinaryTreeImproved(true,0);
            return node;
        }
        int heightLoc;
        boolean isBalaLocal = true;
        // calls
        BinaryTreeImproved leftOutput = isBalanced(root.leftNode);
        BinaryTreeImproved rightOutput =isBalanced(root.rightNode);
        // cal height
        heightLoc = 1 + Math.max(leftOutput.height, rightOutput.height);

        // check height is balanced
        if (Math.abs(leftOutput.height - rightOutput.height) > 1)
            isBalaLocal = false;
        // check isBalanced Logic
        if (!leftOutput.isBalanced || !rightOutput.isBalanced)
            isBalaLocal = false;
        // return
        BinaryTreeImproved toreturn = new BinaryTreeImproved(isBalaLocal , heightLoc);
        System.out.print(toreturn.isBalanced + " "+ toreturn.height);
        System.out.println();

        return toreturn;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeNodeUse.takeBinaryTreeInputBetter();
        BinaryTreeImproved ans = isBalanced(root);
        System.out.println("heigth of the tree "+ans.height);
        System.out.println("Is the tree Balanced "+ ans.isBalanced);
    }

}//  1 2 4 -1 -1 -1 3 -1 -1
// 1 2 3 4 -1 -1 -1 -1 5 -1 6 -1 7 -1 -1