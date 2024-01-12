package Lecture27_BinaryTree;


public class NodeWithoutSiblings {
    public static void findNodesWithNoSiblings(BinaryTreeNode<Integer> root){
        // base
        if (root == null) return;
        // cal
        if (root.leftNode != null && root.rightNode == null)
            System.out.print(root.leftNode.data + " ");
        else if(root.leftNode == null && root.rightNode != null)
            System.out.print(root.rightNode.data + " ");

        findNodesWithNoSiblings(root.leftNode);
        findNodesWithNoSiblings(root.rightNode);
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeNodeUse.takeBinaryTreeInputBetter();
        findNodesWithNoSiblings(root);
     }
}
