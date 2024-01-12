package Lecture26_Trees;


public class CountLeafNodes {
    public static int countLeaf(TreeNode<Integer> root){
        if (root.children.size() == 0)
            return 1;
        int ans = 0;
        for (int i = 0; i < root.children.size(); i++) {
            ans = ans + countLeaf(root.children.get(i));
        }
        return ans;
    }
    public static void main(String[] args) {
        TreeNode<Integer> root = TreeNodeUse.takeInputLevelWise();
//        int ans = countLeaf(root);
        int ans = leafNode(root);

        System.out.println("No of Leafs In Tree "+ ans);
    }
    public static int leafNode(TreeNode<Integer> root){
        // base
        // cal
        if (root.children.size() == 0) return 1;
        int smAns = 0;
        int childAns = 0;
        for (int i = 0; i < root.children.size(); i++) {
            childAns += leafNode(root.children.get(i));
        }
        return smAns + childAns;
    }
}
