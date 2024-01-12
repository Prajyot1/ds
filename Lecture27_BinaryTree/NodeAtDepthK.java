package Lecture27_BinaryTree;
// print all the node at depth k
public class NodeAtDepthK {
    public static void NodeAtDepthprint(BinaryTreeNode<Integer> root , int depth){
        if (root == null)
            return;
        if (depth == 0){
            System.out.print(root.data+" ");
        }
        NodeAtDepthprint(root.leftNode , depth-1);
        NodeAtDepthprint(root.rightNode, depth-1);

    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeNodeUse.takeBinaryTreeInputBetter();
        BinaryTreeNodeUse.printBinaryBetter(root);
        int k = 4;   // depth of the tree input
        System.out.println("Nodes at depth "+k +" are :");
        NodeAtDepthprint(root, k);
    }

} //   20 30 100 -1 -1 200 -1 -1 40 300 -1 -1 400 -1 -1
