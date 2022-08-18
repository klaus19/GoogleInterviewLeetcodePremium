package Tree;

public class Node {

    int val;
    Node left, right;

    public Node(int val) {
        this.val = val;
       // left = right = null;
    }

    public Node(){

    }
    public Node(int val,Node left,Node right){
        this.val=val;
        this.right=right;
        this.left=left;
    }
}
