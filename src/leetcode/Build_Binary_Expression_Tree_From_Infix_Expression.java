package leetcode;

import Binary_Search_Tree.Binary_Tree_Cameras;
import Binary_Tree.Create_Level_Order_tree;

import java.util.HashMap;
import java.util.Stack;

public class Build_Binary_Expression_Tree_From_Infix_Expression {
    public class Node {
        char val;
        Node left;
        Node right;
        Node() {}
        Node(char val) { this.val = val; }
        Node(char val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
    public String postfix(String str){
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('(',-1);
        map.put('*',2);
        map.put('/',2);
        map.put('+',1);
        map.put('-',1);
        Stack<Character> st=new Stack<>();
        String postStr="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9')
                postStr+=str.charAt(i);
            else if(str.charAt(i)=='(')
                st.push('(');
            else if(str.charAt(i)==')'){
                while(st.peek()!='(')
                    postStr+=st.pop();
                st.pop();
            }
            else {
                while (!st.isEmpty() && map.get(str.charAt(i)) <= map.get(st.peek())) {
                    postStr+=st.pop();
                }
                st.push(str.charAt(i));
            }
        }
        while (!st.isEmpty())
            postStr+=st.pop();
        return postStr;
    }
    public Node Construct(String str){
        Stack<Node> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                st.push(new Node(str.charAt(i)));
            }
            else{
                Node r=st.pop();
                Node l=st.pop();
                Node nn=new Node(str.charAt(i));
                nn.left=l;
                nn.right=r;
                st.push(nn);
            }
        }
//        System.out.println(st);
        return st.peek();
    }
    private  void display(Node node){
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
    public static void main(String[] args) {
        String str="2-3/(5*2)+1";
        Build_Binary_Expression_Tree_From_Infix_Expression bt=new Build_Binary_Expression_Tree_From_Infix_Expression();
        bt.display(bt.Construct(bt.postfix(str)));
    }
}