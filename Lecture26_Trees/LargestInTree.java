package Lecture26_Trees;

public class LargestInTree {
    public static int findLargestElement(TreeNode<Integer> root){
        int largest = root.data;

        for (int i = 0; i < root.children.size(); i++) {
            int ChildLargest = findLargestElement(root.children.get(i));
            if (ChildLargest > largest)
                largest = ChildLargest;
        }
            return largest;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = TreeNodeUse.takeInputLevelWise();
//        int ans = findLargestElement(root);
        int ans = findLargePrac(root);
        System.out.println(ans);
    }
    public static int findLargePrac(TreeNode<Integer> root){
        int smMax = root.data;
        for (int i = 0; i < root.children.size(); i++) {
            int temp = findLargePrac(root.children.get(i));
            if (temp > smMax) smMax = temp;
        }

        return smMax;
    }
}
