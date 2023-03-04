package Binary_Search_Tree;

public class Binary_Tree_Cameras {
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
    class Solution {
         int c=0;
        public int minCameraCover(TreeNode root) {
            if (root==null)
                return 1;
            int l=minCameraCover(root.left);
            int r=minCameraCover(root.right);
            if(l==-1 || r==-1){
                c++;
                return 2;
            }
            if(l==1 && r==1) {
                return -1;
            }
            return 1;
        }
    }
}
