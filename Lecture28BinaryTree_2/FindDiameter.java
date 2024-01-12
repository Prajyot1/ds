package Lecture28BinaryTree_2;

import Lecture27_BinaryTree.BinaryTreeNode;
import Lecture27_BinaryTree.BinaryTreeNodeUse;



// to be corrected




public class FindDiameter {
    public static Diameter findDiameter(BinaryTreeNode<Integer> root){
        if (root == null){
            return new Diameter(0,0);
        }
        Diameter leftOutput  = findDiameter(root.leftNode);
        Diameter rightOutput = findDiameter(root.leftNode);

        int heightLoc  = 1 + Math.max(leftOutput.height,rightOutput.height);

        int distance = leftOutput.height + rightOutput.height + 1;

        int diameter = Math.max(distance, Math.max(rightOutput.diameter , leftOutput.diameter));
        return new Diameter(heightLoc,diameter);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeNodeUse.takeBinaryTreeInputBetter();
        Diameter ansDiameter = findDiameter(root);
        System.out.println(ansDiameter.diameter);
    }
}
//  2 3 4 -1 -1 -1 5 -1 -1