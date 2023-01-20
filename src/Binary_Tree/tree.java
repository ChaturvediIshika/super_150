package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;
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
    public boolean Sum(Node root, int targetSum,int sum) {
        if(root==null)
            return false;
        if (root.left==null && root.right==null && sum+root.val==targetSum)
            return true;
        boolean l=Sum(root.left,targetSum,sum+root.val);
        boolean r=Sum(root.right,targetSum,sum+root.val);
        return l||r;
    }
    public void level_order_traversal(){
        level_order_traversal(root);
    }
    public void level_order_traversal(Node root){
        Queue<Node> queue=new LinkedList<>();
        Queue<Node> q1=new LinkedList<>();
        if (root==null)
            return;
        queue.add(root);
        while (!queue.isEmpty()) {
            Node rv = queue.remove();
            System.out.print(rv.val+" ");
            if (rv.left != null)
                q1.add(rv.left);
            if (rv.right != null)
                q1.add(rv.right);
            if (queue.isEmpty()) {
                System.out.println();
                queue = q1;
                q1=new LinkedList<>();
            }
        }
    }
    public int subNumbers(){
        return Sum(root,0);
    }
    public int Sum(Node root,int ans){
        if (root==null)
            return 0;
        if(root.left==null && root.right==null){
            return ans*10+root.val;
        }
        int left=Sum(root.left,ans*10+root.val);
        int right=Sum(root.right,ans*10+root.val);
        return left+right;
    }
    public int lca(){
        return lowestCommonAncestor(root,root.left.right,root.right.left).val;
    }
    public Node lowestCommonAncestor(Node root,Node p,Node q){
        if (root==null)
            return root;
        if(root==p || root==q){
            return root;
        }
        Node left=lowestCommonAncestor(root.left,p,q);
        Node right=lowestCommonAncestor(root.right,p,q);
        if(left!=null && right!=null)
            return root;
        else if (left!=null)
            return left;
        else
            return right;
    }
}
