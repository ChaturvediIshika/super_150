package leetcode;

public class Recover_Binary_Search_Tree {
    public static void main(String[] args) {

    }
    public class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
  TreeNode prev=null,first=null,sec=null;
  public void recover(TreeNode root) {
        inorder(root);
        int temp=first.val;
        first.val= sec.val;
        sec.val=temp;
  }
  public void inorder(TreeNode root){
      if(root==null){
          return;
      }
      inorder(root.left);
      if(prev!=null && prev.val>root.val){
          if(first==null)
              first=prev;
              sec=root;
      }
      prev=root;
      inorder(root.right);
  }
}
