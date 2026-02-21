package trees;

public class BinaryTreeNode<T> {
    private T data;
    private BinaryTreeNode<T> left;
    private BinaryTreeNode<T> right;
    public BinaryTreeNode(T data){
        this.data = data;
    }
    public T getData(){
        return this.data;
    }
    public BinaryTreeNode<T> getLeft(){
        return left;
    }
    public BinaryTreeNode<T> getRight(){
        return right;
    }
    public void setLeft(BinaryTreeNode<T> leftNode){
        this.left = leftNode;
    }
    public void setRight(BinaryTreeNode<T> rightNode){
        this.right = rightNode;
    }
}
