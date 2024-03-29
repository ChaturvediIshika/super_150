package Binary_Tree;

public class Diameter_of_Binary_Tree {
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
      public class DaiPair{
          int ht=-1;
          int d=0;
      }
    class Solution {
        public int diameterOfBinaryTree(TreeNode root) {
            return diameter(root).d;
        }
        public DaiPair diameter(TreeNode root){
            if (root==null)
                return new DaiPair();
            DaiPair ldp=diameter(root.left);
            DaiPair rdp=diameter(root.right);
            DaiPair sdp=new DaiPair();
            int sd=ldp.ht+ rdp.ht;
            sdp.d=Math.max(ldp.d, Math.max(rdp.d, sd));
            sdp.ht=Math.max(ldp.ht,rdp.ht)+1;
            return sdp;
        }
        public BalancedPair isBalanced(TreeNode node){
            if (node==null)
                return new BalancedPair();
            BalancedPair lbd=isBalanced(node.left);
            BalancedPair rbd=isBalanced(node.right);
            BalancedPair sbd=new BalancedPair();
            if(Math.abs(lbd.height-rbd.height)<=1)
                sbd.isBalanced=true;
            else
                sbd.isBalanced=false;
            sbd.height=Math.max(lbd.height, rbd.height);
            return sbd;
        }
    }
    private class BalancedPair {
        int height;
        boolean isBalanced;
    }
}
