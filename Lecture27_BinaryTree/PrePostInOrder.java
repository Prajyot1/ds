package Lecture27_BinaryTree;

public class PrePostInOrder {
    public static void preOrderPrint(BinaryTreeNode<Integer> root){
        if (root == null)
            return;
        System.out.println(root.data);
        preOrderPrint(root.leftNode);
        preOrderPrint(root.rightNode);

    }
    public static void postOrderPrint(BinaryTreeNode<Integer> root){
        if (root == null)
            return;
        postOrderPrint(root.leftNode);
        postOrderPrint(root.rightNode);
        System.out.println(root.data);
    }
    public static void InOrderPrint(BinaryTreeNode<Integer> root){
        if (root == null)
            return;
        InOrderPrint(root.leftNode);
        System.out.print(root.data + " ");
        InOrderPrint(root.rightNode);
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeNodeUse.takeBinaryTreeInputBetter();

//        preOrderPrint(root);
        postOrderPrint(root);
        InOrderPrint(root);

    }
}// 3 2 5 -1 -1 -1 1 7 10 -1 -1 -1 9 -1 -1
