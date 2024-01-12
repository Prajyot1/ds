package Lecture27_BinaryTree;
// Replace all Node Data With its depth value
public class ReplaceNodeData {
    public static void replaceData(BinaryTreeNode<Integer> root, int depth){
        if (root == null)
            return;
        root.data = depth;
        replaceData(root.leftNode ,depth+1);
        replaceData(root.rightNode, depth+1);
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeNodeUse.takeBinaryTreeInputBetter();
        replaceData(root ,0);
        BinaryTreeNodeUse.printBinaryBetter(root);
    }
}//  10 20 40 60 -1 -1 -1 50 -1 -1 30 -1 -1
