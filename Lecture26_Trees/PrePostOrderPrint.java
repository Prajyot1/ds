package Lecture26_Trees;

public class PrePostOrderPrint {
    public static void printPreOrder(TreeNode<Integer> root){
        System.out.print(root.data +" ");
        for (int i = 0; i < root.children.size(); i++) {
            printPreOrder(root.children.get(i));
        }
    }
    public static void printPostOrder(TreeNode<Integer> root){
        for (int i = 0; i < root.children.size(); i++) {
            printPostOrder(root.children.get(i));
        }
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = TreeNodeUse.takeInputLevelWise();
//        printPreOrder(root);
        System.out.println();
//        printPostOrder(root);

    }
}// 10  2 20 30 2 40 50 1 60 0 2 70 80 0 0 0
