package S07Ex03;

public class TreeNode {
    public String value; // Again, I would make those instance variables private, but the given code uses tehm so I made them public
    public TreeNode left, right;

    public TreeNode(String valueIn) {
        this.value = valueIn;
    }

    public String getVal() {
        return this.value;
    }

    public void setVal(String valueIn){
        this.value = valueIn;
    }

    public TreeNode getLeft(){
        return this.left;
    }

    public TreeNode getRight(){
        return this.right;
    }

    public void setLeft(TreeNode nodeIn){
        if(this.left != null)
            System.out.println("Overwrite");
        this.left = nodeIn;
    }

    public void setRight(TreeNode nodeIn){
        if(this.left != null)
            System.out.println("Overwrite");
        this.right = nodeIn;
    }

    public String toString(){
        String output = this.value +
        " [ " + (this.left != null ? this.left.value : "0") + " ] " +
        " [ " + (this.right != null ? this.right.value : "0") + " ]";
        return output;
    }

}
