package Binary_Tree;

public class Construct_from_pre_in {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){

        }
        TreeNode(int val){
            this.val=val;
        }
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    class Solution {
        public TreeNode buildTree(int[] preorder, int[] inorder) {
           return create(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
        }

        private TreeNode create(int[] preorder, int i, int i1, int[] inorder, int i2, int i3) {
            if(i>i1 || i2>i3)
                return null;
            TreeNode nn=new TreeNode(preorder[i]);
            int j=search(inorder,i2,i3,preorder[i]);
            int net=j-i2;
            nn.left=create(preorder,i+1,i+net,inorder,i2,j-1);
            nn.right=create(preorder,i+net+1,i1,inorder,j+1,i3);
            return nn;
        }
        public int search(int[] inorder,int si,int ei,int item){
            for (int i=si;i<=ei;i++){
                if(inorder[i]==item)
                    return i;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Construct_from_pre_in ct=new Construct_from_pre_in();
        Solution sol=ct.new Solution();
    }
}
