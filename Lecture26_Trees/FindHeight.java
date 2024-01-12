package Lecture26_Trees;

public class FindHeight {
    public static int findheight(TreeNode<Integer> root){
        if (root == null){
            return 0;
        }
        int ans = 1;

        for (int i = 0; i < root.children.size(); i++) {
            int height = 1 +  findheight(root.children.get(i));
            if (height > ans)
                ans = height;
        }
        return ans;
    }
    public static void main(String[] args) {
        TreeNode<Integer> root = TreeNodeUse.takeInputLevelWise();
        int ans = findheight(root);
        System.out.println("height is "+ ans);
    }
}
