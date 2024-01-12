package Lecture28BinaryTree_2;

import Lecture27_BinaryTree.BinaryTreeNode;
import Lecture27_BinaryTree.BinaryTreeNodeUse;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TakeInputLevel {
    public static Scanner sc = new Scanner(System.in);
    public static BinaryTreeNode<Integer> levelInput(){
        int RootData;
        Queue<BinaryTreeNode> pendQueue = new LinkedList<>();

        System.out.println("Enter Root Data :");
        RootData = sc.nextInt();

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(RootData);
        pendQueue.add(root);

        while (!pendQueue.isEmpty()){
            BinaryTreeNode<Integer> temp = pendQueue.poll();

            System.out.println("Enter Left Node Of "+ temp.data);
            int Tempdata1 = sc.nextInt();
            if (Tempdata1 != -1){
                BinaryTreeNode<Integer> left = new BinaryTreeNode<>(Tempdata1);
                temp.leftNode = left;
                pendQueue.add(left);
            }
            System.out.println("Enter Right Node Of "+ temp.data);
            int Tempdata2 = sc.nextInt();
            if (Tempdata2 != -1){
                BinaryTreeNode<Integer> right = new BinaryTreeNode<>(Tempdata2);
                temp.rightNode = right;
                pendQueue.add(right);

            }
        }
        return root;
    }
    public static void printBinaryTreeLevelWise(BinaryTreeNode<Integer> ro){
        Queue<BinaryTreeNode> pendQueue = new LinkedList<>();
        pendQueue.add(ro);

        while (!pendQueue.isEmpty()){
            // remove front
            BinaryTreeNode<Integer> front = pendQueue.poll();
            // print data
            System.out.print(front.data + " :");
            // print lrft
            if (front.leftNode != null){
                pendQueue.add(front.leftNode);

                System.out.print(front.leftNode.data + " Left ,");
            }
            //print right
            if (front.rightNode != null){
                pendQueue.add(front.rightNode);

                System.out.print(front.rightNode.data + " Right");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = levelInput();
//        BinaryTreeNodeUse.printBinaryBetter(root);
//        printBinaryTreeLevelWise(root);
        print(root);
    }
    public static void print(BinaryTreeNode<Integer> root){
        Queue<BinaryTreeNode<Integer>> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()){
            BinaryTreeNode<Integer> yemp = que.remove();
            System.out.print(yemp.data + " : ");
            if (yemp.leftNode != null){
                que.add(yemp.leftNode);
                System.out.print("L : " + yemp.leftNode.data);
            }else System.out.print("L : -1 ");
            if (yemp.rightNode != null){
                que.add(yemp.rightNode);
                System.out.print("R : " + yemp.rightNode.data);
            }else System.out.print("R : -1 ");
            System.out.println();
        }

    }
} // 2 1 3 5 6 -1 10 -1 -1 -1 -1 -1 -1
