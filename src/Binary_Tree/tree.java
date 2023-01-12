package Binary_Tree;

import java.util.Scanner;

public class tree {
    private class Node{
        int val;
        Node left,right;
    }
    private Node root;
    Scanner sc=new Scanner(System.in);
    public tree(){
        root=createTree();
    }
    private Node createTree(){
        int item= sc.nextInt();
        Node nn=new Node();
        nn.val=item;
        boolean hlc=sc.nextBoolean();
        if(hlc){
            nn.left=createTree();
        }
        boolean hrc=sc.nextBoolean();
        if(hrc){
            nn.right=createTree();
        }
        return nn;
    }
    public void display(){
        display(root);
    }
    public void inorder(){
        inorder(root);
        System.out.println();
    }
    public void preorder(){
        preorder(root);
        System.out.println();
    }
    public void postorder(){
        postorder(root);
        System.out.println();
    }
    public int Maximum(){
        return Maximum(root);
    }
    private void display(Node node){
        if (node==null)
            return;
        String str="";
        str+="<-"+node.val+"->";
        if (node.left!=null){
            str=node.left.val+str;
        }
        else
            str="."+str;
        if (node.right!=null){
            str+=node.right.val;
        }
        else
            str+=".";
        System.out.println(str);
        display(node.left);
        display(node.right);
    }
    public void inorder(Node node){
        if (node==null)
            return;
        inorder(node.left);
        System.out.print(node.val+"->");
        inorder(node.right);
    }
    public void preorder(Node node){
        if (node==null)
            return;
        System.out.print(node.val+"->");
        preorder(node.left);
        preorder(node.right);
    }
    public void postorder(Node node){
        if (node==null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.val+"->");
    }
    public boolean Search(int item){
        return Search(root,item);
    }
    private boolean Search(Node node,int item){
        if (node==null)
            return false;
        if(node.val==item)
            return true;
        boolean l=Search(node.left,item);
        boolean r=Search(node.right,item);
        return l||r;
    }
    private int Maximum(Node root){
        if (root==null)
            return Integer.MIN_VALUE;
        int l=Maximum(root.left);
        int r=Maximum(root.right);
        return Math.max(Math.max(l,r),root.val);
    }
    public int height(){
        return height(root);
    }
    private int height(Node node){
        if (node==null)
            return -1;
        int l=height(node.left)+1;
        int r=height(node.right)+1;
        return Math.max(l,r);
    }
}
