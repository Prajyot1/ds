package Lecture27_BinaryTree;

import Lecture26_Trees.TreeNode;

import java.util.Scanner;
public class BinaryTreeNodeUse {
    public static Scanner sc = new Scanner(System.in);
//    public static BinaryTreeNode<Integer> takeBinaryTreeInputBetter(){
//
//
//        return root;
//    }
    public static BinaryTreeNode<Integer> takeBinaryTreeInput(){

        System.out.println("Enter Root data :");
        int element = sc.nextInt();
        if (element == -1)
            return null;

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(element);
        BinaryTreeNode<Integer> left = takeBinaryTreeInput();
        BinaryTreeNode<Integer> right = takeBinaryTreeInput();

        root.leftNode = left;
        root.rightNode = right;

        return root;
    }
    public static BinaryTreeNode<Integer> takeInputBest(boolean isRoot , int parentData , boolean isLeft){
        int temp ;
        if (isRoot){
            System.out.println("Enter Root Data");
            temp = sc.nextInt();
        }else {
            if (isLeft) {
                System.out.println("Enter Left Data for "+  parentData +" node");
                temp = sc.nextInt();
            } else {
                System.out.println("Enter Right Data for " + parentData + " node");
                temp = sc.nextInt();
            }
        }
        if (temp == -1){
            return null;
        }

        BinaryTreeNode<Integer> node = new BinaryTreeNode<>(temp);
        node.leftNode = takeInputBest( false,  node.data , true);
        node.rightNode = takeInputBest( false, node.data  , false);



        return node;
    }
    public  static BinaryTreeNode<Integer> takeBinaryTreeInputBetter(){

        BinaryTreeNode<Integer> root;
        root = takeInputBest(true , 10 , true);
        return root;
    }
    public static void printBinaryTree(BinaryTreeNode<Integer> root){
        if (root == null)
            return;

        System.out.print(root.data + " ");

//        if (root.leftNode != null)
            printBinaryTree(root.leftNode);
//        if (root.rightNode != null)
            printBinaryTree(root.rightNode);

    }
    public static void printBinaryBetter(BinaryTreeNode<Integer> root){
        if (root == null)
            return;

        System.out.print( root.data + " : " );
        if (root.leftNode != null){
            System.out.print(root.leftNode.data);
            System.out.print("L ,");
        }
        if (root.rightNode != null){
            System.out.print(root.rightNode.data);
            System.out.print("R ," );
        }
        System.out.println();
        printBinaryBetter(root.leftNode);
        printBinaryBetter(root.rightNode);
    }
    public static void main(String[] args) {
//        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);
//        BinaryTreeNode<Integer> Leftroot = new BinaryTreeNode<>(20);
//        BinaryTreeNode<Integer> Rightroot = new BinaryTreeNode<>(30);
//
//        root.leftNode = Leftroot;
//        root.rightNode = Rightroot;
//
//        BinaryTreeNode<Integer> LeftrootRight = new BinaryTreeNode<>(40);
//        BinaryTreeNode<Integer> RightrootLeft = new BinaryTreeNode<>(50);
//
//        Leftroot.rightNode = LeftrootRight;
//        Rightroot.leftNode = RightrootLeft;

//        BinaryTreeNode<Integer> root = takeBinaryTreeInput();
//        printBinaryTree(root);
//        BinaryTreeNode<Integer> root = takeBinaryTreeInputBetter();

        BinaryTreeNode<Integer> root = takeBinaryTreeInputBetter();
//        printBinaryBetter(root);
        printBinaryPrac(root);
    }
    public static void printBinaryPrac(BinaryTreeNode<Integer> root){
        if (root ==  null) return;
        System.out.print(root.data + " : ");
        if (root.leftNode != null){
            System.out.print("L " + root.leftNode.data);
        }
        if (root.rightNode != null){
            System.out.print(" R " + root.rightNode.data);
        }
        System.out.println();
        printBinaryPrac(root.leftNode);
        printBinaryPrac(root.rightNode);
    }

}// 10 20 40 -1 -1 50 -1 -1 30 -1 50 -1 -1
