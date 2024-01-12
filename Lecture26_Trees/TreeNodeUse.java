package Lecture26_Trees;

import Lecture25Queues.QueryEmptyException;
import Lecture25Queues.QueueLL;

import java.util.*;

public class TreeNodeUse {
    public static Scanner s = new Scanner(System.in);
    public static TreeNode<Integer> takeInput(Scanner sc){
        TreeNode<Integer> root;
        System.out.println(" Enter data for root ");
        int n = sc.nextInt();
        root = new TreeNode<>(n);

        System.out.println("Enter No of Children of : " + n);
        int child = sc.nextInt();

        for (int i = 0; i < child; i++) {
            TreeNode<Integer> children = takeInput(sc);
            root.children.add(children);
        }
        return root;
    }
    public static TreeNode<Integer> takeInputLevelWise(){
        System.out.println("Enter Root element Data :");
        int rootData = s.nextInt();

        TreeNode<Integer> root = new TreeNode<>(rootData);

        QueueLL<TreeNode<Integer>> pendingQueue = new QueueLL<>();
        pendingQueue.enQueue(root);

        while (!pendingQueue.isEmpty()){
            try {
                TreeNode<Integer> frontnode = pendingQueue.deQueue();
                System.out.println("Enter No of Children for "+ frontnode.data);
                int noOfChild = s.nextInt();

                for (int i = 1; i <= noOfChild ; i++) {
                    System.out.println("Enter Data for "+ i +"th child of " + frontnode.data);
                    int childData = s.nextInt();
                    TreeNode<Integer> child = new TreeNode<>(childData);
                    frontnode.children.add(child);
                    pendingQueue.enQueue(child);
                }
            }catch (QueryEmptyException e){
                return null;
            }
        }
        return root;
    }
    public static void showOutput(TreeNode<Integer> root){
        String s = root.data +" : ";
        for (int i = 0; i < root.children.size(); i++) {
            s = s + root.children.get(i).data +" , ";
        }
        System.out.println(s);
        for (int i = 0; i < root.children.size(); i++) {
            showOutput(root.children.get(i));
        }
    }
    public static void showOutputLineWise(TreeNode<Integer> root) throws QueryEmptyException{
        QueueLL<TreeNode<Integer>> pendingQueue = new QueueLL<>();
        pendingQueue.enQueue(root);
        String s = "";
        while (!pendingQueue.isEmpty()){
            TreeNode<Integer> frontNode = pendingQueue.deQueue();
            s = frontNode.data + " : ";
            for (int i = 0 ; i < frontNode.children.size(); i++) {
                TreeNode<Integer> temp = frontNode.children.get(i);
                s = s + temp.data +",";
                pendingQueue.enQueue(temp);
            }
            System.out.println(s);
        }
    }

    public static void main(String[] args) throws Exception {
//        TreeNode<Integer> root = new TreeNode<>(10);
//
//        TreeNode<Integer> node1 = new TreeNode<>(20);
//        TreeNode<Integer> node2 = new TreeNode<>(30);
//        TreeNode<Integer> node3 = new TreeNode<>(40);
//        TreeNode<Integer> node4 = new TreeNode<>(50);
//
//        root.children.add(node1);
//        root.children.add(node2);
//        root.children.add(node3);
//
//        node2.children.add(node4);
//        Scanner sc = new Scanner(System.in);
//        TreeNode<Integer> root = takeInput(sc);

//        TreeNode<Integer> root = takeInputLevelWise();
//        showOutput(root);
//        showOutputLineWise(root);
//        TreeNode<Integer> root = takeInputPrac();
        //10  3 20
//        showOutputPrac(root);
        TreeNode<Integer> root = takeInputLevelWisePrac();
        // 10 3 20 30 40 2 50 60 0  1 70 0 0 0
   //     showOutputPrac(root);
        printInputLevelWisePrac(root);
    }

    // practice after long time
    public static TreeNode<Integer> takeInputLevelWisePrac() throws Exception{
        System.out.println("Enter Root Data ");
        int data = s.nextInt();
        TreeNode<Integer> root = new TreeNode<>(data);
        QueueLL<TreeNode<Integer>> que = new QueueLL<>();
        que.enQueue(root);

        while (!que.isEmpty()){
            System.out.println("Enter No of Childre for "+ que.front().data);
            int noChild = s.nextInt();

            for (int i = 1; i <= noChild; i++) {
                System.out.println("Enter " + i + " child data for root " + que.front().data);
                int childData = s.nextInt();
                TreeNode<Integer> child = new TreeNode<>(childData);
                que.enQueue(child);
                que.front().children.add(child);
                }// end for
                que.deQueue();
        }//end while
        return root;
    }
        public static void printInputLevelWisePrac(TreeNode<Integer> root){
            Queue<TreeNode> que = new LinkedList<>();
            que.offer(root);
            while(!que.isEmpty()){
                TreeNode<Integer> temp = que.element();
                System.out.print(temp.data +" : ");
                for (int i = 0; i < temp.children.size() ; i++) {
                    System.out.print(temp.children.get(i).data +" ,");
                    que.offer(temp.children.get(i));
                }
                que.remove();
                System.out.println();
            }
        }

        public static TreeNode<Integer> takeInputPrac(){
        System.out.println("Enter Root Data ");
        int data = s.nextInt();
        TreeNode<Integer> root = new TreeNode<>(data);

        System.out.println("Enter NO of Children for "+ root.data);
        int child = s.nextInt();
        root.children = new ArrayList<>();
        for (int i = 0; i < child; i++) {
            root.children.add(takeInputPrac());
        }
        return root;
    }
    // 10 3 20 0 30 2 40 0 50 0 60 1 70 0
    public static void showOutputPrac(TreeNode<Integer> root){
        System.out.print(root.data +" : ");
        for (TreeNode<Integer> node: root.children) {
            System.out.print(node.data + ",");
        }
        System.out.println();
        for (int i = 0; i < root.children.size(); i++) {
            showOutputPrac(root.children.get(i));
        }

    }

}
// 10 3 20 0 30 2 50 0 60 0 40 0
// 10 3 20 30 40 2 50 60 2 70 80 1 90 0 0 0 0 0