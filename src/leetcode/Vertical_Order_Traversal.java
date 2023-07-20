package leetcode;

import java.util.*;

public class Vertical_Order_Traversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {
    }
    public static List<List<Integer>> vertical(TreeNode root){
        Queue<pair> q=new LinkedList<>();
        TreeMap<Integer,List<pair>> map=new TreeMap<>();
        q.add(new pair(0,0,root));
        while (!q.isEmpty()){
            pair rv=q.remove();
            if(!map.containsKey(rv.vl)){
                map.put(rv.vl,new ArrayList<>());
            }
            map.get(rv.vl).add(rv);
            if(rv.node.left!=null)
                q.add(new pair(rv.hl+1,rv.vl-1,rv.node.left));
            if(rv.node.right!=null)
                q.add(new pair(rv.hl+1,rv.vl+1,rv.node.right));
        }
        List<List<Integer>> ls=new ArrayList<>();
        for(int key:map.keySet()){
            List<pair> l=map.get(key);
            Collections.sort(l,(a,b)->a.hl==b.hl?a.node.val-b.node.val:0);
            List<Integer> ll=new ArrayList<>();
            for(pair p:l)
                ll.add(p.node.val);
            ls.add(ll);
        }
        return ls;
    }
    static class pair{
        int hl;
        int vl;
        TreeNode node;
        public pair(int hl,int vl,TreeNode node){
            this.hl=hl;
            this.vl=vl;
            this.node=node;
        }
    }
}
