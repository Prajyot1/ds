package Lecture28BinaryTree_2;

//Construct Tree Using Inorder and Preorder

import Lecture27_BinaryTree.BinaryTreeNode;
import Lecture27_BinaryTree.BinaryTreeNodeUse;

import java.util.Scanner;

public class InOrderPostOrderBuild {

    public static Scanner sc = new Scanner(System.in);
    public static int[] takeArrayInput(int size){
        int[] array = new int[size];

        System.out.println("Enter Array Data");
        for (int x:array) {
            sc.nextInt();
        }
        return array;
    }
    public static BinaryTreeNode<Integer> buildTreeHelp(int[] pre , int[] in, int stPre ,int edPre, int stIn , int edIn){
        // base
        if(stPre > edPre) return null;
        int root = pre[stPre];
        int rootIndInOrder = -1;
        // find root index in inOrder
        for (int i = stIn; i <= edIn; i++) {
            if(in[i] == root) rootIndInOrder = i;
        }
        if(rootIndInOrder == -1) return null;

        BinaryTreeNode<Integer> Rroot = new BinaryTreeNode<>(root);
        int stPre1 = stPre + 1;
        int edPre1 = stPre + rootIndInOrder;
        int stIn1 =  stIn;
        int edIn1 = rootIndInOrder - 1;

        int stPre2 = rootIndInOrder + 1;
        int edPre2 = stPre + rootIndInOrder;
        int stIn2 =  rootIndInOrder + 1;
        int edIn2 = edIn;

        Rroot.leftNode = buildTreeHelp(pre , in , stPre1,edPre1,stIn1,edIn1);
        Rroot.rightNode = buildTreeHelp(pre , in , stPre2,edPre2,stIn2,edIn2);
        return Rroot;
    }
    // build tree using preOrdr and InOrder
    public static BinaryTreeNode<Integer> buildTree(int [] pre , int [] in){
        BinaryTreeNode<Integer> root = buildTreeHelp(pre,in,0,pre.length-1,0, in.length-1);
        return root;
    }
    public static void main(String[] args) {
        int size = 7;
        int [] pre = {1 ,2 ,4 ,5 ,3 ,6 ,7};
        int [] in = {4 ,2 ,5 ,1, 6, 3 ,7};

//        String preOrder = Arrays.toString(pre);
//        String InOrder = Arrays.toString(in);

        BinaryTreeNode<Integer> root = buildTree(pre , in);
        BinaryTreeNodeUse.printBinaryTree(root);
        // steps
        // find root in pre order i.e first element
        // search root element in inOrder
        // break the 2 array
//        int[] in = new int[size];
//        int[] pre = takeArrayInput(size);

//        takeArrayInput(size ,in);
    }
}
