package Lecture28BinaryTree_2;

import Lecture27_BinaryTree.BinaryTreeNode;
import Lecture27_BinaryTree.BinaryTreeNodeUse;


class FindDiameterPrc {
    int heigth;
    int diameter;
    FindDiameterPrc(int heigth, int diameter){
        this.heigth = heigth;
        this.diameter = diameter;
    }
}
public class DiameterPrac {
    public static FindDiameterPrc findDiameter(BinaryTreeNode<Integer> root){
        // base
        if (root == null) {
            return new FindDiameterPrc(0,0);
        }
        // rec call
        FindDiameterPrc left = findDiameter(root.leftNode);
        FindDiameterPrc right = findDiameter(root.rightNode);

        // cal height so can b returned
        int height = 1 + Math.max(left.heigth , right.heigth);
        // cal diamter from heigth
        int diameter =  left.heigth + right.heigth;
        // check if now diametre greder than previous
        if (diameter < Math.max(left.diameter, right.diameter)){
            diameter = Math.max(left.diameter, right.diameter);
        }
        // return
        return new FindDiameterPrc(height,diameter);
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeNodeUse.takeBinaryTreeInputBetter();
        FindDiameterPrc ans = findDiameter(root);
        System.out.println("Diameter " + ans.diameter);
    }
}
