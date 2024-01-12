package Lecture27_BinaryTree;

public class BinaryTreeNode<T> {
    public T data;
    public BinaryTreeNode<T> leftNode;
    public BinaryTreeNode<T> rightNode;

    public BinaryTreeNode(T data){
        this.data = data;
    }
}
