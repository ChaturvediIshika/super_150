package Binary_Tree;

public class Construct_from_in_post {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){

        }
        TreeNode(int val){
            this.val=val;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    class Solution {
        public TreeNode buildTree(int[] inorder, int[] postorder) {
            return create(postorder, 0, postorder.length - 1, inorder, 0, inorder.length - 1);
        }

        private TreeNode create(int[] postorder, int i, int i1, int[] inorder, int i2, int i3) {
            if (i > i1 || i2 > i3)
                return null;
            TreeNode nn = new TreeNode(postorder[i1]);
            int j = search(inorder, i2, i3, postorder[i1]);
            nn.left = create(postorder, i, i + j - i2 - 1, inorder, i2, j - 1);
            nn.right = create(postorder, i + j - i2, i1 - 1, inorder, j + 1, i3);
            return nn;
        }

        public int search(int[] inorder, int si, int ei, int item) {
            for (int i = si; i <= ei; i++) {
                if (inorder[i] == item)
                    return i;
            }
            return -1;
        }
    }
}
