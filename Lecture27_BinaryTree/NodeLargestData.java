package Lecture27_BinaryTree;

public class NodeLargestData {
    public static int findLargestNodeData(BinaryTreeNode<Integer> root){
        int largest;
        if (root == null){
            return 0;
        }
//        largest = root.data;
        int leftLar = findLargestNodeData(root.leftNode);
//        if (largest < leftLar)
//            largest = leftLar;

        int rightLar = findLargestNodeData(root.rightNode);
        return Math.max(root.data ,Math.max(leftLar, rightLar) );
//        if (largest< rightLar)
//            largest = rightLar;

//        return largest;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeNodeUse.takeBinaryTreeInputBetter();
        int ans = findLargestNodeData(root);
        System.out.println("Largest Node data "+ ans);
    }
}
