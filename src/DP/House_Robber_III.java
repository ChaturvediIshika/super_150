package DP;

import java.util.HashMap;

public class House_Robber_III {
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
    public int house_rob(TreeNode root, HashMap<TreeNode,Integer> map){
        if(root==null)
            return 0;
        if(map.containsKey(root))
            return map.get(root);
        int rob=root.val;
        if (root.left!=null){
            rob+=house_rob(root.left.left,map)+house_rob(root.left.right,map);
        }
        if(root.right!=null){
            rob+=house_rob(root.right.left,map)+house_rob(root.right.right,map);
        }
        int drob=house_rob(root.left,map)+house_rob(root.right,map);
        int ans= Math.max(rob,drob);
        map.put(root,ans);
        return ans;
    }
}
