package Lecture27_BinaryTree;


public class NumOfNodes {
    public static int numOfNodes(BinaryTreeNode<Integer> root){
        int count;
        if (root == null)
            return 0;
        else
            count= 1;
        count += numOfNodes(root.leftNode);
        count += numOfNodes(root.rightNode);
        return count;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeNodeUse.takeBinaryTreeInputBetter();
        int ans = numOfNodes(root);
        System.out.println("Total Number of Nodes " + ans);
    }
    public static int noOfNode(BinaryTreeNode<Integer> root){
        if (root == null) return 0;
        return 1 + noOfNode(root.leftNode) + noOfNode(root.rightNode);
    }
}
// data    10 20 30 40 -1 -1 -1 -1 50 -1 -1