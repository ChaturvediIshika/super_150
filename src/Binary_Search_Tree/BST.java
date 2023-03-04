package Binary_Search_Tree;

import Binary_Tree.tree;

public class BST {
    public class Node{
        int val;
        Node left,right;
    }
    private  Node root;
    public BST(int in[]){
        this.root=CreateTree(in,0,in.length-1);
    }
    private Node CreateTree(int in[],int si,int ei){
        if(si>ei)
            return null;
        int mid=(si+ei)/2;
        Node nn=new Node();
        nn.val=in[mid];
        nn.left=CreateTree(in,si,mid-1);
        nn.right=CreateTree(in,mid+1,ei);
        return nn;
    }
    public void inorder(){
        inorder(root);
    }
    private void inorder(Node node){
        if (node==null)
            return;
        inorder(node.left);
        System.out.print(node.val+"->");
        inorder(node.right);
    }
}
