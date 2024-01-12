package Lecture28BinaryTree_2;

import Lecture27_BinaryTree.BinaryTreeNode;
import Lecture27_BinaryTree.BinaryTreeNodeUse;
// practice
class isBalReturn{
    int height;
    boolean isBal;

    public isBalReturn(int height, boolean isBal){
        this.height= height;
        this.isBal = isBal;
    }

}
public class Check_Bal_Opt {
    public static isBalReturn isBalOpt(BinaryTreeNode<Integer> root){
        // base
        if (root == null){
            isBalReturn smAns = new isBalReturn(0,true);
            return smAns;
        }
        isBalReturn leftRet = isBalOpt(root.leftNode);
        isBalReturn rightRet = isBalOpt(root.rightNode);
        // cal height
        int height = 1 + Math.max(leftRet.height , rightRet.height);
        boolean isBal = true;
        // check height balanced
        if (Math.abs(leftRet.height - rightRet.height) > 1) isBal = false;
        // check if down rturning false
        if (!leftRet.isBal || !rightRet.isBal) isBal = false;

        return new isBalReturn(height,isBal);
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeNodeUse.takeBinaryTreeInputBetter();
        isBalReturn ans = isBalOpt(root);
        System.out.println(ans.isBal);
    }
}

//   5 2 4 -1 -1 3 -1 -1 3 -1 5 -1 6 -1 -1
// 1 2 -1 -1 3 -1 4 -1 5 -1 -1
// 1 2 3 4 -1 -1 -1 -1 5 -1 6 -1 7 -1 -1
// 2 3 5 -1 -1 6 -1 -1 4 7 -1 -1 8 -1 -1