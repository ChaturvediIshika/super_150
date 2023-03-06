package Binary_Tree;

import java.util.*;

public class Create_Level_Order_tree {
    private class Node{
        int val;
        Create_Level_Order_tree.Node left,right;
    }
    private Create_Level_Order_tree.Node root;
    Scanner sc=new Scanner(System.in);
    public Create_Level_Order_tree(){
        root=createTree();
    }
    public Node createTree(){
        Queue<Node> q=new LinkedList<>();
        Node nn=new Node();
        int val=sc.nextInt();
        nn.val=val;
        root=nn;
        q.add(nn);
        while (!q.isEmpty()){
            Node rv=q.remove();
            int c1= sc.nextInt();
            int c2= sc.nextInt();
            if (c1!=-1) {
                Node node = new Node();
                node.val=c1;
                rv.left=node;
                q.add(node);
            }
            if (c2!=-1) {
                Node node = new Node();
                node.val=c2;
                rv.right=node;
                q.add(node);
            }
        }
        return root;
    }
    public void display(){
        display(root);
    }
    private void display(Create_Level_Order_tree.Node node){
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
    public void print(){
        print(root);
    }
    public void print(Node node){
        if(node==null)
            return;
        if(node.left==null && node.right==null)
            System.out.print(node.val+" ");
        print(node.left);
        print(node.right);
    }
    public void topview()
    {
        verticalTraversalTop(this.root);
        // System.out.print("fshjavl ");
    }

    private void verticalTraversalTop(Node root) {
        TreeMap<Integer,ArrayList<Integer>> map=new TreeMap<Integer,ArrayList<Integer>>();
        ArrayList<Integer> lls=new ArrayList<Integer>();
        traverse(root,map,0,lls);
        for(int i:map.keySet()){
            for(int j:map.get(i)){
                lls.add(j);
            }
        }
        for(int i:lls)
            System.out.print(i+" ");
    }
    private void traverse(Node root,TreeMap<Integer,ArrayList<Integer>> map,int p,ArrayList<Integer> lls){
        if(root==null || root.val==-1)
            return;
        ArrayList<Integer> ls=map.getOrDefault(p,new ArrayList<Integer>());
        ls.add(root.val);
        map.put(p,ls);
        traverse(root.left,map,p-1,lls);
        traverse(root.right,map,p+1,lls);
    }
}
