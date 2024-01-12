package Lecture26_Trees;
// printing the node at k depth
// root is at 0 depth

public class DepthOfNode {
    public static void printRootAtDepth(TreeNode<Integer> root , int k){
        if (k < 0){
            return;
        }
        if (k == 0){
            System.out.print(root.data + " ");
            return;
        }
        for (int i = 0; i < root.children.size(); i++) {
            printRootAtDepth(root.children.get(i), k-1);
        }
    }
    public static void main(String[] args) {
        TreeNode<Integer> root = TreeNodeUse.takeInputLevelWise();
        int k = 2;   // depth
        System.out.println("Root at depth "+ k + " are");
        printRootAtDepthPrac(root,k);
        //10 3 20 30 40 2 50 60 1 70 1 90 0 0 1 80 0 0
    }
    public static void printRootAtDepthPrac(TreeNode<Integer> root,int k){
        // base
        if (root == null) return; // will not run because of loop
        if (k < 0) return;

        if (k == 0){
            System.out.print(root.data + " ");
        }
        for (int i = 0; i < root.children.size(); i++) {
            printRootAtDepthPrac(root.children.get(i), k-1);
        }

    }

}
