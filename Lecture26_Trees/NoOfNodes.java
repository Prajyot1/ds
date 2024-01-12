package Lecture26_Trees;
// to find no of nodes in the tree
public class NoOfNodes {
    public static int NodesCount(TreeNode<Integer> root){
        if (root.children.size() == 0){
            return 0;
        }
        TreeNode<Integer> temp = root;
        int count = temp.children.size();
        for (int i = 0; i < temp.children.size(); i++) {
            count = count + NodesCount(temp.children.get(i));
        }
        return count;
    }

    public static int NodesCountEff(TreeNode<Integer> root){
        int count = 1;
        for (int i = 0; i < root.children.size(); i++) {
            count += NodesCountEff(root.children.get(i));
        }
        return count;
    }
    public static void main(String[] args) {
        TreeNode<Integer> root = TreeNodeUse.takeInputLevelWise();
//        int ans = NodesCount(root) + 1;
        int ans = NodesCountEff(root);
        System.out.println("Total Nodes :" + ans);

    }
}
// 10 4 20 30 40 50 3 60 70 80 0 2 90 100 1 110 0 0 0 0 0 0
// ans 11