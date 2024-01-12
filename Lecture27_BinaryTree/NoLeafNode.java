package Lecture27_BinaryTree;

public class NoLeafNode {
    public static int NoOfLeaf(BinaryTreeNode<Integer> root){
        if (root == null) return 0;
        if (root.leftNode == null && root.rightNode==null) return 1;
        return NoOfLeaf(root.leftNode) + NoOfLeaf(root.rightNode);
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeNodeUse.takeBinaryTreeInputBetter();
        BinaryTreeNodeUse.printBinaryBetter(root);
        int ans = NoOfLeaf(root);
        System.out.println("No of Leaf Node "+ ans);
    }
}
//   3 2 5 -1 -1 -1 1 7 10 -1 -1 -1 9 -1 -1